package demoHinhHoc;

public class Test {
	public static void main(String[] args) {
		DanhSachHinh d = new DanhSachHinh();

		d.add(new HinhChuNhat(3, 2));
		d.add(new HinhTron(3));
		d.show();
	}
}
