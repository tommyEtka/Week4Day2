package InClassLab;

public class MagicUsingCharacters extends GameCharacter{
	
	private int magicEnergy;
	
	public MagicUsingCharacters(String name, int intelligence, int strength,
			int magicEnergy) {
		super(name, intelligence, strength);
		this.magicEnergy = magicEnergy;
	}

	public int getMagicEnergy() {
		return magicEnergy;
	}

	public void setMagicEnergy(int magicEnergy) {
		this.magicEnergy = magicEnergy;
	}
	
	
	
	
	

}
