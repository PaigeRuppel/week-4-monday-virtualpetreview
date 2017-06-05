package virtualpetshelter.review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetCenter {

	// map is the general type (it's an *interface*)
	// HashMap is the specific (concrete) type
	private Map<String, VirtualPet> petsByName = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> pets() {
		return petsByName.values();
	}

	public VirtualPet getPet(String name) {
		return petsByName.get(name);
	}

	// add pets to the shelter
	public void intake(VirtualPet pet) {
		petsByName.put(pet.getName(), pet);
	}

	public void adopt(VirtualPet pet) {
		petsByName.remove(pet.getName());
	}

	public void feedPets() {
		for (VirtualPet pet : pets()) {
			pet.feed();
		}
	}
	
	public void playWith(String pet) {
		getPet(pet).play();
	}
	
	public void tick() {
		for(VirtualPet pet: pets()) {
			pet.tick();
		}
	}
}
