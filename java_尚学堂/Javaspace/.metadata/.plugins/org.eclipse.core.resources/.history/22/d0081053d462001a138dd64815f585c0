

public class User {
	int id; // id
	String name; // 账户名
	String pwd; // 密码
	
	static String company = "baoshang university";

	public User(int id, String name)
	//像这样的出错应该是不知道应该继承谁，所以会出现错误【即User继承自p4_8_this,即两者类不一致】
	{
	        System.out.println("正在初始化已经创建好的对象："+this.name);
	        this.id = id;   //不写this，无法区分局部变量id和成员变量id
	        this.name = name;
	    }

	public void login() {
		System.out.println(this.name + ",要登录！"); // 不写this效果一样
	}
	
	public static void printCompany() {
		System.out.println(company);
	}

	public static void main(String[] args) {
		User u3 = new User(101, "高小七");
		System.out.println("打印高小七对象：" + u3);
		u3.login();
	}
}
