package demoHinhHoc;

import java.io.Serializable;

public abstract class HinhHoc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;

	public HinhHoc() {

	}

	public HinhHoc(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract double tinhChuVi();

	public abstract double tinhDienTich();

	@Override
	public String toString() {
		return "ID: " + id;
	}
}
