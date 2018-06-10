package com.LeetCode.primary.String.reverseString;


/**
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * 示例：
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class reverseString {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len/2; i++){
            char temp = ch[i];
            ch[i] = ch[len-i-1];
            ch[len-i-1] = temp;
        }
        return new String(ch);
    }
}
