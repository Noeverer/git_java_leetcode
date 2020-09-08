package p13_Game01;
 
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
 

@SuppressWarnings("serial")
public class MyGameFrame extends Frame {
	
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    Plane plane = new Plane(planeImg ,300 ,300,3);
    ArrayList<Shell>  shellList = new ArrayList<Shell>();  
    
    //paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ����á�
    @Override
    public void paint(Graphics g) {  
        g.drawImage(bgImg, 0, 0, null);
        plane.drawMySelf(g);    //�����ɻ�����  
        //�������������е��ӵ�
        for(int i=0;i< shellList.size();i++){
            Shell b =  shellList.get(i);
            b.draw(g);
        }
    }
}


/*
@SuppressWarnings("serial")
public class MyGameFrame extends Frame {
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    Plane plane = new Plane(planeImg ,300 ,300,3);
    static int count = 0;
     
    //paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ����á�
    @Override
    public void paint(Graphics g) {  
        g.drawImage(bgImg, 0, 0, null);
        System.out.println("����paint���ػ����ڣ�������"+(count++));
        g.drawImage(planeImg, 200, 200, null);
    }
    */
    
    
    



    
    // ����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	class PaintThread extends Thread {
	    public void run(){
	        while(true){
	            repaint();
	            try {
	                Thread.sleep(40); //1s = 1000ms
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }   
	        }
	    }
	}  
    
    
    public class launchFrame extends Frame{
        //����Ϸ���ڴ�ӡ����
        setTitle("dafeiji");
        //����Ĭ�ϲ��ɼ�����Ϊ�ɼ�
        setVisible(true);
        //���ڴ�С�����500���߶�500
        setSize(500, 500);
        //�������ϽǶ��������λ��
        setLocation(300, 300);
         
        //���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();  //�����ػ��߳�
        
        addKeyListener(new KeyMonitor());//���Ӽ��̵ļ���
    }
    
    
  //����Ϊ�ڲ��࣬���Է����ʹ���ⲿ�����ͨ����
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }
    
    
    class KeyMonitor extends KeyAdapter{
    	
    }
    
    
    
    
    //���������
    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}