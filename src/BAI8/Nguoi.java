package BAI8;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen102;
	protected String ngaySinh102;
	protected String queQuan102;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen102 = hoTen;
		this.ngaySinh102 = ngaySinh;
		this.queQuan102 = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen102 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh102 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan102 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen102);
		System.out.println("\tNgay sinh: " + ngaySinh102);
		System.out.println("\tQue quan: " + queQuan102);
	}
}
