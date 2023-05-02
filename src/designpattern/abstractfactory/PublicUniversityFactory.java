package designpattern.abstractfactory;

public class PublicUniversityFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String course) {
		// TODO Auto-generated method stub
		switch (course) {
		case "Math":
			return new USCAdmitCard();
		case "Physics":
			return new VSUAdmitCard();
		case "CS":
			return new ASUAdmitCard();
		default:
			throw null;
		}
	}

	@Override
	public FeesCalculator getFeesCalculator(String course) {
		// TODO Auto-generated method stub
		switch (course) {
		case "Math":
			return new USCFeesCalculator();
		case "Physics":
			return new VSUFeesCalculator();
		case "CS":
			return new ASUFeesCalculator();
		default:
			throw null;
		}
	}

}
