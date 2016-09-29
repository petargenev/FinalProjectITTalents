package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;



public class Mouse extends Article {

	private double resolution;
	

	public Mouse(String label, String model, double price, double resolution)
			throws InvalidInputException {
		super(label, model, price);
		setResolution(resolution);
		
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) throws InvalidInputException {
		if (resolution > 0) {
			this.resolution = resolution;
		} else {
			throw new InvalidInputException("Invalid resolution!");
		}
	}



	@Override
	public String toString() {
		return "Mouse [resolution=" + resolution + ", toString()=" + super.toString() + "]";
	}

	

}
