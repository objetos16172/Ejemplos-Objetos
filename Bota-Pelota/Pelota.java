import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int incx;
    private int incy;
    
    public Pelota(int x, int y, int r)  
    {
        posx = x;
        posy = y;
        radio = r;
        int aleatorioX = (int)(Math.random()*2);
        if (aleatorioX == 0) {
            aleatorioX = -1;
        }
        int aleatorioY = (int)(Math.random()*2);
        if (aleatorioY == 0) {
            aleatorioY = -1;
        }
        System.out.println(aleatorioX + ", " + aleatorioY);
        incx = aleatorioX*10;
        incy = aleatorioY*10;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        if (posx+incx > r.getWidth() || posx < 0)    {
            incx = -incx;
        }
        if (posy+incy > r.getHeight() || posy < 0) {
            incy = -incy;
        }
        posx += incx;
        posy += incy;
    }
}
