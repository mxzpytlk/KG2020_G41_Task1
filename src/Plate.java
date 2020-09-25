import java.awt.*;

public class Plate implements Drawable {
    private final int h = 40;
    private int x, y;
    private String string;

    Plate(int x, int y, String string) {
        this.x = x;
        this.y = y;
        this.string = string;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(0x714500));
        gr.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 22));
        gr.fillRect(x, y, string.length() * 12 + 10, h);

        gr.fillRect(x + string.length() * 6, y + h, 10,
                Toolkit.getDefaultToolkit().getScreenSize().height - y);
        gr.setColor(Color.WHITE);
        gr.drawString(string, x + 10, y + 25);
    }
}
