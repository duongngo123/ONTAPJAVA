package BAI7;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop102;
	private String khoHoc102;
	private String kyHoc102;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen102 = hoTen;
		this.lop102 = lop;
		this.khoHoc102 = khoaHoc;
		this.kyHoc102 = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop102 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc102 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc102 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop102);
		System.out.println("\tKhoa hoc: " + khoHoc102);
		System.out.println("\tKy hoc: " + kyHoc102);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop102;
	}
}
