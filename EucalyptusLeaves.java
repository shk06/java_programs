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

import info.gridworld.actor.Actor;

import java.awt.Color;

/**
 * A <code>Flower</code> is an actor that darkens over time. Some actors drop
 * flowers as they move. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */

public class EucalyptusLeaves extends Actor
{
    private static final Color DEFAULT_COLOR = Color.PINK;
    private int randomNumber;

    // lose 5% of color value in each step

    /**
     * Constructs a pink flower.
     */
    public EucalyptusLeaves()
    {
        setColor(null);
    }

    /**
     * Causes the color of this flower to darken.
     */
    public void act()
    {
    }
}