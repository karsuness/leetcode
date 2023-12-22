package leetcode.leetcode0051;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/20 20:21
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n; j++) {
                sb.append(".");
            }
            board.add(sb.toString());
        }

        backtrack(board, 0);
        return result;
    }

    public void backtrack(List<String> board, int row) {
        if (row == board.size()) {
            result.add(new ArrayList<>(board));
            return;
        }

        int colTotal = board.get(row).length();

        for (int col = 0; col < colTotal; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }

            char[] arr = board.get(row).toCharArray();
            arr[col] = 'Q';
            board.set(row, String.valueOf(arr));

            backtrack(board, row + 1);

            arr[col] = '.';
            board.set(row, String.valueOf(arr));
        }
    }

    public boolean isValid(List<String> board, int row, int col) {
        int n = board.get(row).length();
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        for (int x = col - 1, y = row - 1; x >= 0 && y >= 0; x--, y--) {
            if (board.get(y).charAt(x) == 'Q') {
                return false;
            }
        }

        for (int x = col + 1, y = row - 1; x < n && y >= 0; x++, y--) {
            if (board.get(y).charAt(x) == 'Q') {
                return false;
            }
        }

        return true;
    }
}
