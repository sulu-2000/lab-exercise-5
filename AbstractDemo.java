package labExercise4;

abstract class Item{
	public abstract int cost();	
}
abstract class Cream extends Item{
	
}
abstract class Ingredients extends Item{
	
}
class Vanilla extends Cream{
	Item item;
	public Vanilla() {
	}
	public Vanilla(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) {
			return 10;
		}
		else {
			return 10+item.cost();
		}
	}
	
}
class ButterScotch extends Cream{
	Item item;
	public ButterScotch() {
	
	}
	public ButterScotch(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) {
			return 15;
		}
		else {
			return 15+item.cost();
		}
	}
	
}
class Nuts extends Ingredients{
	Item item;
	public Nuts() {
	
	}
	public Nuts(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) {
			return 5;
		}
		else {
			return 5+item.cost();
		}
	}
	
}
class DryFruit extends Ingredients{
	Item item;
	public DryFruit() {
	
	}
	public DryFruit(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if (item==null) {
			return 10;
		}
		else {
			return 10+item.cost();
		}
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		Item iceCream=new Vanilla(new Nuts(new DryFruit(new Vanilla())));
		System.out.println("one Vanilla cup...+nuts.+ Butter scotch:"+iceCream.cost());
		
	}

}
