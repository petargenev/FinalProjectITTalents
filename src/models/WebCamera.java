package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;

public class WebCamera extends Article{
	
	private String resolution;
	private int framesPerSecond;
	private boolean hasMicrophone;
	
	
	public WebCamera(String label, String model, double price, String resolution, int framesPerSecond,
			boolean hasMicrophone) throws InvalidInputException {
		super(label, model, price);
		setResolution(resolution);
		setFramesPerSecond(framesPerSecond);
		setHasMicrophone(hasMicrophone);
		
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) throws InvalidInputException {
		if(resolution != null && !resolution.isEmpty()){
		this.resolution = resolution;
		}else{
			throw new InvalidInputException("Invalid resolution!");
		}
	}
	public int getFramesPerSecond() {
		
		return framesPerSecond;
	}
	public void setFramesPerSecond(int framesPerSecond) throws InvalidInputException {
		if(framesPerSecond > 0)
			this.framesPerSecond = framesPerSecond;
		else
			throw new InvalidInputException("Invalid input!");
	}
	public boolean isHasMicrophone() {
		return hasMicrophone;
	}
	public void setHasMicrophone(boolean hasMicrophone) {
		this.hasMicrophone = hasMicrophone;
	}
	@Override
	public String toString() {
		return "WebCamera [resolution=" + resolution + ", framesPerSecond=" + framesPerSecond + ", hasMicrophone="
				+ hasMicrophone + ", toString()=" + super.toString() + "]";
	}
	
	
}
