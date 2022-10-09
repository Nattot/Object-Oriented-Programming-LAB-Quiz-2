
public abstract class Meal {
	protected String ID;
	protected String Name;
	protected int Phone;
	protected String Type;
	protected int Price;
	protected String Notes;
	
	public Meal(String iD, String name, int phone, String type, int price, String notes) {
		super();
		ID = iD;
		Name = name;
		Phone = phone;
		Type = type;
		Price = price;
		Notes = notes;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}
	
	public abstract void Printmeal();
}
