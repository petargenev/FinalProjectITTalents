package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;



public class Mouse extends Article {

	private String resolution;
	private boolean isOptic;

	public Mouse(String label, String model, double price, String resolution, boolean isOptic)
			throws InvalidInputException {
		super(label, model, price);
		setResolution(resolution);
		setOptic(isOptic);
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) throws InvalidInputException {
		if (resolution != null && !resolution.isEmpty()) {
			this.resolution = resolution;
		} else {
			throw new InvalidInputException("Invalid resolution!");
		}
	}

	public boolean isOptic() {
		return isOptic;
	}

	public void setOptic(boolean isOptic) {
		this.isOptic = isOptic;
	}

	@Override
	public String toString() {
		return "Mouse [resolution=" + resolution + ", isOptic=" + isOptic + ", toString()=" + super.toString() + "]";
	}

	

}
