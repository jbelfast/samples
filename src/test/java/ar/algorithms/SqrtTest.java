package ar.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class SqrtTest {

	@Test
	public void testSqrt() {

		Sqrt sqrt = new Sqrt();

		assertThat(sqrt.sqrt(4), is(2.0));
		assertThat(sqrt.sqrt(49), is(7.0));
		assertThat(sqrt.sqrt(144), is(12.0));
		assertThat(sqrt.sqrt(2), is(closeTo(1.4,0.1)));
	}

}
