package algoritmisortiranja;

import projektsortiranje.PoljeSort;

public class CountingSort implements SortSucelje{
    private long korakOdgode = 5;
	
	@Override public String getIme() 
	{
		return "Counting Sort";
	}

	@Override public long odgoda()
	{
		return korakOdgode;
	}

	@Override public void postaviOdgodu(long odgoda) 
	{		
		korakOdgode = odgoda;
	}

	@Override public void pokreniSortiranje(PoljeSort polje)
	{
            long time1 = System.currentTimeMillis(); 
		int[] rez = new int[polje.velicinaPolja()];
		int[] brojac = new int[polje.maxVrijednost()+1];		
		for(int i = 0; i < rez.length; ++i)
		{	
			polje.updateJednog(i, rez[i] = polje.vrijednost(i), odgoda(), false);		
			++brojac[polje.vrijednost(i)];
		}
		for(int i = 1; i < brojac.length; ++i)
			brojac[i] += brojac[i-1];
		for(int i = rez.length-1; i > -1; --i)
			polje.updateJednog(--brojac[rez[i]], rez[i], odgoda(), true);	
                
               long time2 = System.currentTimeMillis(); 
               long time = time2 - time1; 
               System.out.println(time); 
	}
    
}
