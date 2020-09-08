package SXT_java;

public class A542_encapsulation_person_test {
	public static void main(String[] args) {
//		Person2 p2 = new Person2();
		/**一开始这样进行，报错如下：
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	* Person2 cannot be resolved to a type
	* Person2 cannot be resolved to a type
	* Duplicate local variable p2 
	* 因为其不能识别A542_encapsulation_Person下面Person2这个类，
	* 只能识别A542_encapsulation_Person这样摆在文件面上的类名 **/
		
		A542_encapsulation_Person p2 = new A542_encapsulation_Person();
		p2.setAge(-10);
		p2.setAge(14);
	}

}
