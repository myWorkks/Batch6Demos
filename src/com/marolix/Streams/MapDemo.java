package com.marolix.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProductEntity {
	private Integer prodId;
	private String prodName;
	private Integer QuatityAvailable;
	private Float price;
	private Float discount;

	public ProductEntity(Integer prodId, String prodName, Integer quatityAvailable, Float price, Float discount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		QuatityAvailable = quatityAvailable;
		this.price = price;
		this.discount = discount;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Integer getQuatityAvailable() {
		return QuatityAvailable;
	}

	public void setQuatityAvailable(Integer quatityAvailable) {
		QuatityAvailable = quatityAvailable;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}

class ProductDTO {
	private Integer prodId;
	private String prodName;
	private Float price;
	private Float discount;

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Integer prodId, String prodName, Float price, Float discount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "ProductDTO [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", discount=" + discount
				+ "]";
	}

}

public class MapDemo {

	public List<ProductDTO> searchProducts(String productName) {

		List<ProductEntity> l = new ArrayList<ProductEntity>();
		l.add(new ProductEntity(1, "samsungphone", 5000, 25000f, 30f));
		l.add(new ProductEntity(2, "redmiphone", 500, 25000f, 30f));
		l.add(new ProductEntity(3, "rebook shoe", 5000, 25000f, 30f));
		l.add(new ProductEntity(4, "sweatshirt", 500, 25000f, 30f));
		l.add(new ProductEntity(5, "samsungphone", 5000, 25000f, 30f));
		l.add(new ProductEntity(6, "redmiphone", 500, 25000f, 30f));
		l.add(new ProductEntity(7, "adidas shoe", 5000, 1250f, 30f));
		l.add(new ProductEntity(8, "polo t shirt", 500, 250f, 30f));

		final List<ProductDTO> list = new ArrayList<ProductDTO>();
		
		l.stream().filter(product -> product.getProdName().contains(productName)).map(product -> {
			ProductDTO dto = new ProductDTO();
			dto.setProdId(product.getProdId());
			dto.setProdName(product.getProdName());
			dto.setPrice(product.getPrice());
			dto.setDiscount(product.getDiscount());
			return dto;
		}).forEach(p -> list.add(p));
		return list;
	}

	public static void main(String[] args) {
		MapDemo m = new MapDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your search");
		String s = sc.next();
		List<ProductDTO> l = m.searchProducts(s);
		if (!l.isEmpty())
			System.out.println(l);
		else
			System.out.println("no products found for your search");
	}

}
