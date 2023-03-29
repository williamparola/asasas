package littlealchemy;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setTitle("didattico");
        this.setLocationRelativeTo(null);
        
        ImagePanel image_panel = new ImagePanel();
        this.add(image_panel);
        
        this.setVisible(true);
    }
}
