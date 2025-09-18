package BAI8;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung102;
	private double thuong102;
	private double phat102;
	private double luongThucLinh102;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung102 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong102 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat102 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh102 = luongCung102 + thuong102 - phat102;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung102);
		System.out.println("\tThuong: " + thuong102);
		System.out.println("\tPhat: " + phat102);
		System.out.println("\tLuong thuc linh: " + luongThucLinh102);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh102;
	}
}
