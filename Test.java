package demoHinhHoc;

public class Test {
	public static void main(String[] args) {
		DanhSachHinh d = new DanhSachHinh();
		HinhHocInput hi = new HinhHocInput();
		boolean exit = false;

		while (true) {
			menu();
			String choose = hi.inputChoose();
			switch (choose) {
			case "1":
				d.addHCN();
				break;
			case "2":
				d.addHT();
				break;

			case "3":
				d.show();
				break;
			case "4":
				d.delete();
				break;
			case "all":
				d.deleteAll();
				break;
			case "0":
				exit = true;
				System.out.println("Exited.");
				break;
			default:
				System.out.println("Invalid! choose again.");
				break;
			}
			if (exit) {
				System.exit(0);
			}
		}
	}

	public static void menu() {
		System.out.println("1. Add HCN");
		System.out.println("2. Add HT");
		System.out.println("3. Show");
		System.out.println("4. Delete");
		System.out.println("0. Exit.");
		System.out.println("Input choose: ");
	}
}
