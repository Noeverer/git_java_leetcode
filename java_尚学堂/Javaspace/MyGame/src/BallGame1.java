import javax.swing.*;

//实现动画，小球沿水平方向移动并做边缘检测
public class BallGame1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	void launchFrame() {
		setSize(300,300);
		setLocation(50,50);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("窗口绘制了一次");
		BallGame1 game = new BallGame1();
		game.launchFrame();
	}
	
	
}
