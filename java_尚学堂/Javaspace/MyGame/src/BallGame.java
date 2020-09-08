import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	
	double x=100;
	double y=100;
	
	boolean right = true;
	
	public void paint(Graphics g) {
		System.out.println("绘制窗口函数");
		g.drawImage(desk,0, 0, null);
		String x_str = String.format("%f", x);
		String y_str = String.format("%f", y);
		System.out.println("x:%d , y:%d"+x_str+y_str);
		g.drawImage(ball, (int)x,(int)y, null);
	
	
		if (right) {
			x+=10;
		}else {
			x-=10;
		}
		
		if (x>856-40-30) {
			right=false;
		}
		if (x<40){
			right=true;
		}
	}



	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//重画窗口，每秒画25次
		int num=1;
		while(true) {
			repaint();
			num+=1;
			if(num>10) {
				break;
			}
			try {
				Thread.sleep(40); //40ms,每秒绘制窗口20次
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		String cwd= System.getProperty("user.dir");
		System.out.println("获取当前的路径："+ cwd);
		BallGame game = new BallGame();
		game.launchFrame();
		
	}
	
}
