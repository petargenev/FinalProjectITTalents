package models;

import org.eclipse.jdt.core.compiler.InvalidInputException;

public abstract class Article {
	private String label;
	private String model;

	private double price;

	public Article(String label, String model, double price) throws InvalidInputException {
		setLabel(label);
		setModel(model);
		setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidInputException {
		if (price > 0) {
			this.price = price;
		} else {
			throw new InvalidInputException("Invalid price!");
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) throws InvalidInputException {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		} else {
			throw new InvalidInputException("Invalid label!");
		}
	}

	@Override
	public String toString() {
		return "Article [label=" + label + ", model=" + model + ", price=" + price + "]";
	}

}
