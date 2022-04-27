import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;

public class KoalaGrid extends ActorWorld {
	public static final int rowSize = 15;
    public static final int colSize = 15;

     public KoalaGrid() {
		 super(new BoundedGrid<Actor>(rowSize, colSize));
    }
}