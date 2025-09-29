import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] values = {1000,900, 500, 400, 100,90,50,40,10,9,5,4,1);
		String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuilder sb = new StringBuilder();
		for(int i = 0 i < values.length; i++) {
				while(num >= values[i]) {
					sb.append(romans[i]);
					num -= values[i];
				}
		}
	System.out.println(sb.toString());
	}
}
