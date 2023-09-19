import java.util.List;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
        for (int i=0; i < grid.size(); i++) {
            grid.set(i, sortRow(grid.get(i)));
        }
        return checkColumn(grid);
    }

   public static String sortRow(String row) {
       for (int j=0; j < row.length(); j++) {
           for (int i=0; i <row.length()-j-1; i++) {
               char letter1 = row.charAt(i);
               char letter2 = row.charAt(i+1);
               if (Character.compare(letter1, letter2) > 0) {
                   row = row.substring(0, i) + letter2 + letter1 + row.substring(i+2);
               }
           }
       }
       return row;
   }

   public static String checkColumn(List<String> grid) {
       String result = "YES";
       for (int i=0; i < grid.get(0).length(); i++) {
           for (int j=0; j < grid.size()-1; j++) {
               if (grid.get(j).charAt(i) > grid.get(j+1).charAt(i)) {
                    result = "NO";
               }
           }
       }
       return result;
   }
}
