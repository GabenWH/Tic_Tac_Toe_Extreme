package platformer;

import utilities.*;
import java.awt.Graphics;

public interface RenderableFundamental extends Renderable {
	public void renderDraw(Graphics g);
	public void renderFill(Graphics g);
	public double distanceFrom(Vector o);
}
