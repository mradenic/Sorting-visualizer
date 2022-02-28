/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekrani;

import java.awt.Dimension;
import javax.swing.JPanel;
import projektsortiranje.ProjektSortiranje;
import static projektsortiranje.ProjektSortiranje.PROZOR_SIRINA;
import static projektsortiranje.ProjektSortiranje.PROZOR_VISINA;

/**
 *
 * @author martinaradenic
 */
public abstract class Ekran extends JPanel{
    protected ProjektSortiranje aplikacija;
    
    //konstruktor
    public Ekran(ProjektSortiranje apl)
    {
        this.aplikacija = apl;
    }
    
    //postavljanje preferirane visine i širine prozora
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(PROZOR_SIRINA, PROZOR_VISINA);
    }
    
    public abstract void otvori();
}
