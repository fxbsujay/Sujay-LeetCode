import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fxbsujay@gmail.com
 * <p> Description: Pascal's Triangle</p>
 * @version  23:21 2022/4/5
 * @since JDK1.8
 */
public class PascalTriangle {

    /**
     * <p> 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行 </p>
     * <p> 在「杨辉三角」中，每个数是它左上方和右上方的数的和 </p>
     *
     * <p> Given an integer numRows, return the first numRows of Pascal's triangle. </p>
     * <p> In Pascal's triangle, each number is the sum of the two numbers directly above it as shown : </p>
     * <blockquote><pre>
     *             1
     *            1 1
     *           1 2 1
     *          1 3 3 1
     *         1 4 6 4 1
     *
     * Example :
     *
     * Input   : numRows = 5
     *
     * Output  : [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     * </pre></blockquote>
     *
     * @param numRows 行数
     * @return 三角序列
     */
    public static List<List<Integer>> generate(int numRows) {

        // Result set
        List<List<Integer>> result = new ArrayList<>(30);

        if(numRows < 1) {
            return result;
        }

        // First line of result
        result.add(Arrays.asList(1));

        // Calculate from line two
        for(int i = 1; i < numRows; i++) {

            // The first element is always 1
            List<Integer> currentRow = new ArrayList<>(i);
            currentRow.add(1);

            // The intermediate values are calculated and added from the previous line
            List<Integer> frontRow = result.get(i - 1);
            if (frontRow.size() > 1) {
                for(int j = 1; j < i; j++) {
                    int prefix = frontRow.get(j);
                    int suffix = frontRow.get(j - 1);
                    currentRow.add(prefix + suffix);
                }
            }

            // The last one is always 1
            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(2);
        System.out.println(generate);
    }


}