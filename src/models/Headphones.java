package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;

public class Headphones extends Article{
	
	private boolean areSterio;
	private boolean soundControl;
	

	
	public Headphones(String type, String model,boolean areSterio, boolean soundControl, double price) throws InvalidInputException {
		super(type,model,price);
		this.areSterio = areSterio;
		this.soundControl = soundControl;
	}

	public boolean isAreSterio() {
		return areSterio;
	}

	public void setAreSterio(boolean areSterio) {
		this.areSterio = areSterio;
	}

	public boolean isSoundControl() {
		return soundControl;
	}

	public void setSoundControl(boolean soundControl) {
		this.soundControl = soundControl;
	}

	@Override
	public String toString() {
		return "Headphones [areSterio=" + areSterio + ", soundControl=" + soundControl + ", toString()="
				+ super.toString() + "]";
	}

}
