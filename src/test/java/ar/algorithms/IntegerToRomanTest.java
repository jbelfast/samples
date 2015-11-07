package ar.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void testInt2Roman() {

		IntegerToRoman i2r = new IntegerToRoman();

		assertThat(i2r.int2Roman(10), is("X"));

		assertThat(i2r.int2Roman(100), is("C"));

		assertThat(i2r.int2Roman(450), is("CDL"));

		assertThat(i2r.int2Roman(666), is("DCLXVI"));

		assertThat(i2r.int2Roman(999), is("CMXCIX"));

		assertThat(i2r.int2Roman(1444), is("MCDXLIV"));

		assertThat(i2r.int2Roman(2008), is("MMVIII"));

		assertThat(i2r.int2Roman(2009), is("MMIX"));

	}

}
