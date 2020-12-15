package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 链表反转问题
 */

public class 链表_206 {
    public static void main(String[] args) {
        //实现链表的构造
        int[] node = new int[]{1, 2, 3, 4, 5};
        ListNode head =new ListNode(node[0]);
        ListNode cur =head;
        for(int i=1;i<node.length;i++){
            ListNode new_nod =new ListNode(node[i]);
            cur.next = new_nod;
            cur = cur.next;
        }
//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        ListNode ans;
        ans = reverseList(head);
        while(ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            //细节需要debug可以查找出来，需要两个指针才能实现交换功能
            //1、保存next节点
            ListNode temp = curr.next;
            //2、next节点更新成上个节点的信息
            curr.next = pre;
            //3、两个指针交替移动
            pre = curr;
            curr = temp;
        }
        //4、最后节点的状态是curr出去，pre指向前面一个节点
        return pre;
    }

}
