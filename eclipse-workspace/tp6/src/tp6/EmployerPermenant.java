package tp6;
import java.time.LocalDate;

public class EmployerPermenant extends Employer {
	private LocalDate daterecrutement;
	public EmployerPermenant(String nom, int age, double salaire, String matricule, LocalDate daterecrutement) {
		super(nom, age, salaire, matricule);
		this.daterecrutement=daterecrutement;
	}
		public LocalDate getDaterecrutement() {
			return daterecrutement ;
			
		}
		

		
		@Override
		public void afficherDetails() {
			System.out.println( "EmployerPermenant -daterecrutement=" + daterecrutement + ", getDaterecrutement()="
					+ getDaterecrutement() + ", getNom()=" + getNom() + ", getAge()=" + getAge() + ", getSalaire()="
					+ getSalaire() + ", getMatricule()=" + getMatricule() );}
	
	

}
