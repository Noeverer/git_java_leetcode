package leetcode;

class CircularQueue_622 {
    
	//私有属性变量？
    private int[] data;
    private int head;
    private int tail;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQueue_622(int k) {
        data = new int[k];
        head = -1;  
        //为什么head设为-1？
        //《原因；-1本身实质代表野指针的概念；-1也代表位置的概念（本身0位置代表首个位置，-1代表位置溢出或本身index不存在，但是-1位置只要加1就能表示首个位置）；》
        tail = -1;
        //为什么tail设为-1？
        //《后面tail = (tail+1)%size 时，就很方便，再给queue首个位置赋值时，避免了不能使用前式的尴尬》
        size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    // 两次判断：queue是否为满；queue是否为空
    public boolean enQueue(int value) {
        if (isFull() == true) {  
        	//防止queue满了，无法添加value
            return false;
        }
        if (isEmpty() == true) {  
        	//判断queue是否为空，为空的将head置0（因为head不像tail在下面自己更新，而且head只需要保留在首位即可）
        	//注意：head放在首位后，会继续执行tail的更新
            head = 0;
        }
        tail = (tail + 1) % size;  //取余数是为了取整个循环，而不是简单的tail = tail + 1这样可能会超出了index
        data[tail] = value;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    // 两次判断：queue是否为空；queue是否只有一个元素（一个元素是需要将head/tail指向-1，而且是手动指向）
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {   //会不会出现这样：就是我enqueue的时候插入多了（比如tail遍历一遍后，多插入一个元素，此时也是head == tail状态，）
        	//但是这样的情况不会发生，因为当插入queue最后一个元素时，isFull已满，不会再能enqueue
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;  //同样是为取整个循环
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
	System.out.println(obj.Front());   // 一开始以为程序错误，原来是我没有输出打印
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
 
 
 

 
 
 