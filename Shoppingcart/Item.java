class Item{
	String itemName;
	int itemQuantity;
	double itemPrice;
	Item(String name,String qunat,String price){
		itemPrice = Double.parseDouble(price);
		itemQuantity = Integer.parseInt(qunat);
		itemName = name;
	}
	Item(String name,String qunat){
		itemQuantity = Integer.parseInt(qunat);
		itemName = name;
	}
	public boolean equals(Item other){
		if(!this.itemName.equals(other.itemName)){
			return false;
		}
		return true;
	}
	public String toString(){
		return this.itemName+" "+this.itemQuantity+" "+this.itemPrice;
	}
	public String toString1(){
		return this.itemName+" "+this.itemQuantity;
	}

}