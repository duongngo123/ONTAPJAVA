/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.util.Scanner;
import BAI1.PhanSo;
/**
 *
 * @author HO TUNG DUONG
 */

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhanSo ps1=new PhanSo();
		PhanSo ps2=new PhanSo();
		PhanSo psTong =new PhanSo();
		
		// nhap phan so
		System.out.println("Nhap vao phan so thu nhat:");
		ps1.nhapPS(sc);
		System.out.println("Nhap vao phan so thu hai:");
		ps2.nhapPS(sc);
		
		// tinh tong 2 phan so
		psTong=ps1.congPS(ps2);
		
		// hien thi phan so
		System.out.println("\nPhan so thu nhat la:");
		ps1.hienthiPS();
		System.out.println("\nPhan so thu hai la:");
		ps2.hienthiPS();
		System.out.println("\nPhan so tong la:");
		psTong.hienthiPS();
		
		sc.close();
	}

}



