package tp6;

import java.time.LocalDate;

public class EmployerContractuel extends Employer {
	private LocalDate debutcontrat;
	private LocalDate fincontrat;

	public EmployerContractuel(String nom, int age, double salaire, String matricule, LocalDate debutcontrat,
			LocalDate fincontrat) {
		super(nom, age, salaire, matricule);
		this.debutcontrat = debutcontrat;
		this.fincontrat = fincontrat;
	}

	public LocalDate getDebutcontrat() {
		return debutcontrat;

	}

	public LocalDate getFincontrat() {
		return fincontrat;
	}

	@Override
		public void afficherDetails() {
			System.out.println( );
			}

}
