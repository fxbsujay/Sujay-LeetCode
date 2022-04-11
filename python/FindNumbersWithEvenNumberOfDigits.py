""""
# version:python 3.10
# -*- coding:utf-8 -*-

--------------------
# @Author       : fxbsujay@gmail.com
# @Time         : 22:56 2022/4/11 
# @File         : FindNumbersWithEvenNumberOfDigits.py
# @Version      : Python 3.10
# @Description  : 统计位数为偶数的数字
--------------------
"""
import math
from typing import List

"""
给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数

Given an array nums of integers, return how many of them contain an even number of digits.

--------------------
Example     : 
Input       :   nums = [12,345,2,6,7896]
Output      :   2
Explanation :   12 contains 2 digits (even number of digits).
                345 contains 3 digits (odd number of digits).
                2 contains 1 digit (odd number of digits).
                6 contains 1 digit (odd number of digits).
                7896 contains 4 digits (even number of digits).
                Therefore only 12 and 7896 contain an even number of digits.
--------------------   
"""


def findNumbers(numList: List[int]) -> int:
    return sum(1 for num in numList if int(math.log10(num) + 1) % 2 == 0)


if __name__ == '__main__':
    nums = [12, 345, 2, 6, 7896]
    print(findNumbers(nums))
