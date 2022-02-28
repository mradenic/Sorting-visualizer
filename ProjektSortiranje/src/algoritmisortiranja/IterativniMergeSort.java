package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class IterativniMergeSort implements SortSucelje{
    private long korakOdgode = 5;
	
	@Override public void pokreniSortiranje(PoljeSort polje) 
	{
                long time1 = System.currentTimeMillis(); 
		for(int exp = 1; exp < polje.velicinaPolja(); exp <<= 1)
			for(int k = 0, j = exp+exp, s = polje.velicinaPolja()-exp; k<s; k+=j)
				merge(polje, k, exp);
                long time2 = System.currentTimeMillis(); 
                long time = time2 - time1; 
                System.out.println(time); 
	}
	
	private int[] getPotPolje(PoljeSort polje, int poc, int kraj)
	{
		int vel = kraj - poc;
		int p[] = new int[vel];
		for (int i = 0; i < vel; i++) 
			p[i] = polje.vrijednost(poc + i);		
		return p;
	}
	
	private void merge(PoljeSort p, int poc, int exp)
	{
		int s = poc;
		int m = poc + exp;
		int kraj = (p.velicinaPolja() < m+exp) ? p.velicinaPolja() : m + exp;				
		int[] lijevoPolje = getPotPolje(p, s, m);
		int[] desnoPolje = getPotPolje(p, m, kraj);
		int i = 0, j = 0;
		while(i < lijevoPolje.length && j < desnoPolje.length)
			if(lijevoPolje[i] <= desnoPolje[j])
				p.updateJednog(poc++, lijevoPolje[i++], odgoda(), true);
			else
				p.updateJednog(poc++, desnoPolje[j++], odgoda(), true);
		while (i < lijevoPolje.length)
			p.updateJednog(poc++, lijevoPolje[i++], odgoda(), true);
		while (j < lijevoPolje.length)
			p.updateJednog(poc++, desnoPolje[j++], odgoda(), true);		
	}	

	@Override public String getIme() {
		return "Iterativni Merge Sort";
	}

	@Override public long odgoda() {
		return korakOdgode;
	}

	@Override public void postaviOdgodu(long odgoda) {
		this.korakOdgode = odgoda;
	}
    
}
