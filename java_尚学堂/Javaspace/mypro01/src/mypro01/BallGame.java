package mypro01

import java.awt.*;
import javax.swing.*;
  
public class BallGame extends JFrame {
      
      
     //窗口加载
     void launchFrame(){
         setSize(300,300);
         setLocation(400,400);
         setVisible(true);
          
     }
      
     //main方法是程序执行的入口
     public static void main(String[] args){
         System.out.println(" 我是尚学堂高淇，这个游戏项目让大家体验编程的快感，寓教于乐！");
         BallGame game = new BallGame();
         game.launchFrame();
     }
      
}