package ar.algorithms;

public class GronsfeldCipher {

	public static final String ALPHABET = " !\"#$%&'()*+,-./0123456789:<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public String[] decipherLines(String keyDelimiter, String... lines) {

		String[] plain = new String[lines.length];
		for (int i = 0; i < lines.length; i++) {
			plain[i] = decipher(keyDelimiter, lines[i]);
		}
		return plain;
	}

	public String decipher(String keyDelimiter, String string) {

		String key = string.split(keyDelimiter)[0];
		String line = string.split(keyDelimiter)[1];

		StringBuilder plain = new StringBuilder("");

		for (int i = 0; i < line.length(); i++) {

			char cipheredChar = line.charAt(i);
			int alphabetIndex = ALPHABET.indexOf(cipheredChar);
			int keyIndex = Integer.parseInt(String.valueOf(key.charAt(i % key.length())));

			int index = alphabetIndex - keyIndex;
			if (index < 0)
				index += ALPHABET.length();
			char p = ALPHABET.charAt(index);

			plain.append(String.valueOf(p));
		}

		return plain.toString();
	}

}
