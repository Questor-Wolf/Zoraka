
public class Enviroment {
	private String Type;
	private Entity[] Entities;
	private Item[] Items;
	public Enviroment(String type, Entity[] entities, Item[] items){
		setEntities(entities);
		setItems(items);
		setType(type);
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Entity[] getEntities() {
		return Entities;
	}
	public void setEntities(Entity[] entities) {
		Entities = entities;
	}
	public Item[] getItems() {
		return Items;
	}
	public void setItems(Item[] items) {
		Items = items;
	}
}