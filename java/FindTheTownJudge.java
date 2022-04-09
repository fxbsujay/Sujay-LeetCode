package com.susu.java;

/**
 * @author fxbsujay@gmail.com
 * <p> Description: Find the Town Judge</p>
 * @version 0:00 2022/4/10
 * @since JDK1.8
 */
public class FindTheTownJudge {


    /**
     * <p> 小镇里有 n 个人，按从 1 到 n 的顺序编号。传言称，这些人中有一个暗地里是小镇法官 </p>
     * <p> 如果小镇法官真的存在，那么: </p>
     * <ul>
     *     <li> 小镇法官不会信任任何人 </li>
     *     <li> 每个人（除了小镇法官）都信任这位小镇法官 </li>
     *     <li> 只有一个人同时满足属性 1 和属性 2 </li>
     * </ul>
     * <p> 给你一个数组 trust ，其中 trust[i] = [ai, bi] 表示编号为 ai 的人信任编号为 bi 的人 </p>
     * <p> 如果小镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 -1 </p>
     *
     * <p> In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge </p>
     * <p> If the town judge exists, then: </p>
     * <ul>
     *     <li> The town judge trusts nobody </li>
     *     <li> Everybody (except for the town judge) trusts the town judge </li>
     *     <li> There is exactly one person that satisfies properties 1 and 2 </li>
     * </ul>
     * <p> You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi </p>
     * <p> Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise </p>
     *
     * <blockquote><pre>
     * Example :
     *
     * Input   : n = 3, trust = [[1,3],[2,3],[3,1]]
     *
     * Output  : -1
     * </pre></blockquote>
     *
     * @param n 编号
     * @param trust 表示编号为 ai 的人信任编号为 bi 的人组合数组
     * @return 镇法官存在并且可以确定他的身份，请返回该法官的编号；否则，返回 -1
     */
    public static int findJudge(int n, int[][] trust) {

        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];

        for (int[] dge : trust) {
            int in = dge[0];
            int out = dge[1];
            ++inDegrees[in];
            ++outDegrees[out];
        }

        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,2}};
        System.out.println(findJudge(2,trust));
    }

}
