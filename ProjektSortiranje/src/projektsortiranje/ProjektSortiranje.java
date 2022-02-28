
package projektsortiranje;


import ekrani.Ekran;
import ekrani.GlavniIzbornik;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class ProjektSortiranje {
    private final JFrame prozor;
    
    public static final int PROZOR_SIRINA = 1280;
    public static final int PROZOR_VISINA = 720;
    
    private final ArrayList<Ekran> ekrani;
    
    public ProjektSortiranje() {
        ekrani = new ArrayList<>();
        prozor = new JFrame ("Sortiranje");
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.setVisible(true);
    }
    
    public Ekran getTrenutniEkran(){
        if (ekrani.size()!= 0) {
            return ekrani.get(ekrani.size()-1);
        }
        else
            return null;
       
    }
    
    public void pushEkran (Ekran ekran){
        if (!ekrani.isEmpty()){
            prozor.remove(getTrenutniEkran());
        }
        ekrani.add(ekran);
        prozor.setContentPane(ekran);
        prozor.validate();
        ekran.otvori();
    }
    
    public void popEkran(){
        if (!ekrani.isEmpty()){
            Ekran prosli = getTrenutniEkran();
            ekrani.remove(prosli);
            prozor.remove(prosli);
            if (!ekrani.isEmpty()){
                Ekran trenutni = getTrenutniEkran();
                prozor.setContentPane(trenutni);
                prozor.validate();
                trenutni.otvori();
            }
            else{
                prozor.dispose();
            }
        }
    }
    
    public void start() {
        pushEkran(new GlavniIzbornik(this));
        prozor.pack();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            new ProjektSortiranje().start(); //
        });
    }
    
}
