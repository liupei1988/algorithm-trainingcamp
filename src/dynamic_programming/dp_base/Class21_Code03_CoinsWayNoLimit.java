package dynamic_programming.dp_base;

/**
 * arr是面值数组，其中的值都是正数且没有重复。再给定一个正数aim。
 * 每个值都认为是一种面值，且认为张数是无限的。
 * 返回组成aim的方法数
 * 例如：arr = {1,2}，aim = 4
 * 方法如下：1+1+1+1、1+1+2、2+2
 * 一共就3种方法，所以返回3
 *
 * 带枚举行为的、使用斜率优化的动态规划
 * 从左往右的尝试模型
 * 枚举行为：求每一个格子的时候，需要一个for循环
 */
public class Class21_Code03_CoinsWayNoLimit {
}
