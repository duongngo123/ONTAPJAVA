package BAI7;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private ArrayList<HocSinh> dshs102;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs102 = new ArrayList<HocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(HocSinh hs) {
		dshs102.add(hs);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n = sc.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");

			hs = new HocSinh();
			hs.nhapThongTin(sc);

			themHS(hs);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dshs102.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			dshs102.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam, String que) {
		for (HocSinh hs : dshs102) {
			if ((hs.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs.getQueQuan()))) {
				hs.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop) {
		for (HocSinh hs : dshs102) {
			if (lop.equals(hs.getLop())) {
				hs.hienThiThongTin();
			}
		}
	}
}
