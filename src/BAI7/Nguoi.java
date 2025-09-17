package BAI7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen102;
	protected Date ngaySinh102;
	protected String queQuan102;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen102 = hoTen;
		this.ngaySinh102 = ngaySinh;
		this.queQuan102 = queQuan;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen102 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh102 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan102 = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen102);
		System.out.println("\tNgay sinh: " + ngaySinh102);
		System.out.println("\tQue quan: " + queQuan102);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan102;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh102;
	}
}
