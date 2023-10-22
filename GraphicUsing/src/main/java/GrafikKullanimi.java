
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel
{

    public GrafikKullanimi() 
    {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.red);
        
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        
        g.setColor(Color.blue);
        g.drawOval(200, 200, 30, 30);
        
        g.fill3DRect(400, 400, 30, 40, true);
        
        g.drawLine(100, 100, 300, 300);
    }
   
}
