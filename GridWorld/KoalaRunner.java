/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */

public class KoalaRunner extends KoalaGrid
{
	private static KoalaGrid world = new KoalaGrid();

    public static void main(String[] args)
    {
        int rowRock = (int)(Math.random()*rowSize) + 0;
        int colRock = (int)(Math.random()*colSize) + 0;
        int rowBomb = (int)(Math.random()*rowSize) + 0;
        int colBomb = (int)(Math.random()*colSize) + 0;
        Koala koalaOne = new Koala();
        Koala koalaTwo = new Koala();
        Rock rock = new Rock();
        Bomb bomb = new Bomb();
        world.add(new Location(3, 4), koalaOne);
        world.add(new Location(6, 7), koalaTwo);
        world.add(new Location(rowBomb, colBomb), bomb);
		world.add(new Location(rowRock, colRock), rock);
        world.show();
    }
}
