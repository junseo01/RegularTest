package src;

import javax.swing.JOptionPane;


public class RegularTest {

   public static void main(String[] args) {
      
      //���̵�: ���� ���� �Ұ���, ����/���ڸ� ��� ����
      String input= JOptionPane.showInputDialog("���̵� �Է��ϼ���");
      String regExp ="^[A-z][\\w]*$";
      if(input.matches(regExp)) {
         System.out.println("true");
      }
      else {
         System.out.println("���̵�� ���ڷ� ������ �� ������, ����/���ڷθ� �����˴ϴ�.");
      }
      
      //����� �̸�: �ѱ�/����/���ڸ� ����
      String regExp1="^[��-�R \\w]*$";
      String input1=JOptionPane.showInputDialog("����� �̸��� �Է��ϼ���");
      
      if(input1.matches(regExp1)) {
         System.out.println("true");
      }
      else {
         System.out.println("����� �̸��� �ѱ�/����/���ڷ� �Է� �����մϴ�.");
      }
      
      //��й�ȣ: �ּ� �ϳ��� ���ڿ� ����(���� �Ұ�)
      String input2=JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
      String regExp2="^(?=.*\\d)(?=.*[A-z]).{2,}$";//^[a-Z|\\d]{2,}$
      
      if(input2.matches(regExp2)) {
         System.out.println("true");
      }
      else {
         System.out.println("��й�ȣ�� �ּ� �ϳ��� ���ڿ� ���ڰ� �ʿ��մϴ�.");
      }
      
   }
}

