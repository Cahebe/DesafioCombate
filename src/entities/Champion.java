package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	// Constructors
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}
	

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	// Methods

	public void takeDamage(Champion champion) {
		if (this.armor > champion.attack) {
			this.life -= 1;
		} else {
			this.life -= champion.attack - this.armor;
		}
	}

	public String status() {
		if (life <= 0) {
			return name + ": 0 de vida (Morreu)";
		} else {
			return name + ": " + life + " de vida";
		}
	}
}
