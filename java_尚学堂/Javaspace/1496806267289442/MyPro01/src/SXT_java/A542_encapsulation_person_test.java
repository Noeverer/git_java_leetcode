package SXT_java;

public class A542_encapsulation_person_test {
	public static void main(String[] args) {
//		Person2 p2 = new Person2();
		/**һ��ʼ�������У��������£�
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	* Person2 cannot be resolved to a type
	* Person2 cannot be resolved to a type
	* Duplicate local variable p2 
	* ��Ϊ�䲻��ʶ��A542_encapsulation_Person����Person2����࣬
	* ֻ��ʶ��A542_encapsulation_Person���������ļ����ϵ����� **/
		
		A542_encapsulation_Person p2 = new A542_encapsulation_Person();
		p2.setAge(-10);
		p2.setAge(14);
	}

}
