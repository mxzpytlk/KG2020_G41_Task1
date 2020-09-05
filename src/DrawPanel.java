import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Sun sun = new Sun(200, 200, 50, 100, 80, Color.ORANGE);
    private Background bg;

    DrawPanel() {
        try {
            this.bg = new Background(40);
        } catch (Exception ignored) {}
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        bg.draw(gr);
        sun.draw(gr);
    }
}
