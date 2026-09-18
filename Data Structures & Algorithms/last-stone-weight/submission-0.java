class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int n: stones){
            minHeap.add(n);
        }

        
        while(minHeap.size() > 2){
            System.out.println(minHeap);
            int x = minHeap.poll();
            int y = minHeap.poll();

            if(x == y){
                continue;
            }else if(x < y){
                int temp = y - x;
                minHeap.offer(temp);
            }else{
                int temp = x - y;
                minHeap.offer(temp);
            }
        }

        if(minHeap.size() == 2){
            int x = minHeap.poll();
            int y = minHeap.poll();

            if(x == y)return 0;
            else if(x < y){
                int temp = y - x;
                return temp;
            }else{
                int temp = x - y;
                return temp;
            }
        }

        return minHeap.peek();
    }
}
