package platformer;

import java.awt.Color;
import utilities.*;
import java.awt.Graphics;
import java.util.ArrayList;

public class Enemy_Smash extends Collidable {
	private Vector flySpeed = new Vector(1, 0);
	
	public Enemy_Smash(Vector position, Vector size, Vector offset) {
		super(position, size, offset);
	}

	public void onUpdate() {
		Player player = (Player) GameControl.instance().getAll("Player").get(0);
		double playerX = player.position.getComponent(CoordinateAxis.x);
		double thisX = position.getComponent(CoordinateAxis.x);
		if(Math.abs(playerX - thisX) < 10) {
			// TODO SMASH
		} else if(playerX > thisX) {
			position = position.plus(flySpeed);
		} else {
			position = position.minus(flySpeed);
		}
		
		ArrayList<GameObject> projectiles = GameControl.instance().getAll("Friendly Projectile");
		for(GameObject object : projectiles) {
			Projectile projectile = (Projectile)object;
			if(projectile.doesIntersectWith(this)) {
				GameControl.instance().removeObject(this);
			}
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		drawCollisionMask(g);
	}

	public void interactsWith(GameObject args) {}
}
