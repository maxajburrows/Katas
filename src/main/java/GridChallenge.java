public class GridChallenge {



   public String sortRow(String row) {
       for (int j=0; j < row.length(); j++) {
           for (int i=0; i <row.length()-j; i++) {
               char letter1 = row.charAt(i);
               char letter2 = row.charAt(i+1);
               if (Character.compare(letter1, letter2) > 0) {
                   row = row.substring(0, i) + letter2 + letter1 + row.substring(i+2);
               }
           }
           System.out.println(row);
       }
       return row;
   }
}
