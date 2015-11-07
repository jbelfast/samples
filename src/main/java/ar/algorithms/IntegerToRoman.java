package ar.algorithms;

public class IntegerToRoman {

	public String int2Roman(int num) {
		StringBuilder roman = new StringBuilder("");

		// M
		int r = num - 1000;
		while (r >= 0) {
			roman.append("M");
			r -= 1000;
		}
		num %= 1000;
		
		// CM
		r = num - 900;
		while (r >= 0) {
			roman.append("CM");
			r -= 900;
		}
		num %= 900;
		
		// D
		r = num - 500;
		while (r >= 0) {
			roman.append("D");
			r -= 500;
		}
		num %= 500;
		
		// CD
		r = num - 400;
		while (r >= 0) {
			roman.append("CD");
			r -= 400;
		}
		num %= 400;
		
		// C
		r = num - 100;
		while (r >= 0) {
			roman.append("C");
			r -= 100;
		}
		num %= 100;
		
		// XC
		r = num - 90;
		while (r >= 0) {
			roman.append("XC");
			r -= 90;
		}
		num %= 90;
		
		// L
		r = num - 50;
		while (r >= 0) {
			roman.append("L");
			r -= 50;
		}
		num %= 50;
		
		// XL
		r = num - 40;
		while (r >= 0) {
			roman.append("XL");
			r -= 40;
		}
		num %= 40;
		
		// X
		r = num - 10;
		while (r >= 0) {
			roman.append("X");
			r -= 10;
		}
		num %= 10;
		
		// IX
		r = num - 9;
		while (r >= 0) {
			roman.append("IX");
			r -= 9;
		}
		num %= 9;
		
		// V
		r = num - 5;
		while (r >= 0) {
			roman.append("V");
			r -= 5;
		}
		num %= 5;
		
		// IV
		r = num - 4;
		while (r >= 0) {
			roman.append("IV");
			r -= 4;
		}
		num %= 4;
		
		// I
		r = num - 1;
		while (r >= 0) {
			roman.append("I");
			r -= 1;
		}
				
		return roman.toString();
	}

	private void int2RomanAux(int num, StringBuilder roman) {
		int temp = num - 1000;
		if (temp >= 0) {
			roman.append("M");
			int2RomanAux(temp, roman);
		} else {
			temp = num - 500;
			if (temp >= 0) {
				roman.append("L");
				int2RomanAux(temp, roman);
			}
		}

	}

}
