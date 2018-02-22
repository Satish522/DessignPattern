package my.journaldev.visitor;

public class ShoppingCartVisitor implements Visitor {

	@Override
	public int visit(ItemElement items) {
		// TODO Auto-generated method stub
		if(items instanceof Book) {
			int cost=((Book)items).getPrice();
			System.out.println("Book ISBN::"+((Book)items).getIsbnNumber() + " cost ="+cost);
			return cost;
			
		}else if(items instanceof Fruit) {
			int cost = ((Fruit)items).getPricePerKg()*((Fruit)items).getWeight();
			System.out.println(((Fruit)items).getName() + " cost = "+cost);
			return cost;
		}
		return 0;
	}

}
