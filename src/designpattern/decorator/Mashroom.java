package designpattern.decorator;

public class Mashroom implements DecoratedPizza {
	private BasePizza basePizza;

	public Mashroom(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.basePizza.getCost() + 10;
	}

}
