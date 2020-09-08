import org.w3c.dom.Node;

import java.util.Arrays;

public class createhashmap_9_4 {
    Node2[] table;
    int size = 0;

    public static void main(String[] args) {
        createhashmap_9_4 m = new createhashmap_9_4();
        m.put(10, "aa");
        m.put(20, "bb");
        m.put(30, "cc");
        m.put(20, "dd");
        m.put(70, "ff");
        System.out.println("override toString:" + m);
        System.out.println("get key from table:" + m.get(20));
        System.out.println("get table map size:" + m.getsize());
    }

    // 为什么需要定义和文件名一样？
    public createhashmap_9_4() {
        table = new Node2[16];
    }

    //implement put key into hash table
    public void put(Object key, Object value) {
        Boolean is_repeat = false;
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;
        Node2 tab_node = table[newNode.hash];
        if (tab_node == null) {
            // initialize table node is null
            table[newNode.hash] = newNode;
        } else {
            // table node is null, need inspect repeat
            while (tab_node != null) {
                // if key in this tab_node?

                if (tab_node.key.equals(key)) {
                    System.out.println("happen repeat key:" + tab_node.key + ",put key:" + key);
                    tab_node.value = value;
                    is_repeat = true;
                    break;
                }
                tab_node = tab_node.next; // epoch next node
            }
            //search the null node == the last node,
            //add is_repeat => prevent break then not execute put the newNode!!!
            if (!is_repeat) {
                tab_node.next = newNode;
            }

        }
    }

    //implement get key from hash table
    public Object get(Object key) {
        Object value = null;
        int gethash = this.myHash(key.hashCode(), table.length - 1);  //this work? =>this mean class
        Node2 tab_node = table[gethash];
        while (tab_node != null) {
            if (tab_node.key.equals(key)) {
                return tab_node.value;
            }
            tab_node = tab_node.next;
        }
        System.out.println("not found key" + key);
        return value;
    }

    public int getsize() {
        for (int i = 0; i < table.length; i++) {
            Node2 tab_node = table[i];
            while (tab_node != null) {
                size += 1;
                tab_node = tab_node.next;
            }
        }
        return size;
    }

    // get hash code => process hash num scale to table length
    public int myHash(int v, int length) {
//        System.out.println("get & hash code: " + (v & (length - 1)));
//        System.out.println("get % hash code:" + (v % (length - 1)));
        return v & (length - 1);
    }

    //创建Node
    public class Node2 {
        int hash;
        Object key;
        Object value;
        Node2 next;
    }


    // epoch table format [key:value]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; i++) {
            Node2 tab_node = table[i];
            while (tab_node != null) {
                sb.append(tab_node.key + ":" + tab_node.value + ",");
                tab_node = tab_node.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');  //java inspect "/'
        return sb.toString();
    }


}
