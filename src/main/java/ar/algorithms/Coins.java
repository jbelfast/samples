package ar.algorithms;

import org.apache.log4j.Logger;

/**
 * Provided a set of different denomination coins, it returns how many different
 * ways are to get the value.
 *
 */
public class Coins {

	private static Logger logger = Logger.getLogger(Coins.class);
	
	public int getValue(int[] coins, int value) {
		int cant = compute(coins, value, "", 0);
		return cant;
	}

	private int compute(int[] c, int v, String a, int cant) {

		for (int i = 0; i < c.length; i++) {
			int aux = v - c[i];
			if (aux == 0) {
				logger.debug(String.format("%s) %s%s", ++cant, a, c[i]));
				return cant;
			} else if (aux < 0) {
				break;
			} else {
				cant = compute(c, aux, a + c[i] + ",", cant);
			}
		}
		return cant;
	}

}
