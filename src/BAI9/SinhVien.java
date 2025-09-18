package BAI9;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen102;
	protected String maSV102;
	protected String ngaySinh102;
	protected String lop102;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen102 = hoTen;
		this.maSV102 = maSV;
		this.ngaySinh102 = ngaySinh;
		this.lop102 = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen102 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV102 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh102 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop102 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen102);
		System.out.println("\tNgay sinh: " + ngaySinh102);
		System.out.println("\tMa sinh vien: " + maSV102);
		System.out.println("\tLop: " + lop102);
	}
}
