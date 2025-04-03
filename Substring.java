package stringPractise;

public class Substring {
	public static void substr(String str, int si, int ei) {
		String substr = "";
		for(int i = si; i < ei; i++) {
			substr = substr + str.charAt(i);
		}
		System.out.print(substr);
	}
	public static void main(String []args) {
		String str = "Laxmikant";
		Substring.substr(str, 0, 5);
	}
}
