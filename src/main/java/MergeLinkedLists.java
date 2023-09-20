import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergeLinkedLists {

    public void readInput() {
        int counter = 1;
        int treeOneLength = 0;
        int treeTwoLength = 0;
        List<String> sortedList = new ArrayList<>();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            while ((line = br.readLine()) != null) {
                if (counter == 1) {
                    treeOneLength = Integer.parseInt(line);
                }
                if (counter > 1 && counter <= treeOneLength+1) {
                    sortedList.add(line);
                }
                if (counter == treeOneLength+2) {
                    treeTwoLength = Integer.parseInt(line);
                }
                if (counter > treeOneLength+2 && counter <= 2+treeOneLength+treeTwoLength) {
                    addInCorrectPosition(sortedList, line);

                }
                counter++;
            }
            for (int j=0; j < sortedList.size(); j++) {
                System.out.println(sortedList.get(j));
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private void addInCorrectPosition(List<String> sortedList, String line) {
        for (int i=0; i < sortedList.size(); i++) {
            if (Integer.parseInt(line) <= Integer.parseInt(sortedList.get(i))) {
                sortedList.add(i, line);
            }
        }
    }
}
