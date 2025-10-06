package tp6;

public abstract class  Employer {
	private String nom;
	private int age;
	private double salaire;
	private String matricule;
	public Employer(String nom, int age, double salaire, String matricule) {
		this.nom=nom;
		this.age=age;
		this.salaire=salaire;
		this.matricule=matricule;
		
	}
	public String getNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire=salaire;
	}
	public String getMatricule() {
		return matricule;
	}
	public abstract void afficherDetails();

	
	
	

}
