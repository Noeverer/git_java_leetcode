package SXT_java;

public class A434_Object_Student {
	
	int id;
	String name;
	int age;
	Computer computer;
	
	//方法
	void study() {
		System.out.println("i am studying.." + computer.brand);
		
	}
	
	void play() {
		System.out.println("i am playing...");
		
	}
	
	/**
	//构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动创建,不用我们自己创建
	A434_Object_Student(){
		
	}
	**/
	
	
	public static void main(String[] args) {
		A434_Object_Student student = new A434_Object_Student();
		student.id = 1001;
		student.name = "Jim Liu";
		student.age = 26;
		
		//对Computer的类进行实例化操作为c1
		Computer c1 = new Computer();
		
		//调用Computer中的brand属性，进行初始化配置
		c1.brand = "thinkpade580";
		
		//将c1的属性传递给student.comp
		student.computer = c1;
		
				
		
		student.play();
		student.study();
		
	}
	
}

//构造Computer类，类里面由属性brand
class Computer{
	String brand;
	
}

