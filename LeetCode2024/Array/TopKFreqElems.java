class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());

        map.forEach((key, val) -> {
            pq.add(new Pair(key, val)); 
        });

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = pq.remove().number;
        }

        return res;
    }

    static class MyComparator implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.freq - p1.freq;
        }
    }

    static class Pair { 
        int number;
        int freq;

        public Pair(int number, int freq) {
            this.number = number;
            this.freq = freq;
        }
    }
}
