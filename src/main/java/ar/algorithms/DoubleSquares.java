package ar.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 * See https://www.codeeval.com/open_challenges/33/
 * 
 * Credits: This challenge appeared in the Facebook Hacker Cup 2011.
 * 
 * A double-square number is an integer X which can be expressed as the sum of
 * two perfect squares. For example, 10 is a double-square because 10 = 3^2 +
 * 1^2. Your task in this problem is, given X, determine the number of ways in
 * which it can be written as the sum of two squares.
 * 
 * For example, 10 can only be written as 3^2 + 1^2 (we don't count 1^2 + 3^2 as
 * being different). On the other hand, 25 can be written as 5^2 + 0^2 or as 4^2
 * + 3^2.
 * 
 * 
 * @author Nacho
 *
 */
public class DoubleSquares {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		boolean read = false;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if (read) {
				long n = Long.parseLong(line);
				int rdo = compute(n);
				System.out.println(rdo);
			} else {
				read = true;
			}
			// Process line of input Here
		}
	}

	public static int compute(long n) {

		System.out.printf("Evaluating %d%n", n);
		Stack<Long> first = new Stack<>();
		Stack<Long> second = new Stack<>();

		double n1 = Math.sqrt(n);

		long fini = 0;
		for (long i = (long) n1; i >= fini; i--) {
			long iniJ = (second.size() > 0) ? second.peek() + 1 : 0;
			long finJ = (first.size() > 0) ? first.peek() - 1 : (long) n1;
			for (long j = iniJ; j <= finJ; j++) {

				long z = i * i + j * j;

				System.out.printf("%d^2 + %d^2 = %d", i, j, z);
				if (z == n) {
					first.push(i);
					second.push(j);
					System.out.println(" x ");
					break;
				} else if (z > n) {
					System.out.println();
					break;
				} else {
					System.out.println();
				}
				fini = j;
			}
		}
		System.out.println();
		return first.size();
	}
}
