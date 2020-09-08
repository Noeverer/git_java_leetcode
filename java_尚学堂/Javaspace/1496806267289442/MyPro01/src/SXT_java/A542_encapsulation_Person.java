package SXT_java;

/**一开始是这样的创建，但是java中类名必须要和文件类名一致，
 * 导致其实在文件在另一个类A542_encapsulation_person_test中使用时，
 * 只会识别文件上A542_encapsulation_Person这个类，不会识别Person2这个下面的类
public class A542_encapsulation_Person{
	public class Person2{......
	}
	
}**/
	public class A542_encapsulation_Person{
		private int id;  //创建私有属性
		private String name;
		private int age;
		private boolean man;
		
		public void setName(String name) {
			//修改私有属性，使得可以外部可以通过对这一方法的使用修改参数
			this.name = name;
		}
	
		public void setAge(int age) {
			this.age = age;
			if (age >= 1 && age <130) {
				System.out.println("the gays age  is :" + age );
			}else {
				System.out.println("这家伙不是正常的人类，建议拨打911");
			}
		}
		
	}
	
