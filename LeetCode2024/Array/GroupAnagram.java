class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (! map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(str); // original str (non-sorted)
                map.put(sorted, list);
            } else {
                List<String> list = map.get(sorted);
                list.add(str);
                map.put(sorted, list);
            }
        }

        List<List<String>> res = new ArrayList<>();

        map.forEach((k, v) -> res.add(new ArrayList<>(v)));

        return res;
    }
}
