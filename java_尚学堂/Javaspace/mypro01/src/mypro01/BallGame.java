package mypro01

import java.awt.*;
import javax.swing.*;
  
public class BallGame extends JFrame {
      
      
     //���ڼ���
     void launchFrame(){
         setSize(300,300);
         setLocation(400,400);
         setVisible(true);
          
     }
      
     //main�����ǳ���ִ�е����
     public static void main(String[] args){
         System.out.println(" ������ѧ�ø�俣������Ϸ��Ŀ�ô�������̵Ŀ�У�Ԣ�����֣�");
         BallGame game = new BallGame();
         game.launchFrame();
     }
      
}