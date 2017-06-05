package virtualpetshelter.review;

public class VirtualPet {
	private String name;
	private int hunger;
	private int boredom;

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void feed() {
		hunger -= 5;
	}
	
	public void play() {
		boredom -= 5;
	}
	
	public void tick() {
		hunger += 5;
		boredom +=5;
	}
}
