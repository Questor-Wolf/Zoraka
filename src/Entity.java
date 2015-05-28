// The main class for any "THING" in the game
public class Entity implements Rules_E {
	private String name;
	private int weight;
	private int health;
	private int inventory;
	/**
	 * Constructs an Entity with <Strong>String</Strong> of Name <Strong>Int</Strong> of Weight <Strong>Int</Strong> of Health <Strong>Int</Strong> of total inventory slots.
	 * @param Name : The name of the entity
	 * @param Weight : Determines 
	 * @param Health : Hits until death
	 * @param Inventory : Number of items in inventory
	 */
	// Constructs Entities
	public Entity(String name, int weight, int health, int inventory) {
		this.name = name;
		this.weight = weight;
		this.health = health;
		this.inventory = inventory;
	}
	/**
	 * @return Returns the name of the Entity.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return Returns the current weight of the entity.
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @return Returns the Total health of the Entity.
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @return Returns the total inventory slots for the Entity.
	 */
	public int getInventory() {
		return inventory;
	}
	/**
	 * @param Sets the Health to an int x.
	 */
	public void setHealth(int x) {
		health = x;
	}
	/**
	 * @param Sets the Weight to an int x.
	 */
	public void setWeight(int x) {
		weight = x;
	}
}