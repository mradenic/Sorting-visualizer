package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class InsertionSort implements SortSucelje{
    private long korakOdgode = 1;
  
    @Override public void pokreniSortiranje(PoljeSort polje) {
        long time1 = System.currentTimeMillis(); 
        for (int i = 0; i < polje.velicinaPolja(); i++) {
            int kljuc = polje.vrijednost(i);
            int j = i - 1;
            while (j >= 0 && polje.vrijednost(j) > kljuc) {
                polje.updateJednog(j + 1, polje.vrijednost(j), 5, true);
                j--;
            }
            polje.updateJednog(j + 1, kljuc, odgoda(), true);
        }
        long time2 = System.currentTimeMillis(); 
        long time = time2 - time1; 
        System.out.println(time); 
    }

    @Override public String getIme() {
        return "Insertion Sort";
    }

    @Override public long odgoda() {
        return korakOdgode;
    }

    @Override public void postaviOdgodu(long odgoda) {
        this.korakOdgode = odgoda;
    }
    
}
