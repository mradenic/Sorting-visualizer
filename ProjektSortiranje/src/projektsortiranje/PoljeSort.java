
package projektsortiranje;

import algoritmisortiranja.SortSucelje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JPanel;


public class PoljeSort extends JPanel{
    public static final int DEFAULT_PROZOR_SIRINA = 1280;
    public static final int DEFAULT_PROZOR_VISINA = 720;
    private static final int DEFAULT_STUPCI_SIRINA = 5;
   
    private static final double STUPAC_VISINA_POSTOTAK = 512.0/720.0;
    private static final int BROJ_STUPACA = DEFAULT_PROZOR_SIRINA / DEFAULT_STUPCI_SIRINA;
    
    private final int[] polje;
    private final int[] stupacBoja;
    private String imeAlgoritma = "";
    
    private SortSucelje algoritam;

  
    private long delay = 0;
    

    private int promjenePolja = 0; 

    public PoljeSort() {
        setBackground(Color.DARK_GRAY);
        polje = new int[BROJ_STUPACA];
        stupacBoja = new int[BROJ_STUPACA];
        for (int i = 0; i < BROJ_STUPACA; i++) {
            polje[i] = i;
            stupacBoja[i] = 0;
        }

    }
    
    
    public int velicinaPolja() {
        return polje.length;
    }
    
    public int vrijednost(int index) {
        return polje[index];
    }
    
    public int maxVrijednost() {
        return Arrays.stream(polje).max().orElse(Integer.MIN_VALUE);
    }
    
    private void finalUpdate (int vrijednost, long milisekunde, boolean korak){
        repaint();
        try {
            Thread.sleep(milisekunde);
        }catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        if (korak)
              promjenePolja++;
    }
    
    public void swap (int prviIndeks, int drugiIndeks, long milisekunde, boolean korak) {
        int temp = polje[prviIndeks];
        polje[prviIndeks] = polje[drugiIndeks];
        polje[drugiIndeks] = temp;
        
        stupacBoja[prviIndeks] = 100;
        stupacBoja[drugiIndeks] = 100;
        
        finalUpdate ((polje[prviIndeks] + polje[drugiIndeks]) / 2, milisekunde, korak);
    }
    
    public void updateJednog (int indeks, int vrijednost, long milisekunde, boolean korak) {
        polje[indeks] = vrijednost;
        stupacBoja[indeks] = 100;
        
        finalUpdate(vrijednost, milisekunde, korak);
        repaint();
    }
    
    public void mijesanje() {
        promjenePolja = 0;
        Random rng = new Random();
        for ( int i = 0; i < velicinaPolja(); i++) {
            int swapIndeks = rng.nextInt(velicinaPolja()-1);
            swap (i, swapIndeks, 5, false);
        }
        promjenePolja = 0;
    }
    
    public void istakniPolje() {
        for (int i = 0; i < velicinaPolja(); i++){
            updateJednog(i, vrijednost(i), 5, false);
        }
    }
    
        @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_PROZOR_SIRINA, DEFAULT_PROZOR_VISINA);
    }
    
    public void resetBoje() {
        for (int i = 0; i < BROJ_STUPACA; i++) {
            stupacBoja[i] = 0;
        }
        repaint();
    }
    
        @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        Graphics2D panelGraphics = (Graphics2D) g.create();
        
        try{
            Map<RenderingHints.Key, Object> renderingHints = new HashMap<>();
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            panelGraphics.addRenderingHints(renderingHints);
			panelGraphics.setColor(Color.WHITE);
			panelGraphics.setFont(new Font("Monospaced", Font.BOLD, 20));
			panelGraphics.drawString(" Trenutni algoitam: " + imeAlgoritma, 10, 30);
			panelGraphics.drawString(" Promjene u polju: " + promjenePolja, 10, 80);

			crtajBarove(panelGraphics);
		} finally {
        	panelGraphics.dispose();
        }
    }
    
    private void crtajBarove(Graphics2D panelGraphics) {
        int barSirina = getWidth() / BROJ_STUPACA;
		int bufferedImageSirina = barSirina * BROJ_STUPACA;
		int bufferedImageVisina = getHeight();
        
		if(bufferedImageVisina > 0 && bufferedImageSirina > 0) {
			if(bufferedImageSirina < 256) {
				bufferedImageSirina = 256;
			}
			
			double maxVrijednost = maxVrijednost();
		
			BufferedImage bufferedImage = new BufferedImage(bufferedImageSirina, bufferedImageVisina, BufferedImage.TYPE_INT_ARGB);
			Graphics2D bufferedGraphics = null;
			try
			{
				bufferedGraphics = bufferedImage.createGraphics();
				
				for (int x = 0; x < BROJ_STUPACA; x++) {
					double trenutnaVrijednost = vrijednost(x);
					double postotakOdMax = trenutnaVrijednost / maxVrijednost;
					double visinaPostotakPloce = postotakOdMax * STUPAC_VISINA_POSTOTAK;
					int visina = (int) (visinaPostotakPloce * (double) getHeight());
					int xPocetak = x + (barSirina - 1) * x;
					int yPocetak = getHeight() - visina;
					
					int val = stupacBoja[x] * 2;
					if (val > 190) {
						bufferedGraphics.setColor(new Color(255 - val, 255, 255 - val));
					}
					else {
						bufferedGraphics.setColor(new Color(255, 255 - val, 255 - val));
					}
					bufferedGraphics.fillRect(xPocetak, yPocetak, barSirina, visina);
					if (stupacBoja[x] > 0) {
						stupacBoja[x] -= 5;
					}
				}
			}
			finally
			{
				if(bufferedGraphics != null)
				{
					bufferedGraphics.dispose();
				}
			}
			
			panelGraphics.drawImage(bufferedImage, 0, 0, getWidth(), getHeight(), 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
		} 
    }
    
    
        @Override
    public void setName(String imeAlgoritma) {
        this.imeAlgoritma = imeAlgoritma;
    }
    
    public void setAlgorithm(SortSucelje algoritam) {
        this.algoritam = algoritam;
        delay = algoritam.odgoda();
    }
    public long odgodaAlgoritma(){
        return delay;
    }
}


