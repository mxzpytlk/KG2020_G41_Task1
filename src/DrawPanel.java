import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Sun sun = new Sun(200, 200, 50, 100, 80, Color.ORANGE);
    private Background bg;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    DrawPanel() {
        try {
            this.bg = new Background(45);
        } catch (Exception ignored) {}
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        bg.draw(gr);
        sun.draw(gr);
        int treeCount = 30 + (int) (Math.random() * 60);
        for (int i = 0; i < treeCount; i++) {
            Wood tree = new Wood(70 + (int) (Math.random() * 155),
                    60 + (int) (Math.random() * 40),
                    30 + (int) (Math.random() * dim.width - 70),
                    (int) (dim.height * 0.55 + Math.random() * dim.height - 80));
            tree.draw(gr);
        }
        gr.setColor(Color.YELLOW);
        gr.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
        gr.drawString("Солнышко мое вставай", 400, 150);
    }
}
