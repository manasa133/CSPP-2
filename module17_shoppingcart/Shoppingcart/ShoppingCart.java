class ShoppingCart{
	Item[] catalog;
	Item[] cart;
	int cartSize;
	int catalogSize;
	String[] validCoupons ={"IND10","IND20","IND30","IND50"};
	static double discount =0.0;
	static boolean couponApplied = false;

	ShoppingCart(){
		catalog = new Item[20];
		cart = new Item[20];
		cartSize=0;
		catalogSize =0;
	}

	void addToCatalog(Item item){
		catalog[catalogSize++] = item;

	}
	void addToCart(Item item){
		if(!inCart(item)){
			if(checkCatalog(item)){
				cart[cartSize++] = item;
			}
		}
		else{

		}
	}
	// private boolean inCart(Item item){
	// 	for(int i =0 ; i< cartSize;i++){
	// 		if(cart[i].equals(item)){
	// 			cart[i].
	// 		}
	// 	}

	// }

	private boolean checkCatalog(Item given){
		for(Item i : catalog){
			if(i!=null){
				if(i.equals(given)){
					if(given.quantity<= i.quantity){
						i.quantity = i.quantity- given.quantity;
						return true;
					}

				}
			}
		}
		return false;
	}

	void removeFromCart(Item item){

	}
	void showCart(){
		for(Item i : cart){
			if(i!=null){
				System.out.println(i.name+" "+i.quantity);
			}
		}
	}
	void showCatalog(){
		for(Item i : catalog){
			if(i!=null){
				System.out.println(i);
			}
		}

	}
	double getTotalAmount(){
		double total=0;
		for(int i =0; i< cartSize;i++){
			total = cart[i].quantity * getPrice(cart[i]);
		}
		return total;

	}
	double getPrice(Item given){
		for(Item i : catalog){
			if(i!=null){
				if(i.equals(given)){
					return i.price;
				}
			}
		}
		return 0.0;
	}
	void applyCoupon(String cou){
		if(couponApplied){
			return;
		}
		boolean valid= false;
		for(String s : validCoupons){
			if(s.equals(cou)){
				valid = true;
			}
		}
		if(!valid){
			System.out.println("Invalid coupon");
			return;
		}
		for(String s : validCoupons){
			if(s.equals(cou)){
				int num =  Integer.parseInt(cou.substring(3));
				discount = getTotalAmount()*num/100;
				couponApplied = true;
				valid = true;
			}
		}


	}
	void printInvoice(){

	}
	void getPayableAmount(){


	}
}