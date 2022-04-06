
""""
# version:python 3.10
# -*- coding:utf-8 -*-

--------------------
# @Author       : fxbsujay.gmail.com
# @Time         : 0:37 2022/4/7
# @File         : 2.py
# @Version      : Python 3.10
# @Description  : 杨辉三角解题方法
--------------------
"""
from typing import List


"""
给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行
在「杨辉三角」中，每个数是它左上方和右上方的数的和
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
        
--------------------
示例 :
输入: numRows = 5
输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]     
--------------------   
"""


def generate(numRows: int) -> List[List[int]]:
    res = []
    # Cycle I times and add I
    for i in range(numRows):
        res.append([])
        for j in range(0, i + 1):
            # The characteristics of Yang Hui triangle: J = = 0 and I = = J are equal to 1
            if j == 0 or i == j:
                res[i].append(1)
            # Equal to the sum of the two values of the upper layer
            else:
                res[i].append(res[i - 1][j - 1] + res[i - 1][j])
    return res


if __name__ == '__main__':
    print(generate(5))
