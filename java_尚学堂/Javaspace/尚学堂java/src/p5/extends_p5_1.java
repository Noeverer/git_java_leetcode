package p5;


public class extends_p5_1 {
	public static void main(String[] args) {
		Student stu = new Student("liuxiangqian",175,"java");
		stu.study();
		stu.rest();
		/*判断是否属于继承关系
		 * */
		System.out.println(stu instanceof Person);
		System.out.println(stu instanceof Student);
		System.out.println(new Person() instanceof Student);
		
	}
}
	
	class Person{
		String name;
		int height;
		String str_height = Double.toString(height);
		public void rest() {
			System.out.println(name + "敲代码累了，休息一会！！！" + str_height);
			
		}
	}
		
	class Student extends Person{
		String major;
		public void study(){
			System.out.printf("努力学习%s技术！！！\t\n",major);
		   }
		/*理解this的指代关系*/
		public Student(String name,int height,String major) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.height= height;
			this.major=major;
		}
	}
