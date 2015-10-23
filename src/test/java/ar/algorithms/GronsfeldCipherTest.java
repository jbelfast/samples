package ar.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class GronsfeldCipherTest {

	// @Test
	public void testDecipherLines() {
		// fail("Not yet implemented");
	}

	@Test
	public void testDecipher() {

		GronsfeldCipher gronsfeldCipher = new GronsfeldCipher();
		
		assertThat(gronsfeldCipher.decipher(";", "31415;HYEMYDUMPS"), is("EXALTATION") );
		
		assertThat(gronsfeldCipher.decipher(";", "45162;M%muxi%dncpqftiix\""), is("I love challenges!") );
		
		assertThat(gronsfeldCipher.decipher(";", "14586214;Uix!&kotvx3"), is("Test input.") );
	}

}
