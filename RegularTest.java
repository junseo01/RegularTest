package src;

import javax.swing.JOptionPane;

public class RegularTest {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		String input = null;
		String regExp = null;
		String errorMsg = null;

		// ¾ÆÀÌµğ: ¼ıÀÚ ½ÃÀÛ ºÒ°¡´É, ¿µ¹®/¼ıÀÚ¸¸ »ç¿ë °¡´É
		input = JOptionPane.showInputDialog("¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		regExp = "^[A-z][\\w]*$";
		errorMsg = "¾ÆÀÌµğ´Â ¼ıÀÚ·Î ½ÃÀÛÇÒ ¼ö ¾øÀ¸¸ç, ¿µ¹®/¼ıÀÚ·Î¸¸ ±¸¼ºµË´Ï´Ù.";
		regex(input, regExp, errorMsg);

		// »ç¿ëÀÚ ÀÌ¸§: ÇÑ±Û/¿µ¹®/¼ıÀÚ¸¸ °¡´É
		regExp = "^[°¡-ÆR \\w].{1,}$";
		input = JOptionPane.showInputDialog("»ç¿ëÀÚ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä");
		errorMsg = "»ç¿ëÀÚ ÀÌ¸§Àº ÇÑ±Û/¿µ¹®/¼ıÀÚ·Î ÀÔ·Â °¡´ÉÇÕ´Ï´Ù.";
		regex(input, regExp, errorMsg);

		// ºñ¹Ğ¹øÈ£: ÃÖ¼Ò ÇÏ³ªÀÇ ¹®ÀÚ¿Í ¼ıÀÚ(°ø¹é ºÒ°¡)
		input = JOptionPane.showInputDialog("ºñ¹Ğ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		regExp = "^(?=.*\\d)(?=.*[A-z]).{2,}$";
		errorMsg = "ºñ¹Ğ¹øÈ£´Â ÃÖ¼Ò ÇÏ³ªÀÇ ¹®ÀÚ¿Í ¼ıÀÚ°¡ ÇÊ¿äÇÕ´Ï´Ù.";

		regex(input, regExp, errorMsg);
	}

	private static void regex(String input, String regExp, String errorMsg) {
		if (input.matches(regExp)) {
			System.out.println("true");
		} else {
			System.out.println(errorMsg);
		}
	}

}
