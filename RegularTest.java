package src;

import javax.swing.JOptionPane;


public class RegularTest {

   public static void main(String[] args) {
      
      //아이디: 숫자 시작 불가능, 영문/숫자만 사용 가능
      String input= JOptionPane.showInputDialog("아이디를 입력하세요");
      String regExp ="^[A-z][\\w]*$";
      if(input.matches(regExp)) {
         System.out.println("true");
      }
      else {
         System.out.println("아이디는 숫자로 시작할 수 없으며, 영문/숫자로만 구성됩니다.");
      }
      
      //사용자 이름: 한글/영문/숫자만 가능
      String regExp1="^[가-힣 \\w]*$";
      String input1=JOptionPane.showInputDialog("사용자 이름을 입력하세요");
      
      if(input1.matches(regExp1)) {
         System.out.println("true");
      }
      else {
         System.out.println("사용자 이름은 한글/영문/숫자로 입력 가능합니다.");
      }
      
      //비밀번호: 최소 하나의 문자와 숫자(공백 불가)
      String input2=JOptionPane.showInputDialog("비밀번호를 입력하세요");
      String regExp2="^(?=.*\\d)(?=.*[A-z]).{2,}$";//^[a-Z|\\d]{2,}$
      
      if(input2.matches(regExp2)) {
         System.out.println("true");
      }
      else {
         System.out.println("비밀번호는 최소 하나의 문자와 숫자가 필요합니다.");
      }
      
   }
}

