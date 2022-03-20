import java.util.Scanner;

public class read {
    public static void main(String[] argv) {

        Scanner input = new Scanner(System.in);

        String user[] = {"name", "pwd", "description", "lema"} ;
        String userd = user[0] + ", " + user[1] + "\n" + user[3] + "\n" + user[2];
        String textr;
        boolean c = true;

        try {
            while (c) {
                System.out.print(">> ");
                textr = input.next();
                switch(textr) {
                    case "name": System.out.println(user[0]); break;
                    case "pwd": System.out.println(user[1]); break;
                    case "des": System.out.println(user[2]); break;
                    case "lema": System.out.println(user[3]); break;
                    case "user" : System.out.println(userd); break;
                    case "e" : c = false; break;
                }
            }
        }

        finally { input.close(); }
    } 
}
