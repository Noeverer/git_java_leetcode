package SXT_java;

//测试第48节this的使用场景

public class A48_This_Object {
	int id;
	String name;
	String pwd;



	public A48_This_Object() {
		
	}

	public A48_This_Object(int id ,String name) {
		System.out.println("strating initializing the created object:" + this);
		this.id = id;
		this.name = name;
	}

	public void login() {
		System.out.println(this.name + ", wanting login!");
	}

	public static void main(String[] args) {
		A48_This_Object robot = new A48_This_Object(1001,"robot_liuxiangqian");  //没有明白
		System.out.println("print object:" + robot);
		robot.login();	
	}

}