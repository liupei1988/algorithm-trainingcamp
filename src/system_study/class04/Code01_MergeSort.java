package system_study.class04;

/**
 * 归并排序
 * 1）整体是递归，左边排好序+右边排好序+merge让整体有序
 * 2）让其整体有序的过程里用了排外序方法
 * 3）利用master公式来求解时间复杂度
 * 4）当然可以用非递归实现
 *
 * 归并排序复杂度
 * T(N) = 2*T(N/2) + O(N^1)
 * 根据master可知时间复杂度为O(N*logN)
 * merge过程需要辅助数组，所以额外空间复杂度为O(N)
 * 归并排序的实质是把比较行为变成了有序信息并传递，比O(N^2)的排序快
 */
public class Code01_MergeSort {
}
