package models;

import exceptions.InvalidInputException;

public class Computer {
	private String type;
	private String model;

	private String ram;
	private String processorType;
	private String displaySize;
	private String processorSpeed;
	private String videoCardType;
	private String hdd;
	private String os;

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

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public String getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(String processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public String getVideoCardType() {
		return videoCardType;
	}

	public void setVideoCardType(String videoCardType) {
		this.videoCardType = videoCardType;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
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
				+ videoCardType + ", hdd=" + hdd + ", os=" + os + "]";
	}

}
