package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class QuickSort implements SortSucelje{
    private long korakOdgode = 30;
    
    private int nadiPivot(PoljeSort polje, int donjiInd, int gornjiInd) {
        int pivotValue = polje.vrijednost(gornjiInd);
        int i = donjiInd - 1;
        for (int j = donjiInd; j <= gornjiInd - 1; j++) {
            if (polje.vrijednost(j) <= pivotValue) {
                i++;
                polje.swap(i, j, odgoda(), true);
            }
        }
        polje.swap(i + 1, gornjiInd, odgoda(), true);
        return i + 1;
    }

    private void quickSort(PoljeSort polje, int donjiInd, int gornjiInd) {
        if (donjiInd < gornjiInd) {
            int pivot = nadiPivot(polje, donjiInd, gornjiInd);
            quickSort(polje, donjiInd, pivot - 1);
            quickSort(polje, pivot + 1, gornjiInd);
        }
    }

    @Override public void pokreniSortiranje(PoljeSort polje) {
        long time1 = System.currentTimeMillis(); 
        
        quickSort(polje, 0, polje.velicinaPolja() - 1);
        
        long time2 = System.currentTimeMillis(); 
        long time = time2 - time1; 
        System.out.println(time); 
    }

    @Override public String getIme() {
        return "QuickSort";
    }

    @Override public long odgoda() {
        return korakOdgode;
    }

    @Override public void postaviOdgodu(long delay) {
        this.korakOdgode = delay;
    }
    
}
