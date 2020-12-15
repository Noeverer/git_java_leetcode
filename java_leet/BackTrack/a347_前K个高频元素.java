package BackTrack;

import java.util.*;


public class a347_前K个高频元素 {
    /**
     * 两种做法：1、使用优先队列进行排序  2、使用快速排序的做法
     */

    public static int[] topKFrequent(int[] nums, int k) {
        /**
         * PriorityQueue是一种即时排序的queue，每次将最小数放在第一位
         * 使用PriorityQueue的方式进行选择排序,
         * 严格控制PriorityQueue的大小
         */
        Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
        for(int num:nums){
            cache.put(num,cache.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m, int[] n) {
                return m[1]-n[1];
            }
        });
        for (Map.Entry<Integer,Integer> entry : cache.entrySet()){
            int num = entry.getKey(),count = entry.getValue();
            if (queue.size()==k){
                if (queue.peek()[1]<count) {
                    queue.poll();
                    queue.offer(new int[] {num,count}); }
            }else{
                queue.offer(new int[] {num,count});
            }
        }
        int[] ret = new int[k];
        for(int i=0;i<k;++i){
            ret[i] = queue.poll()[0];
        }
        return ret;
    }



    public static int[] topKFrequent2(int[] nums, int k) {
        /**topKFrequent2
         * 快速排序的做法
         */
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        List<int[]> values = new ArrayList<int[]>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            values.add(new int[]{num, count});
        }
        int[] ret = new int[k];
        qsort(values, 0, values.size() - 1, ret, 0, k);
        return ret;
    }

    public static void qsort(List<int[]> values, int start, int end, int[] ret, int retIndex, int k) {
        int picked = (int) (Math.random() * (end - start + 1)) + start;
        Collections.swap(values, picked, start);
        int pivot = values.get(start)[1];
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (values.get(i)[1] >= pivot) {
                Collections.swap(values, index + 1, i);
                index++;
            }
        }
        Collections.swap(values, start, index);

        if (k <= index - start) {
            qsort(values, start, index - 1, ret, retIndex, k);
        } else {
            for (int i = start; i <= index; i++) {
                ret[retIndex++] = values.get(i)[0];
            }
            if (k > index - start + 1) {
                qsort(values, index + 1, end, ret, retIndex, k - (index - start + 1));
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] res = topKFrequent2(nums,2);
        System.out.println(Arrays.toString(res));
    }
}
