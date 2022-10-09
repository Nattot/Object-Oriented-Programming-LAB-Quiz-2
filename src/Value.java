
public class Value extends Meal {
	protected String Drink;
	protected String Carbs;
	
	public Value(String iD, String name, int phone, String type, int price, String notes, String drink, String carbs) {
		super(iD, name, phone, type, price, notes);
		Drink = drink;
		Carbs = carbs;
	}

	public String getDrink() {
		return Drink;
	}

	public void setDrink(String drink) {
		Drink = drink;
	}

	public String getCarbs() {
		return Carbs;
	}

	public void setCarbs(String carbs) {
		Carbs = carbs;
	}

	@Override
	public void Printmeal() {
		// TODO Auto-generated method stub
		System.out.println("| "+this.ID+" | "+this.Name+" | "+this.Phone+" | "+this.Type+" | "+this.Price+" | "+this.Notes+"  |");
	}
}
