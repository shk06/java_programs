import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Bomb extends Actor {

	private static final Color DEFAULT_COLOR = Color.ORANGE;

	public Bomb()
	{
		setColor(null);
    }

    public Bomb(Color bombColor)
	{
		setColor(bombColor);
    }

    public void act() {
	}
}
