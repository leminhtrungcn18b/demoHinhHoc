package demoHinhHoc;

public class HinhTron extends HinhHoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static double numberPi = 3.14;
	private int banKinh;

	public HinhTron() {

	}

	public HinhTron(int id, int banKinh) {
		super();
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
		return "ID: " + super.getId() + ",HinhTron [Ban Kinh = " + banKinh + ", ChuVi = " + tinhChuVi()
				+ ", DienTich = " + tinhDienTich() + "]";
	}

}
