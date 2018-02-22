package my.journaldev.visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		
		System.out.println("Total price is "+ total);
	}

	private static int calculatePrice(ItemElement[] items) {
		// TODO Auto-generated method stub
		ShoppingCartVisitor visitor=new ShoppingCartVisitor();
		int totalCost=0;
		for(ItemElement item: items) {
			totalCost+=item.accept(visitor);
		}
		
		return totalCost;
	}

}
