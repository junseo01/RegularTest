package src;

import javax.swing.JOptionPane;


public class RegularTest {

   public static void main(String[] args) {
      
      //¾ÆÀÌµğ: ¼ıÀÚ ½ÃÀÛ ºÒ°¡´É, ¿µ¹®/¼ıÀÚ¸¸ »ç¿ë °¡´É
      String input= JOptionPane.showInputDialog("¾ÆÀÌµğ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
      String regExp ="^[A-z][\\w]*$";
      if(input.matches(regExp)) {
         System.out.println("true");
      }
      else {
         System.out.println("¾ÆÀÌµğ´Â ¼ıÀÚ·Î ½ÃÀÛÇÒ ¼ö ¾øÀ¸¸ç, ¿µ¹®/¼ıÀÚ·Î¸¸ ±¸¼ºµË´Ï´Ù.");
      }
      
      //»ç¿ëÀÚ ÀÌ¸§: ÇÑ±Û/¿µ¹®/¼ıÀÚ¸¸ °¡´É
      String regExp1="^[°¡-ÆR \\w]*$";
      String input1=JOptionPane.showInputDialog("»ç¿ëÀÚ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä");
      
      if(input1.matches(regExp1)) {
         System.out.println("true");
      }
      else {
         System.out.println("»ç¿ëÀÚ ÀÌ¸§Àº ÇÑ±Û/¿µ¹®/¼ıÀÚ·Î ÀÔ·Â °¡´ÉÇÕ´Ï´Ù.");
      }
      
      //ºñ¹Ğ¹øÈ£: ÃÖ¼Ò ÇÏ³ªÀÇ ¹®ÀÚ¿Í ¼ıÀÚ(°ø¹é ºÒ°¡)
      String input2=JOptionPane.showInputDialog("ºñ¹Ğ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
      String regExp2="^(?=.*\\d)(?=.*[A-z]).{2,}$";//^[a-Z|\\d]{2,}$
      
      if(input2.matches(regExp2)) {
         System.out.println("true");
      }
      else {
         System.out.println("ºñ¹Ğ¹øÈ£´Â ÃÖ¼Ò ÇÏ³ªÀÇ ¹®ÀÚ¿Í ¼ıÀÚ°¡ ÇÊ¿äÇÕ´Ï´Ù.");
      }
      
   }
}

