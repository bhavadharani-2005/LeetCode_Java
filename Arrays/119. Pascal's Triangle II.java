import java.util.*;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first element

        for (int i = 1; i <= rowIndex; i++) {
            // Update the row from end to start to avoid overwriting
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // last element
        }

        return row;
    }
}
