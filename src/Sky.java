import java.awt.*;

public class Sky implements Drawable{
    private int x, y, r;

    Sky(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(Color.WHITE);
        gr.fillOval((int) (x + r * 0.5), (int) (y - r * 0.7), (int) ((r + r) * 0.9), (int) ((r + r) * 0.9));
        gr.setColor(Color.BLACK);
        gr.drawOval((int) (x + r * 0.5), (int) (y - r * 0.7), (int) ((r + r) * 0.9), (int) ((r + r) * 0.9));

        gr.setColor(Color.WHITE);
        gr.fillOval((int) (x - r * 0.5), (int) (y - r * 0.65), (int) ((r + r) * 0.9), (int) ((r + r) * 0.9));
        gr.setColor(Color.BLACK);
        gr.drawOval((int) (x - r * 0.5), (int) (y - r * 0.65), (int) ((r + r) * 0.9), (int) ((r + r) * 0.9));

        gr.setColor(Color.WHITE);
        gr.fillOval((int) (x + r * 1.2), y, (int) ((r + r) * 0.95), (int) ((r + r) * 0.95));
        gr.setColor(Color.BLACK);
        gr.drawOval((int) (x + r * 1.2), y, (int) ((r + r) * 0.95), (int) ((r + r) * 0.95));

        gr.setColor(Color.WHITE);
        gr.fillOval((int) (x - r * 0.8), y, (int) ((r + r) * 0.9), (int) ((r + r) * 0.85));
        gr.setColor(Color.BLACK);
        gr.drawOval((int) (x - r * 0.8), y, (int) ((r + r) * 0.9), (int) ((r + r) * 0.85));

        gr.setColor(Color.WHITE);
        gr.fillOval(x, y, r + r, r + r);
        gr.setColor(Color.BLACK);
        gr.drawOval(x, y, r + r, r + r);
    }
}
