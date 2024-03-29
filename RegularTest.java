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

		// 아이디: 숫자 시작 불가능, 영문/숫자만 사용 가능
		input = JOptionPane.showInputDialog("아이디를 입력하세요");
		regExp = "^[A-z][\\w]*$";
		errorMsg = "아이디는 숫자로 시작할 수 없으며, 영문/숫자로만 구성됩니다.";
		regex(input, regExp, errorMsg);

		// 사용자 이름: 한글/영문/숫자만 가능
		regExp = "^[가-힣 \\w].{1,}$";
		input = JOptionPane.showInputDialog("사용자 이름을 입력하세요");
		errorMsg = "사용자 이름은 한글/영문/숫자로 입력 가능합니다.";
		regex(input, regExp, errorMsg);

		// 비밀번호: 최소 하나의 문자와 숫자(공백 불가)
		input = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		regExp = "^(?=.*\\d)(?=.*[A-z]).{2,}$";
		errorMsg = "비밀번호는 최소 하나의 문자와 숫자가 필요합니다.";

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
