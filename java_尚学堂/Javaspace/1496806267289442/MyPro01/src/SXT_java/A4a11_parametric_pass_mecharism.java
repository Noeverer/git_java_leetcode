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
		user.name= "robotxiang";  //�������޸�����Ч���ڣ�user.name Ѱ�ҵ���ʼ��ǰ�ĵ�ַ���������޸�
	}
	
	public void testParameterTransfer02(A4a11_parametric_pass_mecharism user) {
		//Ϊʲô�޸���û���õģ�����Ϊ�´�����ñȴ�������һ���ռ䣬������������ӡ����δ����ǰ��ֵ
//		user = new A4a11_parametric_pass_mecharism(1002,"robotliuxiangqian");  //�������޸�Ҳ��û�е����
//		����һ��ʼ��ʼ���޸��������ֵ
	}
	
	
	public static void main(String[] args) {
		
		//�Թ���������ʵ������user�����ҳ�ʼ������
		A4a11_parametric_pass_mecharism user = new A4a11_parametric_pass_mecharism(1001,"robotliu");
		
		//����testParameterTransfer01()���������Ҹ�ֵ�䷽������Ĳ���
		user.testParameterTransfer01(user);
		System.out.println(user.name);

		//˼����ôȥ��ӡ�޸ĺ��user.name
		user.testParameterTransfer02(user);
		System.out.println(user.name);
		
	}
	
	
	
}
