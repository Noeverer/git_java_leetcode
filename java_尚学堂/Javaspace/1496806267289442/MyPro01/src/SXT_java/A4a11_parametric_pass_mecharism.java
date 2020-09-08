package SXT_java;

public class A4a11_parametric_pass_mecharism {
	int id;
	String name;
	String pwd;
	
	public A4a11_parametric_pass_mecharism(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(A4a11_parametric_pass_mecharism user) {
		user.name= "robotxiang";  //这样的修改是有效在于，user.name 寻找到初始化前的地址，并进行修改
	}
	
	public void testParameterTransfer02(A4a11_parametric_pass_mecharism user) {
		//为什么修改是没有用的，是因为新创建类好比创建的是一个空间，而后面的输出打印的是未覆盖前的值
//		user = new A4a11_parametric_pass_mecharism(1002,"robotliuxiangqian");  //这样的修改也是没有道理的
//		除非一开始初始化修改类的属性值
	}
	
	
	public static void main(String[] args) {
		
		//对构造的类进行实例化成user，并且初始化参数
		A4a11_parametric_pass_mecharism user = new A4a11_parametric_pass_mecharism(1001,"robotliu");
		
		//调用testParameterTransfer01()方法，并且赋值其方法下面的参数
		user.testParameterTransfer01(user);
		System.out.println(user.name);

		//思考怎么去打印修改后的user.name
		user.testParameterTransfer02(user);
		System.out.println(user.name);
		
	}
	
	
	
}
