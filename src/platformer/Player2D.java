package platformer;

import utilities.*;

public abstract class Player2D extends Player {
	public Player2D(int x, int y) {
		super(new Vector(x, y), new Vector(3, 5));
	}

	public void onUpdate() {
		super.onUpdate();
	}

	public void interactsWith(GameObject args) {}

	public boolean isA(String s) {
		return super.isA(s);
	}
}
