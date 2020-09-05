import java.awt.*;

public class Background implements Drawable {
    private int percentageOfLand;

    Background(int percentageOfLand) throws Exception {
        if (percentageOfLand < 0 || percentageOfLand > 100)
            throw new Exception("Percent must be between 0 and 100");

        this.percentageOfLand = percentageOfLand;
    }

    @Override
    public void draw(Graphics2D gr) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        gr.setColor(Color.green);
        gr.fillRect(0, dim.height * (100 - percentageOfLand) / 100,
                dim.width, dim.height);

        gr.setColor(Color.cyan);
        gr.fillRect(0, 0, dim.width, dim.height * (100 - percentageOfLand) / 100);
    }
}
