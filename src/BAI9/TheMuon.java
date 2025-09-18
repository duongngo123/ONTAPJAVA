package BAI9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon102;
	private Date ngayMuon102;
	private Date hanTra102;
	private String soHieu102;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon102 = soMuon;
		this.ngayMuon102 = ngayMuon;
		this.soHieu102 = soHieu;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon102 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon102 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra102 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu102 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon102);
		System.out.println("\tNgay muon: " + ngayMuon102);
		System.out.println("\tHan tra: " + hanTra102);
		System.out.println("\tSo hieu: " + soHieu102);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra102;
	}
}
