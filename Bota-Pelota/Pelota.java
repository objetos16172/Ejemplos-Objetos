import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    
    public Pelota(int x, int y, int r)  
    {
        posx = x;
        posy = y;
        radio = r;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    // TAREA: Mover la pelota y hacer que rebote al llegar al borde
    public void muevete(Rectangle r)
    {
        /*
        System.out.println("Mueve pelota..."); 
        System.out.println("Tamaño de la ventana: " +
            r.getWidth() + ", " + r.getHeight());*/
    }
}
