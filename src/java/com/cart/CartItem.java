package com.cart;
public class CartItem
{
	private String name;
	private String model;
	private int price;
	private String description;
	private int Quantity;        
        private String image;

        public String getImage() {
            return image;
        }
        public void setImage(String image) {
            this.image = image;
        }
     	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}