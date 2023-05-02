package designpattern.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		UniversityFactory factory = UniversityFactory.getUniversity(50);
		
		AdmitCard card1 = factory.getAdmitCard("Math");
		FeesCalculator calculator1 = factory.getFeesCalculator("Math");
		System.out.println(card1.getClass() + " -> " + calculator1.calculateFees());
		
		AdmitCard card2 = factory.getAdmitCard("Physics");
		FeesCalculator calculator2 = factory.getFeesCalculator("Physics");
		System.out.println(card2.getClass() + " -> " + calculator2.calculateFees());
		
		
		factory = UniversityFactory.getUniversity(30);
		
		card1 = factory.getAdmitCard("Math");
		calculator1 = factory.getFeesCalculator("Math");
		System.out.println(card1.getClass() + " -> " + calculator1.calculateFees());
		
		card2 = factory.getAdmitCard("Physics");
		calculator2 = factory.getFeesCalculator("Physics");
		System.out.println(card2.getClass() + " -> " + calculator2.calculateFees());
	}
}
