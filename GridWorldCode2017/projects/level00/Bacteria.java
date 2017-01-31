/*
 * Max Porter 1/31/2017
 * GridWorld Level 00
 */
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;


public class Bacteria extends Actor{

	private Location loc = null;
	ArrayList<Location> locs;
	boolean isDone = false;
	
	public Bacteria()
	{
		setColor(Color.BLUE);
	}
	
	public void act()
	{
			locs = getGrid().getOccupiedLocations();
			for(Location locate : locs)
			{
				Actor check = getGrid().get(locate);
				if(check instanceof Heart) loc = locate;
			}
			
			if(!isDone)
			{
				setDirection(getLocation().getDirectionToward(loc));
				Location next = getLocation().getAdjacentLocation(getDirection());
				moveTo(next);
			}
			
			for(Location endLoc : getGrid().getOccupiedAdjacentLocations(getLocation()))
			{
				Actor a = getGrid().get(endLoc);
				if(a instanceof Heart)
				{
					a.setColor(Color.BLACK);
					isDone = true;
				}
			}
	}
	
}
