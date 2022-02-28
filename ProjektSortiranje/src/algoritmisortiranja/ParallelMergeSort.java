/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmisortiranja;

import java.util.concurrent.ForkJoinPool;
import projektsortiranje.PoljeSort;

/**
 *
 * @author martinaradenic
 */
public class ParallelMergeSort implements SortSucelje {
    
    private long korakOdgode = 20;
    

    @Override
    public void pokreniSortiranje(PoljeSort polje) {
        long time1 = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ParalelnoSortiranje(polje, 0, polje.velicinaPolja() - 1, korakOdgode));
        
        long time2 = System.currentTimeMillis(); 
        long time = time2 - time1; 
        System.out.println(time); 
        
    }

    @Override
    public String getIme() {
        return "Parallel Merge Sort";
    }

    @Override
    public long odgoda() {
        return korakOdgode;
    }

    @Override
    public void postaviOdgodu(long odgoda) {
        this.korakOdgode = odgoda;
    }

    
    
}
