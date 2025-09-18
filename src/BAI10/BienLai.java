package BAI10;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi102;
	private int chiSoCu102;
	private double tien102;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi102 = chiSoMoi;
		this.chiSoCu102 = chiSoCu;
		this.tien102 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo102 = tenChuHo;
		this.chiSoMoi102 = chiSoMoi;
		this.chiSoCu102 = chiSoCu;
		this.tien102 = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi102 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu102 = sc.nextInt();
		sc.nextLine();
		tien102 = (chiSoMoi102 - chiSoCu102) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi102);
		System.out.println("\tChi so cu: " + chiSoCu102);
		System.out.println("\tTien: : " + tien102);
	}
}
