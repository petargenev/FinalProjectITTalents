package models;

import exceptions.InvalidInputException;

public class Computer {
	private String type;
	
	private String label;
	private String model;

	private String ram;
	private String processorType;
	private String displaySize;
	private String processorSpeed;
	private String videoCardType;
	private String hdd;
	private String operationSystem;
	
	private double price;

	public String getType() {
		return type;
	}

	public void setType(String type) throws InvalidInputException {
		if (type != null && !type.isEmpty()) {
			this.type = type;
		} else {
			throw new InvalidInputException("Invalid type!");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) throws InvalidInputException {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		} else {
			throw new InvalidInputException("Invalid model name!");
		}
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) throws InvalidInputException {
		if (ram != null && !ram.isEmpty()) {
			this.ram = ram;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) throws InvalidInputException {
		if (processorType != null && !processorType.isEmpty()) {
			this.processorType = processorType;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) throws InvalidInputException {
		if (displaySize != null && !displaySize.isEmpty()) {
			this.displaySize = displaySize;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(String processorSpeed) throws InvalidInputException {
		if (processorSpeed != null && !processorSpeed.isEmpty()) {
			this.processorSpeed = processorSpeed;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getVideoCardType() {
		return videoCardType;
	}

	public void setVideoCardType(String videoCardType) throws InvalidInputException {
		if (videoCardType != null && !videoCardType.isEmpty()) {
			this.videoCardType = videoCardType;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) throws InvalidInputException {
		if (hdd != null && !hdd.isEmpty()) {
			this.hdd = hdd;
		} else {
			throw new InvalidInputException("Invalid input!");
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String os) throws InvalidInputException {
		if (os != null && !os.isEmpty()) {
			this.operationSystem = os;
		} else {
			throw new InvalidInputException("Invalid operation system!");
		}
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) throws InvalidInputException {
		if (label != null && !label.isEmpty()) {
			this.label = label;
		} else {
			throw new InvalidInputException("Invalid label!");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidInputException {
		if(price > 0){
			this.price = price;
		}else{
			throw new InvalidInputException("Invalid input!");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Computer [type=" + type + ", model=" + model + ", ram=" + ram + ", processorType=" + processorType
				+ ", displaySize=" + displaySize + ", processorSpeed=" + processorSpeed + ", videoCardType="
				+ videoCardType + ", hdd=" + hdd + ", os=" + operationSystem + "]";
	}

}
