package stringPractise;

public class VowelsConsonants {
	public static void count(String str) {
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)== 'a') {
				vowels = vowels + 1;
			}
			else if(str.charAt(i)=='e') {
				vowels = vowels + 1;
			}
			else if(str.charAt(i)=='i') {
				vowels = vowels + 1;
			}
			else if(str.charAt(i)=='o') {
				vowels = vowels + 1;
			}
			else if(str.charAt(i)=='u') {
				vowels = vowels + 1;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Consonants are "+consonants);
		System.out.println("Vowels are "+vowels);
	}
	public static void main(String []args) {
		String str = "shrutika asalkar";
		count(str);
	}
}
