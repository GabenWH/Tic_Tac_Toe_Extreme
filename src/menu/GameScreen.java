package menu;

import java.awt.image.BufferedImage;

public interface GameScreen 
extends Renderable{
public void setRez(int x, int y);
public BufferedImage show();
}
