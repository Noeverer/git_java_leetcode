package p7;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MygameFrame2 extends JFrame{
	/**
	 * 学习如何加载图片的方式
	 */
	private static final long serialVersionUID = 1L;
	
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	
	
	public void paint(Graphics g) {
//		g.drawLine(100, 100, 50, 50);  //绘制直线
//		g.draw3DRect(100, 50, 10, 20, true);
		
		g.drawImage(desk, 0, 0, null);   //加载图片是有先后顺序的
		g.drawImage(ball, 100, 100, null);  //加载图片

	}

	public void launchFrame() {
		this.setTitle("Liuxiangqian");
		this.setVisible(true);
		this.setSize(856,501);
		this.setLocation(200,100);
		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MygameFrame2 f = new MygameFrame2();
		f.launchFrame();
	}

}
