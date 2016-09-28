package models;

import exceptions.InvalidInputException;

public class Computer extends Article{
	private String type;

	

	private String ram;
	private String processorType;
	private String displaySize;
	private String processorSpeed;
	private String videoCardType;
	private String hdd;
	private String operationSystem;

	

	

	public Computer(String type, String label, String model, String ram, String processorType, String displaySize,
			String processorSpeed, String videoCardType, String hdd, String operationSystem, double price)
			throws InvalidInputException, org.eclipse.jdt.core.compiler.InvalidInputException {
		super(type,label,price);
		setModel(model);
		setRam(ram);
		setProcessorType(processorType);
		setDisplaySize(displaySize);
		setProcessorSpeed(processorSpeed);
		setVideoCardType(videoCardType);
		setHdd(hdd);
		setOperationSystem(operationSystem);
		
	}
	

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


	@Override
	public String toString() {
		return "Computer [type=" + type + ", ram=" + ram + ", processorType=" + processorType + ", displaySize="
				+ displaySize + ", processorSpeed=" + processorSpeed + ", videoCardType=" + videoCardType + ", hdd="
				+ hdd + ", operationSystem=" + operationSystem + ", toString()=" + super.toString() + "]";
	}


	

}
