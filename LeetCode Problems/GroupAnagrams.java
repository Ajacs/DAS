/*

49. Group Anagrams
Solved
Medium
Topics
conpanies iconCompanies

Given an array of strings strs, group the together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 

Constraints:

    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.



*/
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