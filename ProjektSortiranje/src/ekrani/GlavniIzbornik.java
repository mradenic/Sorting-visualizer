
package ekrani;

import algoritmisortiranja.BubbleSort;
import algoritmisortiranja.CountingSort;
import algoritmisortiranja.InsertionSort;
import algoritmisortiranja.IterativniMergeSort;
import algoritmisortiranja.MergeSort;
import algoritmisortiranja.ParallelMergeSort;
import algoritmisortiranja.QuickSort;
import algoritmisortiranja.SelectionSort;
import algoritmisortiranja.SortSucelje;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import projektsortiranje.ProjektSortiranje;


public class GlavniIzbornik extends Ekran{
    
    //izbori mogućih algoritama
    private ArrayList<IzborAlgoritama> checkboxes;
    //konstruktor
    public GlavniIzbornik(ProjektSortiranje apl)
    {
        super(apl);
        checkboxes = new ArrayList<>();
        postaviSucelje();
    }


    
    //dodat cemo funkciju za dodavanje checkboxa posto ce ih biti vise, za svaki sort jedan
    private void dodajCheckbox(SortSucelje algoritam, JPanel panel)
    {
        JCheckBox box = new JCheckBox("", true);
        //postavljanje vrijednost
        box.setBackground(Color.DARK_GRAY);
        box.setForeground(Color.WHITE);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        //dodavanje novog moguceg izbora
        checkboxes.add(new IzborAlgoritama(algoritam, box));
        //dodavanje na panel
        panel.add(box);
        
    }
    
    //pomoćna funkcija da ne moramo uvijek ručno postavljati layout i boju
    private void inicijalizacija(JPanel Panel)
    {
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
        Panel.setBackground(Color.DARK_GRAY);
    }
    
    public void postaviSucelje()
    {
        JPanel Panel = new JPanel();
        JPanel vanjski = new JPanel();
        inicijalizacija(this);
        inicijalizacija(Panel);
        
        //vanjski postavljamo ručno jer želimo drugačiji layout
        vanjski.setBackground(Color.DARK_GRAY);
        vanjski.setLayout(new BoxLayout(vanjski, BoxLayout.LINE_AXIS));
        
        
        //dodajemo popis svih algoritama
        Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        dodajCheckbox(new BubbleSort(), Panel);
        dodajCheckbox(new CountingSort(), Panel);
        dodajCheckbox(new InsertionSort(), Panel);
        dodajCheckbox(new IterativniMergeSort(), Panel);
        dodajCheckbox(new MergeSort(), Panel);
        dodajCheckbox(new ParallelMergeSort(), Panel);
        dodajCheckbox(new QuickSort(), Panel);
        dodajCheckbox(new SelectionSort(), Panel);
        //...
        
        JButton pocetak = new JButton("Sortiraj!");
        pocetak.addActionListener((ActionEvent e) -> {
            ArrayList<SortSucelje> odabrani = new ArrayList<>();
            for (IzborAlgoritama izbor : checkboxes)
                {
                    if( izbor.isSelected())
                    {
                        odabrani.add(izbor.algoritam());
                    }
                }
            aplikacija.pushEkran(new Vizualizator( odabrani, aplikacija));
        });
        
        pocetak.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //zelimo uvijek odredenu dimenziju
        vanjski.add(Box.createRigidArea(new Dimension(5,0)));
        vanjski.add(Panel);
        
        add(Box.createRigidArea(new Dimension(0,15)));
        add(vanjski);
        add(Box.createRigidArea(new Dimension(0,15)));
        add(pocetak);
    }
    
    
    
    //pri otvaranju svi checkboxes moraju biti odznaceni
    @Override
    public void otvori() {
        checkboxes.forEach((box) -> {
            box.unselect();
            
        });

    }
    //doraditi konstruktor
    private class IzborAlgoritama{
        private final JCheckBox box;
        //o kojem se algoritmu radi
        private final SortSucelje algoritam;
        
        public IzborAlgoritama(SortSucelje algoritam, JCheckBox box) {
            this.box = box;
            this.algoritam = algoritam;
            this.box.setText(algoritam.getIme());
        }
        
        public void unselect() {
            box.setSelected(false);
        }
     
        
        public boolean isSelected() {
            return box.isSelected();
        }
        
        public SortSucelje algoritam(){
            return algoritam;
        }
    }
    
}
