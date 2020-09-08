import java.util.HashMap;
import java.util.Map;

public class test_hashmap_9_4 {
    public static void main(String[] args) {

//        TestHashmap();
        Map<Integer,Employee> user2 = new HashMap<Integer, Employee>();  //java中使用都是先要创建好对象的属性
        user2 = CreateUserMap();
        EpocHashMap(user2);

    }

    public static void TestHashmap() {
        Map<Integer,String> m1 = new HashMap<Integer, String>();
        Map<Integer,String> m2= new HashMap<Integer, String>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");
        m2.put(1,"yi");
        m2.put(2,"er");
        System.out.println("m1:"+m1);
        Map<Integer,String> m3 = new HashMap<Integer, String>();
        m3.putAll(m2);
        m3.putAll(m1);
        //调换m1/m2的顺序：后入的会覆盖先进入
        System.out.println("m3 put all m1+m2:"+m3);
    }

    public static Map CreateUserMap() {
        Employee e1 = new Employee(1001,"liu",50000);
        Employee e2 = new Employee(1002,"xiang",60000);
        Employee e3 = new Employee(1003,"qian",70000);

        Map<Integer,Employee> user = new HashMap<Integer, Employee>();
        user.put(e1.getId(),e1);
        user.put(e2.getId(),e2);
        user.put(e3.getId(),e3);
        System.out.println("override Tostring方法后："+user);
        System.out.println("获取1002key对应ename："+user.get(1002).getEname());
        return user;
    }

    public static void EpocHashMap(Map<Integer,Employee> user) {
        //进行循环遍key和value的操作
        for (Map.Entry<Integer,Employee> entry : user.entrySet() ){
            System.out.println("获取到key："+entry.getKey()+"获取到value中ename："+entry.getValue().getEname());
        }
        //分别遍历key的操作
        for(Integer key : user.keySet()){
            System.out.println("遍历key的操作："+key);
        }
        //遍历value的操作
        for (Employee value : user.values()){
            System.out.println("遍历value的操作："+value);
        }
    }

    //进行对象Employee的创建
    static class Employee{
        private int id;
        private String ename;
        private double salary;

        public Employee(int id, String ename, double salary) {
            super();
            this.id = id;
            this.ename = ename;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "工号:"+id+"名字:"+ename+"薪水"+salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}
