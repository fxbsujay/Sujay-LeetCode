package com.susu.java;

/**
 * @author fxbsujay@gmail.com
 * <p> Description: Find Numbers with Even Number of Digits</p>
 * @version 22:29 2022/4/11
 * @since JDK1.8
 */
public class FindNumbersWithEvenNumberOfDigits {

    /**
     * <p> 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数 </p>
     *
     * <p> Given an array nums of integers, return how many of them contain an even number of digits </p>
     *
     * <blockquote><pre>
     * Example :
     *
     * Input   : nums = [12,345,2,6,7896]
     *
     * Output  : 2
     *
     * Explanation: 12 contains 2 digits (even number of digits)
     *              345 contains 3 digits (odd number of digits)
     *              2 contains 1 digit (odd number of digits)
     *              6 contains 1 digit (odd number of digits)
     *              7896 contains 4 digits (even number of digits)
     *              Therefore only 12 and 7896 contain an even number of digits
     * </pre></blockquote>
     *
     * @param nums 整数数组
     * @return 其中位数为 偶数 的数字的个数
     */
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            // 10 为底的对数函数 log10() 来得到整数 x 包含的数字个数
            if ((int)(Math.log10(num) + 1) % 2 == 0) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
