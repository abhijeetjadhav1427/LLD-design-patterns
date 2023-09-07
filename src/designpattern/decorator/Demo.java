package designpattern.decorator;

public class Demo {
	public static void main(String[] args) {
		BasePizza basePizza = new Moretto();
		System.out.println("BasePizza cost: " + basePizza.getCost());
		
		DecoratedPizza baseExtraCheese = new ExtraCheese(new Moretto()); // basePizza + extracheese
		System.out.println("basePizza + extracheese : " + baseExtraCheese.getCost());
		
		DecoratedPizza baseExtraCheeseMashroom = new ExtraCheese(new ExtraCheese(new Moretto())); // basePizza + extracheese + mashroom
		System.out.println("basePizza + extracheese + mashroom : " + baseExtraCheeseMashroom.getCost());
	}
}
