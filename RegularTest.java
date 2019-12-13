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

		// ���̵�: ���� ���� �Ұ���, ����/���ڸ� ��� ����
		input = JOptionPane.showInputDialog("���̵� �Է��ϼ���");
		regExp = "^[A-z][\\w]*$";
		errorMsg = "���̵�� ���ڷ� ������ �� ������, ����/���ڷθ� �����˴ϴ�.";
		regex(input, regExp, errorMsg);

		// ����� �̸�: �ѱ�/����/���ڸ� ����
		regExp = "^[��-�R \\w].{1,}$";
		input = JOptionPane.showInputDialog("����� �̸��� �Է��ϼ���");
		errorMsg = "����� �̸��� �ѱ�/����/���ڷ� �Է� �����մϴ�.";
		regex(input, regExp, errorMsg);

		// ��й�ȣ: �ּ� �ϳ��� ���ڿ� ����(���� �Ұ�)
		input = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
		regExp = "^(?=.*\\d)(?=.*[A-z]).{2,}$";
		errorMsg = "��й�ȣ�� �ּ� �ϳ��� ���ڿ� ���ڰ� �ʿ��մϴ�.";

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
