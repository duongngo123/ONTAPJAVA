package BAI10;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo102;
	protected int soNha102;
	protected String maCongTo102;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo102 = tenChuHo;
		this.soNha102 = soNha;
		this.maCongTo102 = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo102 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha102 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo102 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo102);
		System.out.println("\tSo nha: " + soNha102);
		System.out.println("\tMa cong to: " + maCongTo102);
	}
}
