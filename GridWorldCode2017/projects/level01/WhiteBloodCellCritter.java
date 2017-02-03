import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class WhiteBloodCellCritter extends Critter{
	
	public WhiteBloodCellCritter()
	{
		setColor(Color.YELLOW);
	}
	
	public ArrayList<Actor> getActors()
	{
		return null;
	}
	
	public void processActors()
	{
		//Do nothing
	}
	
	public ArrayList<Location> getMoveLocations()
	{ 
		// get the empty adjacent cells 
		// remove locations that are outside its realm, (5x5 grid) 
		// return the array
		return null; //TO BE REMOVED LATER
	}

}
