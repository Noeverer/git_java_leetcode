package SXT_java;

public class A434_Object_Student {
	
	int id;
	String name;
	int age;
	Computer computer;
	
	//����
	void study() {
		System.out.println("i am studying.." + computer.brand);
		
	}
	
	void play() {
		System.out.println("i am playing...");
		
	}
	
	/**
	//���췽�������ڴ��������Ķ����޲εĹ��췽��������ϵͳ�Զ�����,���������Լ�����
	A434_Object_Student(){
		
	}
	**/
	
	
	public static void main(String[] args) {
		A434_Object_Student student = new A434_Object_Student();
		student.id = 1001;
		student.name = "Jim Liu";
		student.age = 26;
		
		//��Computer�������ʵ��������Ϊc1
		Computer c1 = new Computer();
		
		//����Computer�е�brand���ԣ����г�ʼ������
		c1.brand = "thinkpade580";
		
		//��c1�����Դ��ݸ�student.comp
		student.computer = c1;
		
				
		
		student.play();
		student.study();
		
	}
	
}

//����Computer�࣬������������brand
class Computer{
	String brand;
	
}

