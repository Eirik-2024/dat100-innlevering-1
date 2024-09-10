package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		for (int i = 1; i <= n; i++) {
			String sum1 = showInputDialog("Poeng sum prøve");
			int sum = parseInt(sum1);

			if (sum <= 100 && sum >= 90) {
				System.out.println("A");
			}

			else {
				if (89 >= sum && sum >= 80) {
					System.out.println("B");
				}

				else {
					if (79 >= sum && sum >= 60) {
						System.out.println("C");
					}

					else {
						if (59 >= sum && sum >= 50) {
							System.out.println("D");
						}

						else {
							if (49 >= sum && sum >= 40) {
								System.out.println("E");
							}

							else {
								if (39 >= sum && sum > 0) {
									System.out.println("F");
								}

								else {
									if (sum > 100 || sum < 0) {
										System.out.println("Ugyldig nummer, skriv tall på nytt ");
										n++;

									}
								}
							}
						}

					}
				}
			}
		}

	}
}


