/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import algoritmisortiranja.SortSucelje;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.SwingWorker;
import projektsortiranje.PoljeSort;
import projektsortiranje.ProjektSortiranje;

/**
 *
 * @author martinaradenic
 */
public class Vizualizator extends Ekran{
    private final PoljeSort polje;
    private final ArrayList<SortSucelje> kakoSortirati;
    
    public Vizualizator( ArrayList<SortSucelje> algoritmi, ProjektSortiranje apl){
        super(apl);
        polje = new PoljeSort();
        kakoSortirati = algoritmi;
        //postavljanje layouta
        setLayout(new BorderLayout());
        add(polje, BorderLayout.CENTER);
        
    }
    
    private void spavaj()
    {
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException exc)
        {
            exc.printStackTrace();
        }
    }
    
    private void pomijesaj()
    {
        polje.mijesanje();
        polje.resetBoje();
        spavaj();
    }
            

    @Override
    public void otvori() {
        //Swing worker koji spava, onda shuffle i pokrene sort
        SwingWorker<Void, Void> swingWorker = new SwingWorker<Void, Void>()
        {
            @Override
            protected Void doInBackground() throws Exception{
                try{
                    Thread.sleep(250);
                }
                catch(InterruptedException exc){
                    exc.printStackTrace();
                }
                
                for(SortSucelje algoritam : kakoSortirati)
                {
                    pomijesaj();
                    
                    polje.setName(algoritam.getIme());
                    polje.setAlgorithm(algoritam);
                    
                    algoritam.pokreniSortiranje(polje);
                    
                    polje.resetBoje();
                    polje.istakniPolje();
                    polje.resetBoje();
                    //spavaj
                }
                return null;
            }
            
            @Override
            public void done(){
                aplikacija.popEkran();
            }
        };
        
        swingWorker.execute();
    }
    
}
