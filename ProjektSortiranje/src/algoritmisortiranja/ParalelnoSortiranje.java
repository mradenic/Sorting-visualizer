/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmisortiranja;

import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveAction;
import projektsortiranje.PoljeSort;

/**
 *
 * @author martinaradenic
 */
public class ParalelnoSortiranje extends RecursiveAction{
    
    private final long korakOdgode;
    private final PoljeSort polje;
    private final int manji;
    private final int veci;
 
    public ParalelnoSortiranje(PoljeSort polje, int manji, int veci, long korakOdgode) {
        this.polje = polje;
        this.manji = manji;
        this.veci = veci;
        this.korakOdgode = korakOdgode;
    }
 
    @Override
    protected void compute() {
    
        if (veci - manji < 2) {
            if (polje.vrijednost(manji) >= polje.vrijednost(veci) ) {
                polje.swap(manji, veci, korakOdgode, true);
            }
        } else if (manji < veci) {
            int sredina = (manji + veci) / 2;
            invokeAll(new ParalelnoSortiranje(polje, manji, sredina, korakOdgode), 
                    new ParalelnoSortiranje(polje, sredina + 1, veci, korakOdgode));
            merge(polje, manji, sredina, veci);
        }
        
    }
    
    private int[] getSubArray(PoljeSort polje, int pocetak, int velicina) {
        int pom[] = new int[velicina];
        for (int i = 0; i < velicina; i++) {
            pom[i] = polje.vrijednost(pocetak + i);
        }
        return pom;
    }
 
    private void merge(PoljeSort polje, int lijevo, int sredina, int desno) {
        int VelicinaL = sredina - lijevo + 1;
        int VelicinaD = desno - sredina;

        int lijevoPolje[] = getSubArray(polje, lijevo, VelicinaL);
        int desnoPolje[] = getSubArray(polje, sredina + 1, VelicinaD);

        int i = 0, j = 0, k = lijevo;
        while (i < VelicinaL && j < VelicinaD) {
            if (lijevoPolje[i] <= desnoPolje[j]) {
                polje.updateJednog(k, lijevoPolje[i], korakOdgode, true);
                i++;
            } else {
                polje.updateJednog(k, desnoPolje[j], korakOdgode, true);
                j++;
            }
            k++;
        }

        while (i < VelicinaL) {
            polje.updateJednog(k, lijevoPolje[i], korakOdgode, true);
            i++;
            k++;
        }

        while (j < VelicinaD) {
            polje.updateJednog(k, desnoPolje[j], korakOdgode, true);
            j++;
            k++;
        }
    }
    
}
