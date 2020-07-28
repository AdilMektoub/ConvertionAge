package Genericite;

public class Test {

	public static void main(String[] args) {
		Mois m36 = new Mois(48);
		Personne<Integer> anis = 
		new Personne<Integer>("Anis", 3);
		Personne<Mois> seb =
		new Personne<Mois>("Sébastien", m36);
		Personne<Float> tran =
		new Personne<Float>("Nga", 20.0f);
		Personne.ageFloat(anis);
		Personne.ageFloat(seb);
		Personne.ageFloat(tran);
		Personne.ageInt(anis);
		Personne.ageInt(seb);
		Personne.ageInt(tran);
		Personne.ageMois(anis);
		Personne.ageMois(seb);
		Personne.ageMois(tran);
	}
}
