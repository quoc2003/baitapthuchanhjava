package baitap;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class slide59 {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	LinkedHashSet< String> lhs = new LinkedHashSet<>();
	lhs.add("Vũ");
	lhs.add("Nguyên");
	lhs.add("Quốc");
	System.out.println("Nhập 1 phần tử cần xóa :");
	String number = sc.nextLine();
	if(lhs.contains(number)) {
		lhs.remove(number);
		System.out.println("dãy sau khi xóa:");
		System.out.println(lhs);
	}else
		System.out.printf("Không tồn tại %s trong dãy",number);
	
}
}