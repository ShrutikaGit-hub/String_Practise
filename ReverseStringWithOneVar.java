package stringPractise;

public class ReverseStringWithOneVar {
	
	public static void main(String[] args) {
		String str = "Shrutika";
		char []arr = str.toCharArray();
		
		for(int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		str = String.valueOf(arr);
		System.out.println(str);
	}
}
