package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;

public class WashingMachine extends Article {
	
	private String kind;
	private String roundsPerMinute;
	private String energyClass;
	private String washingCapacity;
	
	
	public WashingMachine(String label, String model, double price, String kind, String roundsPerMinute,
			String energyClass, String washingCapacity) throws InvalidInputException {
		super(label, model, price);
		setKind(kind);
		setRoundsPerMinute(roundsPerMinute);
		setEnergyClass(energyClass);
		setWashingCapacity(washingCapacity);
	}
	@Override
	public String toString() {
		return "WashingMachine [kind=" + kind + ", roundsPerMinute=" + roundsPerMinute + ", energyClass=" + energyClass
				+ ", washingCapacity=" + washingCapacity + ", toString()=" + super.toString() + "]";
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) throws InvalidInputException {
		if(kind != null && !kind.isEmpty())
			this.kind = kind;
		else 
			throw new InvalidInputException("Invalid input!");
	}
	public String getRoundsPerMinute() {
		return roundsPerMinute;
	}
	public void setRoundsPerMinute(String roundsPerMinute) throws InvalidInputException {
		if(roundsPerMinute != null && !roundsPerMinute.isEmpty())
			this.roundsPerMinute = roundsPerMinute;
		else 
			throw new InvalidInputException("Invalid input!");
	}
	public String getEnergyClass() {
		return energyClass;
	}
	public void setEnergyClass(String energyClass) throws InvalidInputException {
		if(energyClass != null && !energyClass.isEmpty())
			this.energyClass = energyClass;
		else 
			throw new InvalidInputException("Invalid input!");
	}
	public String getWashingCapacity() {
		return washingCapacity;
	}
	public void setWashingCapacity(String washingCapacity) throws InvalidInputException {
		if(washingCapacity != null && !washingCapacity.isEmpty())
			this.washingCapacity = washingCapacity;
		else 
			throw new InvalidInputException("Invalid input!");
	}
	
	
}
