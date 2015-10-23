package ar.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import ar.algorithms.Coins;

public class CoinsTest {

	@Test
	public void testGetValue() {
		Coins coins = new Coins();
		int[] c = { 1, 2 };
		int value = 4;

		assertThat(coins.getValue(c, value), is(5));

	}

}
