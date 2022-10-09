
public class Kids extends Meal{
	protected String Toy;
	protected String Shake;
	
	public Kids(String iD, String name, int phone, String type, int price, String notes, String toy, String shake) {
		super(iD, name, phone, type, price, notes);
		Toy = toy;
		Shake = shake;
	}

	public String getToy() {
		return Toy;
	}

	public void setToy(String toy) {
		Toy = toy;
	}

	public String getShake() {
		return Shake;
	}

	public void setShake(String shake) {
		Shake = shake;
	}

	@Override
	public void Printmeal() {
		// TODO Auto-generated method stub
		System.out.println("| "+this.ID+" | "+this.Name+" | "+this.Phone+" | "+this.Type+" | "+this.Price+" | "+this.Notes+" |");
	}

}
