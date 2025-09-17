package BAI6;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro102;
	private String loaiPhong102;
	private double giaPhong102;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen102 = hoTen;
		this.CMND102 = CMND;
		this.soNgayTro102 = soNgayTro;
		this.loaiPhong102 = loaiPhong;
		this.giaPhong102 = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro102 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong102 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong102 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro102);
		System.out.println("\tLoai phong: " + loaiPhong102);
		System.out.println("\tGia phong: " + giaPhong102);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro102;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong102;
	}
}
