package p7;



public class arrays_p7_1 {
	public static void main(String[] args) {
		
		// 常规遍历数组
		int[] a = new int[5];
		//进行赋值
		for (int i = 0; i < a.length; i++) {
			a[i]=i*10;
		}
		//遍历数组
		for (int i = 0
				; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		/* 为什么出现无法将对象添加进数组
		class Student {
			String major;
			int height;
			String name;
			理解this的指代关系
			public Student(String name,int height,String major) {
				// TODO Auto-generated constructor stub
				this.name = name;
				this.height= height;
				this.major=major;
			}
		}
		
		
		// 遍历对象数组
		Student[] students;
		students = new Student[2];
		
		Student stu1 = new Student("liuxiangqian",123,"java");
		Student stu2 = new Student("liuxiang",133,"python");
		students[0]=stu1;
		students[1]=stu2;
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}*/
		
		
		
		
		/*  为什么使用https://www.sxt.cn/Java_jQuery_in_action/seven-array-declaration.html
		 * 还是出现错误？？？？
		 * class Man{
		    private int age;
		    private int id;
		    public Man(int id,int age) {
		        super();
		        this.age = age;
		        this.id = id;
		    }
		}
		
		Man[] mans; // 声明引用类型数组；
		mans = new Man[10]; // 给引用类型数组分配空间；

		Man m1 = new Man(1, 11);
		Man m2 = new Man(2, 22);

		mans[0] = m1;// 给引用类型数组元素赋值；
		mans[1] = m2;// 给引用类型数组元素赋值；
		
		for (int i = 0; i < mans.length; i++) {
			System.out.println(mans[i]);
		}*/

	
	}

}
