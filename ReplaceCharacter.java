package stringPractise;

public class ReplaceCharacter {
	public static String replace(String str, char old, char newchar) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == old) {
				result.append(newchar);
			}
			else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	public static void main(String []args) {
		String str = "Shrutika Asalkar";
		String result = ReplaceCharacter.replace(str, 'a', 'k');
		System.out.print(result);
	}
}
