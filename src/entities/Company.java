package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anaulIncome, Integer numberOfEmployees) {
		super(name, anaulIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double tax;
		if(numberOfEmployees >= 10) {
			tax = getAnualIncome() * 0.14;
		} else {
			tax = getAnualIncome() * 0.16;
		}
		return tax;
	}
	
	
}
