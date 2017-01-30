import info.gridworld.actor.ActorWorld;

public class level00Runner {

	public static void main(String[] args) {
		
		 ActorWorld world = new ActorWorld();
	        world.add(new Bacteria());
	        world.add(new Heart());
	        world.show();

	}

}
