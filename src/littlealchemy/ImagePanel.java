package littlealchemy;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    
    ImageIcon image = new ImageIcon("fuocoMoltoBello.png");
    ImageIcon imageT = new ImageIcon("skull.JPG");
    //"minuto 3:40"
    // anche 5
    
    final int IMG_WIDTH = image.getIconWidth();
    final int IMG_HEIGHT = image.getIconHeight();
    final int IMG_WIDTH_T = imageT.getIconWidth();
    final int IMG_HEIGHT_T = imageT.getIconHeight();
    
    Point image_corner;
    Point image_cornerT;
    Point previousPoint;
    Point previousPointT;
    
    ImagePanel(){
        image_corner = new Point(0,0);
        image_cornerT = new Point(500,0);
        
        ClickListener clickListener = new ClickListener();
        this.addMouseListener(clickListener);
        
        DragListener dragListener = new DragListener();
        this.addMouseMotionListener(dragListener);
    }
    
    public void paintComponent(Graphics g){
        //Graphics g1 = null;
        
        super.paintComponent(g);
        //super.paintComponent(g1);
        image.paintIcon(this, g, (int)image_corner.getX(), (int)image_corner.getY());
        
        imageT.paintIcon(this, g, (int)image_cornerT.getX(), (int)image_cornerT.getY());
    }
    
    private class ClickListener extends MouseAdapter{
        
        public void mousePressed(MouseEvent evt){
            previousPoint = evt.getPoint();
            previousPointT = evt.getPoint();
        }
    }
    
    private class DragListener extends MouseMotionAdapter{
        
        public void mouseDragged(MouseEvent evt) {
            Point currentPoint = evt.getPoint();
            Point currentPointT = evt.getPoint();
            image_corner.translate(
                    (int)(currentPoint.getX() - previousPoint.getX()),
                    (int)(currentPoint.getY() - previousPoint.getY())
            );
            image_cornerT.translate(
                    (int)(currentPointT.getX() - previousPointT.getX()),
                    (int)(currentPointT.getY() - previousPointT.getY())
            );
            previousPoint=currentPoint;
            previousPointT=currentPointT;
            repaint();
        }
    }
}
