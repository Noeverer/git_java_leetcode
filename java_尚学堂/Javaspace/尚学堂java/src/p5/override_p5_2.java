package p5;
import p5.extends_p5_1.Person;
import p5.extends_p5_1.Student;  /*import不同包的方式*/

public class override_p5_2 {
	public static void main(String[] args) {
		Student2 stu = new Student2("宫小玉",165,"高数");
		stu.study();
		stu.rest();
		/*判断是否属于继承关系
		 * */
		System.out.println(stu instanceof Person);
		System.out.println(stu instanceof Student2);
		System.out.println(new Person() instanceof Student);
	}
}

//override 的尝试，感觉是对person类重写

class Student2 extends Person{
	String major;
    public void study() {
		System.out.printf("求求你不要学习%s了，和我玩吧！！！\t\n",major);
	}
    
    public Student2(String name,int height,String major) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height= height;
		this.major=major;
    }
}






//	class Person{
//		String name;
//		int height;
//		String str_height = Double.toString(height);
//		public void rest() {
//			System.out.println(name + "敲代码累了，休息一会！！！" + str_height);
//			
//		}
//	}


		
//	class Student extends Person{
//		String major;
//		public void study(){
//			System.out.printf("努力学习%s技术！！！\t\n",major);
//		   }
//		/*理解this的指代关系*/
//		public Student(String name,int height,String major) {
//			// TODO Auto-generated constructor stub
//			this.name = name;
//			this.height= height;
//			this.major=major;
//		}
//	}
