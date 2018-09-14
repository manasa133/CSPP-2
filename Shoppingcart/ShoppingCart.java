class ShoppingCart{
	Item[] cart;
	Item[] catalog;
	int cartSize;
	int catalogSize;
	boolean coupen = false;
	static double discount =0.0;
	String[] coupens={"IND10","IND20","IND30","IND50"};
	ShoppingCart(){
		cart = new Item[20];
		catalog = new Item[20];
		cartSize=0;
		catalogSize=0;
	}

	 void addToCart(Item item){
	 	//System.out.println(checkQunatity(item));
	 	if(checkQunatity(item)){
	 		cart[cartSize++] = item;
	 		//System.out.println("++++"+cart[cartSize-1]);
		 }
	 }
	 boolean checkQunatity(Item item){
	 	for(Item i : catalog){
	 		if(i!=null){
	 			if(i.equals(item)){
	 				//System.out.println(item.itemQuantity+"-"+i.itemQuantity);
	 				if(item.itemQuantity<=i.itemQuantity){
	 					i.itemQuantity = i.itemQuantity - item.itemQuantity;
	 					return true;
	 				}
	 			}
	 		}
	 	}
	 	return false;
	 }
	 void addToCatalog(Item item){
	 	catalog[catalogSize++] = item;
	 }
	 void removeFromCart(Item item){
	 	int index;
	 	int inittialQuat=0;
	 	for(index =0;index<cartSize;index++){
	 		if(item.equals(cart[index])){

	 			cart[index].itemQuantity = cart[index].itemQuantity-item.itemQuantity;
	 		}
	 	}
	 	// for(int i =index;i<cartSize-1;i++){
	 	// 	cart[i]=cart[i+1];
	 	// }
	 	// cartSize--;
	 }

	 void printInvoice(){
	 	System.out.println("Name   quantity   Price");
	 	for(Item i : cart){
	 		if(i!=null){
	 			System.out.println(i.toString1()+" "+getPrice(i));
	 		}
	 	}
	 	double total=totalAmount();
	 	System.out.println("totalAmount: "+total);
	 	System.out.println("Total:"+total);
	 	System.out.println("Disc%:"+discount);
	 	//applyDiscount();
	 	System.out.println("Tax:" +(0.15)*total);
	 	payableAmount();
	 }
	 void applyDiscount(String cou){
	 	boolean valid = false;
	 	double dis=0.0;
	 	for(int i =0;i< coupens.length; i++){
	 		if(cou.equals(coupens[i])){
	 			coupen = true;
	 			//System.out.println("DDDDDD"+Integer.parseInt(cou.substring(3)));
	 			int num = Integer.parseInt(cou.substring(3));
	 			dis = num/100.0;
	 			//System.out.println("****"+dis);
	 			dis = dis*totalAmount();
	 			//System.out.println("****"+dis);
	 			coupens[i]=null;
	 		}
	 	}
	 	discount = dis;

	 }
	 void payableAmount(){
	 	double total = totalAmount();
	 	double dis = discount;
	 	double tax = (0.15)*(total-dis);
	 	System.out.println("Payable amount: "+(total+tax));
	 }

	 void showCart(){
	 	for(Item i : cart){
	 		if(i!=null){
	 			if(i.itemQuantity!=0){
	 				System.out.println(i.toString1());
	 			}
	 		}
	 	}
	 }
	 double getPrice(Item given){
	 	for(Item i : catalog){
	 		if(i.equals(given)){
	 			return i.itemPrice;
	 		}
	 	}
	 return 0.0;
	 }
	 void showCatalog(){
	 	for(Item i : catalog){
	 		if(i!=null){
	 			System.out.println(i);
	 		}
	 	}

	 }
	 double totalAmount(){
	 	double total=0;
	 	for(Item i: cart){
	 		if(i!=null){
	 			total+= getPrice(i)*i.itemQuantity;
	 		}
	 	}
	 	//System.out.println("totalAmount: "+total);
	 	return total;

	 }



}