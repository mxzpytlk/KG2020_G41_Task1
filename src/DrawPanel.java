import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Sun sun = new Sun(200, 300, 50, 120, 80, Color.ORANGE);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sun.draw(gr);
    }
}
