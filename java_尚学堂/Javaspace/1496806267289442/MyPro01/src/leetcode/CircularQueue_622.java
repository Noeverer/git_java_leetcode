package leetcode;

class CircularQueue_622 {
    
	//˽�����Ա�����
    private int[] data;
    private int head;
    private int tail;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQueue_622(int k) {
        data = new int[k];
        head = -1;  
        //Ϊʲôhead��Ϊ-1��
        //��ԭ��-1����ʵ�ʴ���Ұָ��ĸ��-1Ҳ����λ�õĸ������0λ�ô����׸�λ�ã�-1����λ���������index�����ڣ�����-1λ��ֻҪ��1���ܱ�ʾ�׸�λ�ã�����
        tail = -1;
        //Ϊʲôtail��Ϊ-1��
        //������tail = (tail+1)%size ʱ���ͺܷ��㣬�ٸ�queue�׸�λ�ø�ֵʱ�������˲���ʹ��ǰʽ�����Ρ�
        size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    // �����жϣ�queue�Ƿ�Ϊ����queue�Ƿ�Ϊ��
    public boolean enQueue(int value) {
        if (isFull() == true) {  
        	//��ֹqueue���ˣ��޷����value
            return false;
        }
        if (isEmpty() == true) {  
        	//�ж�queue�Ƿ�Ϊ�գ�Ϊ�յĽ�head��0����Ϊhead����tail�������Լ����£�����headֻ��Ҫ��������λ���ɣ�
        	//ע�⣺head������λ�󣬻����ִ��tail�ĸ���
            head = 0;
        }
        tail = (tail + 1) % size;  //ȡ������Ϊ��ȡ����ѭ���������Ǽ򵥵�tail = tail + 1�������ܻᳬ����index
        data[tail] = value;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    // �����жϣ�queue�Ƿ�Ϊ�գ�queue�Ƿ�ֻ��һ��Ԫ�أ�һ��Ԫ������Ҫ��head/tailָ��-1���������ֶ�ָ��
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {   //�᲻�����������������enqueue��ʱ�������ˣ�����tail����һ��󣬶����һ��Ԫ�أ���ʱҲ��head == tail״̬����
        	//����������������ᷢ������Ϊ������queue���һ��Ԫ��ʱ��isFull��������������enqueue
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;  //ͬ����Ϊȡ����ѭ��
        return true;
    }
    
    /** Get the front item from the queue. */
    //detect: isEmpty? ; 
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }
    
    /** Get the last item from the queue. */
    //detect : isEmpty(?);
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }  




	//	Your CircularQueue_622 object will be instantiated and called as such:
	public static void main(String[] args) {
	CircularQueue_622 obj = new CircularQueue_622(5);
	System.out.println(obj.Front());
	obj.enQueue(100);
	System.out.println(obj.Front());   // һ��ʼ��Ϊ�������ԭ������û�������ӡ
	obj.enQueue(200);
	System.out.println(obj.Front());
	obj.enQueue(300);
	obj.enQueue(400);
	//obj.enQueue(500);
	//obj.enQueue(600);
	obj.deQueue();
	System.out.println(obj.Front());
	obj.Front();
	obj.Rear();
	obj.isEmpty();
	obj.isFull();
		}
}
 
 
 

 
 
 