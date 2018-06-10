package com.LeetCode.primary.String.firstUniqChar;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class firstUniqChar {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int time = 1;
        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
        Map<Character,Integer> mapItem = new HashMap<Character,Integer>();
        for (int i = 0; i < chars.length; i++){
            if (map.containsKey(chars[i])){
                int val = map.get(chars[i]);
                ++val;
                map.put(chars[i],val);
            }else{
                map.put(chars[i],time);
            }
            mapItem.put(chars[i],i);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return mapItem.get(entry.getKey());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int fin = firstUniqChar(s);
        System.out.println(fin);
    }
}
