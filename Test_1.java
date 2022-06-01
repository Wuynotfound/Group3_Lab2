package baitap;
import java.util.*;

class Sohoc {
	int a[];
	
	void nhapMang(){
	    Scanner  scan = new Scanner(System.in);
	    System.out.print("Nhap so phan tu cua mang: ");
	    int n = scan.nextInt();
	    a = new int[n];
	    for (int i=0; i<a.length;i++)
	    {
	        System.out.print("Nhap phan tu thu "+(i)+ 1+": ");
	        a[i] = scan.nextInt();
	    }
	}
	
	void xuatMang() {
	    for (int i=0; i<a.length;i++){
	        System.out.print(a[i]+ "\t");
	    }
	        System.out.println();
	}
	
	void maxMang() {
		int max = a[0];
		for(int i = 1; i < a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max = "+ max);
	}
	
	void SapXepMangTang() {
		for(int i = 0; i < a.length -1; i ++)
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}
	
	boolean KiemTraNguyenTo(int n){
		if(n<2) {
	        return false;
	    }
		for(int i=2; i<=Math.sqrt(n); i++) {
	        if(n%i==0) {
	        	return false;
	        }
	    }
	    return true;
	}
	
	void xuatSoNguyenTo() {
	    for (int i=0; i<a.length;i++){
	        if(KiemTraNguyenTo (a[i])){
	            System.out.print(a[i]+ "\t");
	        }
	        System.out.print(" ");
	    }
	}	
}
	
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sohoc sc = new Sohoc();
		sc.nhapMang();
		System.out.println("Mang vua nhap: ");
		sc.xuatMang();
		System.out.println("Phan tu lon nhat trong mang: ");
		sc.maxMang();
		System.out.println("Sap xep danh sach theo thu tu tang dan: ");
		sc.SapXepMangTang();
		sc.xuatMang();
		System.out.println("Cac so nguyen to co trong mang: ");
		sc.xuatSoNguyenTo();
	}

}
