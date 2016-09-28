package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;

public class Keyboard extends Article{
	private String type;
	private boolean fastButtons;
	private String color;
	
	public Keyboard(String label, String model, double price, String type, boolean fastButtons, String color)
			throws InvalidInputException {
		super(label, model, price);
		setType(type);
		setFastButtons(fastButtons);
		setColor(color);
	}

	@Override
	public String toString() {
		return "Keyboard [type=" + type + ", fastButtons=" + fastButtons + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws InvalidInputException {
		if(type != null && !type.isEmpty())
		{
		this.type = type;
		}else{
			throw new InvalidInputException("Invalid type!");
		}
	}

	public boolean isFastButtons() {
		return fastButtons;
	}

	public void setFastButtons(boolean fastButtons) {
		this.fastButtons = fastButtons;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws InvalidInputException {
		if(color != null && !color.isEmpty()){
		this.color = color;
		}else{
			throw new InvalidInputException("Invalid color!");
		}
	}
	
	
	
}
