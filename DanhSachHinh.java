package demoHinhHoc;

import java.util.ArrayList;

public class DanhSachHinh {
	private ArrayList<HinhHoc> list;

	public DanhSachHinh() {
		list = new ArrayList<HinhHoc>();
	}

	public void add(HinhHoc h) {
		list.add(h);
		System.out.println("Them thanh cong.");
	}

	public void show() {
		for (HinhHoc i : list) {
			System.out.println(i);
		}
	}
}
