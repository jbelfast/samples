package ar.algorithms;

import org.apache.log4j.Logger;

/**
 * It computes square root using Newton's method.
 * 
 */
public class Sqrt {

	private static Logger logger = Logger.getLogger(Sqrt.class);
	
	public double sqrt(double x) {

		double y = x / 2;
		double xOverY;
		int i = 0;
		do {
			xOverY = x / y;
			logger.debug(String.format("%s) y=%s x/y=%s", ++i, y, xOverY));
			y = (xOverY + y) / 2;
		} while (Math.abs(xOverY - y) > 0.00000000001);

		return y;
	}
}
