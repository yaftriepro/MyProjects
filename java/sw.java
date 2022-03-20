import java.util.Scanner;

public class sw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hours = 17;
        int minutes = 15;
        int seconds = 35;
        int m = 7654;
        float km = m / 1000.0f;

        try {
            System.out.print(">> (true/false) : ");
            boolean value = input.nextBoolean();

            if (value) {
                System.out.println(">> Time: " + hours + ":" + minutes + ":" + seconds);
            } else {
                System.out.println(">> You walked: " + km + " km");
            }
        }

        finally { input.close(); }
    }
}
