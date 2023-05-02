package designpattern.abstractfactory;

public abstract class UniversityFactory {
	private static int cutoff = 40;

	public static UniversityFactory getUniversity(int score) {
		if (score > cutoff) {
			return new IvyLeagueUnivarsityFactory();
		} else {
			return new PublicUniversityFactory();
		}
	}

	public abstract AdmitCard getAdmitCard(String course);

	public abstract FeesCalculator getFeesCalculator(String course);
}
