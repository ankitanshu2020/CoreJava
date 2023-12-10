package Comparator;

import java.util.Objects;

public class Books {
	
	private String title;
	private double price;
	private int yop;
	private String author;
	
	Books(){}
	
    public Books(String title, double price, int yop, String author) {
		super();
		this.title = title;
		this.price = price;
		this.yop = yop;
		this.author = author;
	}


	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getYop() {
		return yop;
	}

	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "Books [title = " + title + ", price = " + price + ", yop = " + yop + ", author = " + author + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title) && yop == other.yop;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, price, title, yop);
	}

}
