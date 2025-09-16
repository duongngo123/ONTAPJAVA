package BAI4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts102;

	// phuong thuc
	public TuyenSinh() {
		dsts102 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts) {
		dsts102.add(ts);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts;
		int chon;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts.nhapThongTin(sc);
			themThiSinh(ts);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts102.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts102.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts102) {
			if (ts.getSoBD() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
