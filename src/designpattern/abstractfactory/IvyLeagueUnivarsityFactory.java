package designpattern.abstractfactory;

public class IvyLeagueUnivarsityFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String course) {
		// TODO Auto-generated method stub
		switch (course) {
		case "Math":
			return new MITAdmitCard();
		case "Physics":
			return new CalTechAdmitCard();
		case "CS":
			return new GeorgiaTechAdmitCard();
		default:
			return null;
		}
	}

	@Override
	public FeesCalculator getFeesCalculator(String course) {
		// TODO Auto-generated method stub
		switch (course) {
		case "Math":
			return new MITFeesCalculator();
		case "Physics":
			return new CalTechFeesCalculator();
		case "CS":
			return new GeorgiaTechFeesCalculator();
		default:
			return null;
		}
	}

}
