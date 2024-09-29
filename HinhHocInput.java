package demoHinhHoc;

import java.util.Scanner;

public class HinhHocInput {
	private Scanner sc = new Scanner(System.in);

	public int inputCanh() {
		System.out.print("Input canh: ");

		while (true) {
			String tmp = sc.nextLine().trim();
			int canh = Integer.parseInt(tmp);
			if (!tmp.isEmpty()) {
				return canh;
			}
			System.out.print("Input canh again: ");
		}
	}

	public String inputChoose() {
		String choose = sc.nextLine().trim().toUpperCase();
		return choose;
	}

	public int inputId() {
		System.out.print("Input ID: ");
		while (true) {
			try {
				String temp = sc.nextLine().trim();
				int id = Integer.parseInt(temp);
				return id;
			} catch (NumberFormatException nfe) {
				System.out.print("Invalid! Input ID again: ");
			}
		}
	}

//	public int autoId(ArrayList<HinhHoc> list) {
//		int id = (list.size() > 0) ? (list.size() + 1) : 1;
//		return id;
//	}
}
