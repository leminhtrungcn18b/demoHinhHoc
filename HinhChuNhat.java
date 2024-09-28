package demoHinhHoc;

public class HinhChuNhat extends HinhHoc {
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat() {

	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}

	@Override
	public String toString() {
		return "Chieu dai: " + chieuDai + ", Chieu rong: " + chieuRong + ", Chu vi: " + this.tinhChuVi()
				+ ", Dien tich: " + this.tinhDienTich();
	}

}
