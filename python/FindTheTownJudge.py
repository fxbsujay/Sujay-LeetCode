""""
# version:python 3.10
# -*- coding:utf-8 -*-

--------------------
# @Author       : fxbsujay@gmail.com
# @Time         : 0:48 2022/4/10 
# @File         : FindTheTownJudge.py
# @Version      : Python 3.10
# @Description  : 找到小镇的法官
--------------------
"""
from collections import Counter
from typing import List

"""
小镇里有 n 个人，按从 1 到 n 的顺序编号。传言称，这些人中有一个暗地里是小镇法官
如果小镇法官真的存在，那么:
    1.小镇法官不会信任任何人
    2.每个人（除了小镇法官）都信任这位小镇法官
    3.只有一个人同时满足属性 1 和属性 2
给你一个数组 trust ，其中 trust[i] = [ai, bi] 表示编号为 ai 的人信任编号为 bi 的人
如果小镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 -1

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge </p>
If the town judge exists, then: </p>
    1.The town judge trusts nobody </li>
    2.Everybody (except for the town judge) trusts the town judge </li>
    3.There is exactly one person that satisfies properties 1 and 2 </li>
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi </p>
Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise </p>

--------------------
Example : 
Input   :  n = 3, trust = [[1,3],[2,3],[3,1]]
Output  :  -1
--------------------   
"""


def findJudge(n: int, trust: List[List[int]]) -> int:
    inDegrees = Counter(y for _, y in trust)
    outDegrees = Counter(x for x, _ in trust)
    return next((i for i in range(1, n + 1) if inDegrees[i] == n - 1 and outDegrees[i] == 0), -1)


if __name__ == '__main__':
    trust = [[1, 3], [2, 3], [3, 1]]
    result = findJudge(3, trust)
    print(result)
