class ShoppingCart{
	Item[] cart;
	Item[] catalog;
	int cartSize;
	int catalogSize;
	ShoppingCart(){
		cart = new Item[20];
		catalog = new Item[20];
		cartSize=0;
		catalogSize=0;
	}
	 void addToCart(Item item){
	 	System.out.println(checkQunatity(item));
	 	if(checkQunatity(item)){
	 		cart[cartSize++] = item;
	 		System.out.println("++++"+cart[cartSize-1]);
		 }
	 }
	 boolean checkQunatity(Item item){
	 	for(Item i : catalog){
	 		if(i!=null){
	 			if(item.equals(i)){
	 				System.out.println(item.itemQuantity+"-"+i.itemQuantity);
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
	 	for(index =0;index<cartSize;index++){
	 		if(item.equals(cart[index])){
	 			break;
	 		}
	 	}
	 	for(int i =index;i<cartSize-1;i++){
	 		cart[i]=cart[i+1];
	 	}
	 	cartSize--;
	 }

	 void printInvoice(){

	 }
	 void showCart(){
	 	for(Item i : cart){
	 		if(i!=null){
	 			System.out.println(i.toString1());
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
	 void totalAmount(){
	 	double total=0;
	 	for(Item i: cart){
	 		if(i!=null){
	 			total+= getPrice(i)*i.itemQuantity;
	 		}
	 	}
	 	System.out.println("totalAmount: "+total);

	 }

}