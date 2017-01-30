import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class Bacteria extends Actor{

	private Location loc = null;
	
	public Bacteria()
	{
		setColor(Color.BLUE);
		int col, row = 0;
		boolean found = false; 
		while (row < getGrid().getNumRows() && !found) 
		{ 
			col = 0;
			while (col < getGrid().getNumCols() && !found) 
			{
				loc = new Location (row, col); 
				Actor a = getGrid().get(loc); 
				if (a != null && a instanceof Heart) 
				{ 
					found = true; 
				} 
				col++; 
			} 
			row++; 
		}
	}
	
	public void act()
	{
		setDirection(loc.getDirectionToward(loc));
		Location next = loc.getAdjacentLocation(getDirection());
		moveTo(next);
	}
	
}
