import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for(var str : strs) {
            var orderedString = orderString(str);
            if (map.containsKey(orderedString)) {
                map.get(orderedString).add(str);
            } else {
                var list = new ArrayList<String>();
                list.add(str);
                map.put(orderedString, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String orderString(String s) {
        // 1. Convert to char array
        char[] chars = s.toCharArray();
        
        // 2. Sort the array alphabetically (ASCII/Unicode order)
        Arrays.sort(chars);
        
        // 3. Convert back to a String
        String sorted = new String(chars);

        return sorted;
    }
}