package com.bw.bean;

public class GoodsBean {
	
	private int bid;
	private String bname;
	private int kid;
	private String kname;
	private int gid;
	private String gname;
	private String ggname;
	private int brand_bid;
	private int gk_kid;
	private int size;
	private int price;
	private int number;
	private String bq;
	private String img;
	@Override
	public String toString() {
		return "GoodsBean [bid=" + bid + ", bname=" + bname + ", kid=" + kid + ", kname=" + kname + ", gid=" + gid
				+ ", gname=" + gname + ", ggname=" + ggname + ", brand_bid=" + brand_bid + ", gk_kid=" + gk_kid
				+ ", size=" + size + ", price=" + price + ", number=" + number + ", bq=" + bq + ", img=" + img + "]";
	}
	public GoodsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGgname() {
		return ggname;
	}
	public void setGgname(String ggname) {
		this.ggname = ggname;
	}
	public int getBrand_bid() {
		return brand_bid;
	}
	public void setBrand_bid(int brand_bid) {
		this.brand_bid = brand_bid;
	}
	public int getGk_kid() {
		return gk_kid;
	}
	public void setGk_kid(int gk_kid) {
		this.gk_kid = gk_kid;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
