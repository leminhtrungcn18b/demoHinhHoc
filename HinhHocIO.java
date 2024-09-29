package demoHinhHoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class HinhHocIO {
	private static final String FILE_HH = "D:\\LuyenTapJava\\WorkspaceSTS\\luyenBaiTap\\src\\demoHinhHoc\\hinhhoc.txt";

	public void write(ArrayList<HinhHoc> list) {
		File file = new File(FILE_HH);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Da tao file thanh cong.");
			}

			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);
			System.out.println("Da ghi file thanh cong.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Loi khong tim thay file: " + fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Loi ghi du lieu vao file: " + ioe.getMessage());
		} finally {
			closeStream(oos);
			closeStream(fos);
		}
	}

	public ArrayList<HinhHoc> read() {
		File file = new File(FILE_HH);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList<HinhHoc> list = new ArrayList<>();

		try {
			if (!file.exists()) {
				System.out.println("File rong!!!");
			}

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			list = (ArrayList<HinhHoc>) ois.readObject();
			System.out.println("Du lieu da duoc doc thanh cong.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Loi khong tim thay file: " + fnfe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Loi khong tim thay lop: " + cnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Loi doc du lieu tu file: " + ioe.getMessage());
		} finally {
			closeStream(ois);
			closeStream(fis);
		}
		return list;
	}

	private void closeStream(OutputStream os) {
		try {
			if (os != null) {
				os.close();
			}
		} catch (IOException ioe) {
			System.out.println("Loi khong dong luong ghi: " + ioe.getMessage());
		}
	}

	private void closeStream(InputStream is) {
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException ioe) {
			System.out.println("Loi khong dong duoc luong doc: " + ioe.getMessage());
		}
	}
}
