package com.sword;

/**
 * Created by HeXi on 2017/1/18.
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNumSolution {
    static class Solution {

        public int MoreThanHalfNum_Solution(int[] array) {
            int[] record = new int[10];
            for (int i = 0; i < array.length; i++) {
                record[array[i]]++;
                if (record[array[i]] > (array.length / 2))
                    return array[i];
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
        int j = solution.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 4, 2, 5, 2, 3});

        System.out.println(i);
        System.out.println(j);
    }
}
