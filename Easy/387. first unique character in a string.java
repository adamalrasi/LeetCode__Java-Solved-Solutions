/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

*/

class Solution {
    public int firstUniqChar(String s){
        int[] hash = new int[26];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(hash[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }
}

// Time complexity: o(n) Linear
// Space complexity: o(1) constant