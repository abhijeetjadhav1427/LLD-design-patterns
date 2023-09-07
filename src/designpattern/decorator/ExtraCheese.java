package designpattern.decorator;

public class ExtraCheese implements DecoratedPizza {
	private BasePizza basePizza;

	public ExtraCheese(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.basePizza.getCost()+10;
	}

}
