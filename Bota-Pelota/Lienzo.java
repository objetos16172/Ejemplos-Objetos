import javax.swing.JPanel;
import java.awt.Graphics;


public class Lienzo extends JPanel // implements KeyListener
{
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota = new Pelota(100, 100, 10);
    }
    
    public void actua()
    {
        pelota.muevete(this.getBounds());
        this.repaint();
    }    
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}
