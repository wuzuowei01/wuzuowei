package com.bw.bean;

public class Gk {
	
	private int kid;
	private String kname;
	@Override
	public String toString() {
		return "Gk [kid=" + kid + ", kname=" + kname + "]";
	}
	public Gk() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
