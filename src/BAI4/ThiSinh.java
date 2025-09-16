package BAI4;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD102;
	private String hoTen102;
	private String diaChi102;
	private String dienUuTien102;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD102 = soBD;
		this.hoTen102 = hoTen;
		this.diaChi102 = diaChi;
		this.dienUuTien102 = dienUuTien;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD102 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen102 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi102 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien102 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD102);
		System.out.println("\tHo ten: " + hoTen102);
		System.out.println("\tDia chi: " + diaChi102);
		System.out.println("\tDien uu tien: " + dienUuTien102);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD102;
	}
}
