
public class Enemy extends Entity{
	private int Damage;
	private String Description;
	public Enemy(String name, int weight, int health, int inventory, int damage, String descrption) {
		super(name, weight, health, inventory);
		setDamage(damage);
		
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