package BAI3;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu102;
	private String tenNXB102;
	private int soBanPhatHanh102;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu102 = maTaiLieu;
		this.tenNXB102 = tenNXB;
		this.soBanPhatHanh102 = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu102 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB102 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh102 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu102);
		System.out.println("\tTen nha xuat ban: " + tenNXB102);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh102);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu102;
	}
}
