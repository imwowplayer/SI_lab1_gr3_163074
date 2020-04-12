class Receipt {
	
	List<Item> Items = new ArrayList()<Item>;
	
	public addItem(Item item){
		Items.add(item);
	}
	
	public DeleteItem(Item item){
		Items.remove(item);
	}
	
	public double Price(){
		double price = 0;
		foreach(Item i: Items){
			price += i.price;
		}
		return price;
	}
	
	public double receiptTax(){
		double finalTaxReturn = 0;
		foreach(Item i: Items){
			finalTaxReturn += i.taxReturn();
		}
		return finalTaxReturn;
	}
}