import java.io.File;
import java.util.Scanner;

public class Account {
    private String username;
    
    public Account(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public static boolean isAvailable(String str) throws FileNotFoundException {
        File f = new File("usernames.txt");
        java.util.Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().equals(str))
                return false;
        }
        return true;
    }
}
