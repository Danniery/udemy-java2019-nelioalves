package entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anaulIncome) {
		this.name = name;
		this.anualIncome = anaulIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public abstract double tax();
	
}
