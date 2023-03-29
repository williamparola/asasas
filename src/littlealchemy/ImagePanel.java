package littlealchemy;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    
    ImageIcon image = new ImageIcon();
    //"minuto 3:40"
    
    final int IMG_WIDTH = image.getIconWidth();
    final int IMG_HEIGHT = image.getIconHeight();
    
    Point image_corner;
    Point previusPoint;
    
    ImagePanel(){
        image_corner =
    }
    
    public void paintComponent(Graphics g){
        
    }
    
    private class ClickListener extends MouseAdapter{
        
    }
    
    private class DragListener extends MouseMotionAdapter{
        
    }
}
