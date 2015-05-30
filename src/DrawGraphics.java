import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(100, 50, Color.RED);
        box1.setMovementVector(1, 0);
        box2 = new BouncingBox(150, 50, Color.BLUE);
        box2.setMovementVector(0, -1);
        box3 = new BouncingBox(200, 50, Color.BLACK);
        box3.setMovementVector(0, 1);
        boxes = new ArrayList<BouncingBox>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(10, 10, 30, 50);
        surface.drawOval(60, 60, 20, 20);
        for(BouncingBox b : boxes){
        	b.draw(surface);
        	
        }
    }
} 