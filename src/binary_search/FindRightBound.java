package binary_search;

/**
 * 在有序数组上，找满足 <=value 的最左位置
 */
public class FindRightBound {

    public static int rightBound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) { //相等时，别返回，锁定左边界，继续在右边找
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1; // 注意
            } else { //target < nums[mid]
                right = mid;
            }
        }
        return right - 1; // 注意
    }

    // 在arr上，找满足<=value的最右位置
    public static int nearestIndex(int[] arr, int value) {
        if (arr.length == 0) return -1;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (value == arr[mid]) { //相等时，别返回，锁定左边界，继续在右边找
                L = mid + 1;
            } else if (value > arr[mid]) {
                L = mid + 1;
            } else { //value < arr[mid]
                R = mid - 1;
            }
        }
        // 最后要检查 right 越界的情况
        if (R < 0 || arr[R] != value)
            return -1;
        return R;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 2, 4, 4, 5, 6, 6, 6, 8, 10, 11};
//        int arr[] = {1, 2, 3, 4};
        int target = 7;
        System.out.println("arr.length = " + arr.length);
        System.out.println("rightBound(arr, " + target + ") = " + rightBound(arr, target));
        System.out.println("nearestIndex(arr, " + target + ") = " + nearestIndex(arr, target));
    }
}
