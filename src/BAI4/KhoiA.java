package BAI4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1102;
	private String mon2102;
	private String mon3102;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1102 = mon1;
		this.mon2102 = mon2;
		this.mon3102 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1102 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2102 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3102 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1102 + " - " + mon2102 + " - " + mon3102);
	}
}
