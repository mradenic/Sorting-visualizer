
package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class MergeSort implements SortSucelje{
    private long korakOdgode = 20;
    
    private int[] getPotPolje(PoljeSort polje, int poc, int velicina) {
        int p[] = new int[velicina];
        for (int i = 0; i < velicina; i++) {
            p[i] = polje.vrijednost(poc + i);
        }
        return p;
    }

    private void merge(PoljeSort polje, int lijevo, int sredina, int desno) {
        int lijevoVel = sredina - lijevo + 1;
        int desnoVel = desno - sredina;

        int lijevoPolje[] = getPotPolje(polje, lijevo, lijevoVel);
        int desnoPolje[] = getPotPolje(polje, sredina + 1, desnoVel);

        int i = 0, j = 0, k = lijevo;
        while (i < lijevoVel && j < desnoVel) {
            if (lijevoPolje[i] <= desnoPolje[j]) {
                polje.updateJednog(k, lijevoPolje[i], odgoda(), true);
                i++;
            } else {
                polje.updateJednog(k, desnoPolje[j], odgoda(), true);
                j++;
            }
            k++;
        }

        while (i < lijevoVel) {
            polje.updateJednog(k, lijevoPolje[i], odgoda(), true);
            i++;
            k++;
        }

        while (j < desnoVel) {
            polje.updateJednog(k, desnoPolje[j], odgoda(), true);
            j++;
            k++;
        }
    }

    private void mergeSort(PoljeSort polje, int lijevo, int desno) {
        if (lijevo < desno) {
            int sredinaIndex = (lijevo + desno) / 2;

            mergeSort(polje, lijevo, sredinaIndex);
            mergeSort(polje, sredinaIndex + 1, desno);
            merge(polje, lijevo, sredinaIndex, desno);
        }
    }

    @Override public void pokreniSortiranje(PoljeSort polje) {
        long time1 = System.currentTimeMillis(); 
        int lijevo = 0;
        int desno = polje.velicinaPolja() - 1;
        mergeSort(polje, lijevo, desno);
        long time2 = System.currentTimeMillis(); 
        long time = time2 - time1; 
        System.out.println(time); 
    }

    @Override public String getIme() {
        return "Merge Sort";
    }

    @Override public long odgoda() {
        return korakOdgode;
    }

    @Override public void postaviOdgodu(long delay) {
        this.korakOdgode = delay;
    }
    
}