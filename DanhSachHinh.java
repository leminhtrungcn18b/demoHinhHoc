package demoHinhHoc;

import java.util.ArrayList;

public class DanhSachHinh {
	private ArrayList<HinhHoc> list;
	private HinhHocIO io;
	private HinhHocInput hi = new HinhHocInput();

	public DanhSachHinh() {
		list = new ArrayList<HinhHoc>();
		io = new HinhHocIO();
		list = io.read();
	}

//	public void add(HinhHoc h) {
//		list.add(h);
//		io.write(list);
//		System.out.println("Them thanh cong.");
//	}

	public void addHCN() {
		int id = (list.size() > 0) ? (list.size() + 1) : 1;
		System.out.print("Nhap chieu dai: ");
		int chieuDai = hi.inputCanh();
		System.out.print("Nhap chieu rong: ");
		int chieuRong = hi.inputCanh();

		HinhChuNhat hcn = new HinhChuNhat(id, chieuDai, chieuRong);
		list.add(hcn);
		io.write(list);
		System.out.println("Them thanh cong.");
	}

	public void addHT() {
		int canh = hi.inputCanh();
		int id = (list.size() > 0) ? (list.size() + 1) : 1;

		HinhTron ht = new HinhTron(id, canh);
		list.add(ht);
		io.write(list);
		System.out.println("Them thanh cong.");
	}

	public void show() {
		for (HinhHoc i : list) {
			System.out.println(i);
		}
		System.out.println(list.size());
	}

	public void delete() {
		System.out.println("Vui long chon ID can xoa.");
		int id = hi.inputId();
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				do {
					System.out.print("Xac nhan xoa (Y|N): ");
					String choose = hi.inputChoose();
					switch (choose) {
					case "Y":
						list.remove(list.get(i));
						io.write(list);
						System.out.println("Xoa thanh cong.");
						count = 1;
						break;
					case "N":
						System.out.println("Huy thao tac xoa.");
						count = 1;
						break;
					default:
						System.out.println("Vui long Y or N !!! ");
						break;
					}
				} while (count != 1);
			}
		}
		if (count == 0) {
			System.out.println("Khong ton tai ID: " + id);
		}
	}

	public void deleteAll() {
		list.clear();
		io.write(list);
	}
}
