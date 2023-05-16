package baithuchanhlab4.src.baitap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class slide85 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> newHs= new HashMap<>();
		newHs.put("BG", "Bac Giang");
		newHs.put("TB","Thai Binh");
		newHs.put("HN","Ha Nam");
		Set<Map.Entry<String,String>> SetnewHs = newHs.entrySet();
		System.out.println(" cac entry co trong map la:");
		System.out.println(SetnewHs);
	
}
}


    
