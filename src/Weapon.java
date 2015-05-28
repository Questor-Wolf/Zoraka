
public class Weapon extends Item {
	private int damage;
	private int rarity;
	public Weapon(String Name, int Weight, String Color, int Durability, int Damage, int Rarity) {
		super(Name, Weight, Color, Durability);
		setDamage(Damage);
		setRarity(Rarity);
	}
	public String action(){
		return "Swings";
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getRarity() {
		return rarity;
	}
	public void setRarity(int rarity) {
		this.rarity = rarity;
	}
	@Override
	public String toString(){
		return "A " + super.getName() + " with damage of " + damage + " with durability of " + super.getDura();
	}

}