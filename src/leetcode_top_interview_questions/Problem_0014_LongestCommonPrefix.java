package leetcode_top_interview_questions;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 */
public class Problem_0014_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String base = strs[0];
        char[] str0 = strs[0].toCharArray();
        int minIndex = base.length();
        for (int i = 1; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            int index = 0;
            while (index < str.length && index < str0.length) {
                if (str[index] == str0[index]) {
                    index++;
                } else {
                    break;
                }
            }
            minIndex = Math.min(minIndex, index);
        }
        return base.substring(0, minIndex);
    }


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }
}
