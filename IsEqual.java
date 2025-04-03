package stringPractise;

public class IsEqual {
	public static boolean isequal(String str, String str1) {
		if(str.equals(str1)) {
			return true;
		}
		return false;
	}
	public static void main(String []args) {
		String str = "Tony";
		String str1 = "Tony1";
		boolean result = IsEqual.isequal(str, str1);
		System.out.print(result);
	}
}
