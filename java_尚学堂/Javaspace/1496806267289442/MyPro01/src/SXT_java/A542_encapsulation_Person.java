package SXT_java;

/**һ��ʼ�������Ĵ���������java����������Ҫ���ļ�����һ�£�
 * ������ʵ���ļ�����һ����A542_encapsulation_person_test��ʹ��ʱ��
 * ֻ��ʶ���ļ���A542_encapsulation_Person����࣬����ʶ��Person2����������
public class A542_encapsulation_Person{
	public class Person2{......
	}
	
}**/
	public class A542_encapsulation_Person{
		private int id;  //����˽������
		private String name;
		private int age;
		private boolean man;
		
		public void setName(String name) {
			//�޸�˽�����ԣ�ʹ�ÿ����ⲿ����ͨ������һ������ʹ���޸Ĳ���
			this.name = name;
		}
	
		public void setAge(int age) {
			this.age = age;
			if (age >= 1 && age <130) {
				System.out.println("the gays age  is :" + age );
			}else {
				System.out.println("��һﲻ�����������࣬���鲦��911");
			}
		}
		
	}
	
