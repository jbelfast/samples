package ar.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class DoubleSquaresTest {

	@Test
	public void testCompute() {

		assertThat(DoubleSquares.compute(10), is(1));
		assertThat(DoubleSquares.compute(25), is(2));
		assertThat(DoubleSquares.compute(3), is(0));
		assertThat(DoubleSquares.compute(0), is(1));
		assertThat(DoubleSquares.compute(1), is(1));
	}

}
