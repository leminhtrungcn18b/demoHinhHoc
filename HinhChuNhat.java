package demoHinhHoc;

public class HinhChuNhat extends HinhHoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(int id, int chieuDai, int chieuRong) {
		super(id);
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
		return super.toString() + ", HinhChuNhat [Chieu Dai = " + chieuDai + ", Chieu Rong = " + chieuRong
				+ ", Chu vi = " + tinhChuVi() + ", Dien Tich = " + tinhDienTich() + "]";
	}

}
