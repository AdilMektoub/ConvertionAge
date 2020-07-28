package Genericite;

public class Personne<T> {
	
	private String nom;
	private T age;
	
	public Personne(String nom, T age) {
		this.nom = nom;
		this.age = age;
	}
//	if (p.getAge() instanceof Integer)

	public static <T> void ageInt(Personne<T> p) {
		
		if (p.getAge().getClass().equals(Integer.class)) 
			System.out.println("l'age de "+p.getNom()+" est = à "+ p.getAge());
		
		else if (p.getAge().getClass().equals(Mois.class)) {
			int age = ((Mois) p.getAge()).getNbrMois() / 12;
			System.out.println("l'age de "+p.getNom()+" est = à "+ age);
		}
		else if (p.getAge().getClass().equals(Float.class)) 
			System.out.println("l'age de "+p.getNom()+" est = à "+
		(int)((float)p.getAge()));
	}
	
	public static <T> void ageFloat(Personne<T> p) {
		if (p.getAge().getClass().equals(Integer.class)) 
			System.out.println("l'age de "+p.getNom()+" est = à "+
		(float)((int)p.getAge()));
		
		else if (p.getAge().getClass().equals(Mois.class)) {
			float age = (float)(((Mois) p.getAge()).getNbrMois() / 12);
			System.out.println("l'age de "+p.getNom()+" est = à "+ age);
		}
		else if (p.getAge().getClass().equals(Float.class)) 
			System.out.println("l'age de "+p.getNom()+" est = à "+p.getAge());
	}
	
	public static <T> void ageMois(Personne<T> p) {
		if (p.getAge().getClass().equals(Integer.class)) {
			int age = (int) p.getAge() * 12;
			System.out.println("l'age de "+p.getNom()+" est = à "+ age);
		}
			
		else if (p.getAge().getClass().equals(Mois.class)) {
			int age = ((Mois) p.getAge()).getNbrMois();
			System.out.println("l'age de "+p.getNom()+" est = à "+ age);
		}
		else if (p.getAge().getClass().equals(Float.class)) {
			int age = (int)((float) p.getAge() * 12);
			System.out.println("l'age de "+p.getNom()+" est = à "+ age);
	}
	}	

	
	public String getNom() {
		return nom;
	}

	public T getAge() {
		return age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(T age) {
		this.age = age;
	}
	
}
