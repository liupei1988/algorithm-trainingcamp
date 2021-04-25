package train_camp_03.class07;

/**
 * 给定一个正数数组 arr，其中所有的值都为整数，以下是最小不可组成和的概念:
 * 把 arr 每个子集内的所有元素加起来会出现很多值，其中最小的记为 min，最大的记为max 在区间[min,max]上，
 * 如果有数不可以被arr某一个子集相加得到，那么其中最小的那个数是arr 的最小不可组成和 在区间[min,max]上，
 * 如果所有的数都可以被arr的某一个子集相加得到，那么max+1是arr的最 小不可组成和
 * 请写函数返回正数数组 arr 的最小不可组成和。
 * 【举例】
 * arr=[3,2,5]。子集{2}相加产生 2 为 min，子集{3,2,5}相加产生 10 为 max。
 * 在区间[2,10] 上，4、 6 和 9 不能被任何子集相加得到，其中 4 是 arr 的最小不可组成和。
 * arr=[1,2,4]。子集{1}相加产生 1 为 min，子集{1,2,4}相加产生 7 为 max。在区间[1,7]上，
 * 任何 数都可以被子集相加得到，所以 8 是 arr 的最小不可组成和。
 * 【进阶】
 * 如果已知正数数组 arr 中肯定有 1 这个数，是否能更快地得到最小不可组成和?
 *
 * http://chenxii.cn/2020/03/03/D-DataStructureAndAlgorithm/E-ZuoInterview/128-unformedSum/
 */
public class Code02_SmallestUnFormedSum {

}
