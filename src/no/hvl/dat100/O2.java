package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
	public static void main(String[] args) {

		String sum1 = showInputDialog("Total sum");
		int sum = parseInt(sum1);
		if (sum >= 1350001) {
			System.out.print("Trinn 5 skatt "
					+ (292851 * 0.017 + 670001 * 0.04 + 937091 * 0.137 + 1350000 * 0.166 + (sum - 1350000) * 0.176));
		}

		else {
			if (1350000 >= sum && sum >= 937091) {
				System.out.print(
						"Trinn 4 skatt " + (292851 * 0.017 + 670001 * 0.04 + 937091 * 0.137 + (sum - 937091) * 0.166));
			}

			else {
				if (937091 > sum && sum >= 670001) {
					System.out.print("Trinn 3 skatt " + (292851 * 0.017 + 670001 * 0.04 + (sum - 670001) * 0.137));
				}

				else {
					if (670001 > sum && sum >= 292851) {
						System.out.print("Trinn 2 skatt " + (292851 * 0.017 + (sum - 292851) * 0.04));
					}

					else {
						if (292851 > sum && sum >= 208051) {
							System.out.print("Trinn 1 skatt " + sum * 0.017);
						}

						else {
							if (208051 > sum && sum > 0) {
								System.out.print("Du betaler ikke skatt ");
							}

						}
					}

				}
			}
		}
	}
}

