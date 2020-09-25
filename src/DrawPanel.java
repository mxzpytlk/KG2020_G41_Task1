import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

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

        int skyCount = (int) (Math.random() * 15);

        for (int i = 0; i < skyCount; i++) {
            Sky sky = new Sky((int) (Math.random() * dim.width),
                    (int) (Math.random() * dim.height * 0.4),
                    20 + (int) (Math.random() * 20));
            sky.draw(gr);
        }
//        Sky sky = new Sky((int) (Math.random() * dim.width),
//                (int) (Math.random() * dim.height * 0.4),
//                30 + (int) (Math.random() * 10));
//        sky.draw(gr);


        int treeCount = 30 + (int) (Math.random() * 60);

        Wood[] woods = new Wood[treeCount];
        for (int i = 0; i < woods.length; i++) {
            Wood tree = new Wood(70 + (int) (Math.random() * 155),
                    60 + (int) (Math.random() * 40),
                    30 + (int) (Math.random() * dim.width - 70),
                    (int) (dim.height * 0.55 + Math.random() * dim.height - 80));
            woods[i] = tree;
        }

        Arrays.sort(woods);
        for (Wood wood : woods)
            wood.draw(gr);
    }
}
