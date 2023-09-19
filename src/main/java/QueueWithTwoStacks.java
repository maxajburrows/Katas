import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueWithTwoStacks {

    public void readInput() {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
