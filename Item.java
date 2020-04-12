 
class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	Character tax_Type;

	//TODO constructor
	Item(int id, String name, double price, Character tax_Type){
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax_Type = tax_Type;
	}

	//TODO setters and getters
	public void setId(int newId){
		this.id = newId;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	public void setTaxType(Character newTaxType){
		this.tax_Type = newTaxType;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public Character getTaxType(){
		return tax_Type;
	}
	
	double taxReturn () { 
		//TODO
		if(tax_Type == 'A')
			return price * 0.18 * 0.15;
		else if(tax_Type == 'B')
			return price * 0.5 * 0.15;
		else if(tax_type == 'V')
			return 0;
	}
}