package javacrap;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#x)%n", ch, code, code);
		char hch = '나';
		System.out.printf("%c=%d(%#x)%n", hch, (int)hch, (int)hch);

	}

}
