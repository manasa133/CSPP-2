import java.util.*;
class Solution{
	public static void main(String[] args) {
		ShoppingCart shop = new ShoppingCart();
		Scanner sc  = new Scanner(System.in);
		int lines =  Integer.parseInt(sc.nextLine());
		for(int i =0;i<lines;i++){
			String[] input = sc.nextLine().split(" ");
			switch(input[0]){
				case "Item":
					String[] tokens1 = input[1].split(",");
					shop.addToCatalog(new Item(tokens1[0],tokens1[1],tokens1[2]));
				break;
				case "add":
					String[] tokens2 = input[1].split(",");
					shop.addToCart(new Item(tokens2[0],tokens2[1]));
				break;
				case "show":
				shop.showCart();
				break;
				case "catalog":
				shop.showCatalog();
				break;
				case "totalAmount":
				System.out.println("totalAmount: "+shop.totalAmount());
				break;
				case "remove":
				String[] tokens = input[1].split(",");
				shop.removeFromCart(new Item(tokens[0],tokens[1]));
				break;
				case "print":
				shop.printInvoice();
				break;
				case "payableAmount":
				System.out.println( shop.getPayableAmount());
				break;
				case "coupon":
				shop.applyDiscount(input[1]);
				break;


			}
		}
	}

}