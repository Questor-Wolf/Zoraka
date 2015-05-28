
public class Player extends Entity{
	private int Damage;
	private String Description;
	public Player(String name, int weight, int health, int inventory, int damage, String description) {
		super(name, weight, health, inventory);
		setDamage(damage);
		setDescription(description);
	}
	public int getDamage() {
		return Damage;
	}
	public void setDamage(int damage) {
		Damage = damage;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
