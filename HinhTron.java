package demoHinhHoc;

public class HinhTron extends HinhHoc {
	private static double numberPi = 3.14;
	private int banKinh;

	public HinhTron() {

	}

	public HinhTron(int banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public double tinhChuVi() {
		return banKinh * 2 * numberPi;
	}

	@Override
	public double tinhDienTich() {
		return numberPi * banKinh * banKinh;
	}

	@Override
	public String toString() {
		return "Ban kinh: " + banKinh + ", Chu vi: " + this.tinhChuVi() + ", Dien tich: " + this.tinhDienTich();
	}
}
