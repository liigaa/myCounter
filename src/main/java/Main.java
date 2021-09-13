import java.util.Scanner;

public class Main {
    Counter counter = new Counter();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.showMenu();  }


        void showMenu() {
            String userInput = "";
            do {
                System.out.println("\nWelcome to counter");
                System.out.println("1.Count up");
                System.out.println("2. Count Down");
                System.out.println("\nEnter Quit to end program...");
                System.out.println("\nChoose a number");
                userInput = scanner.nextLine();

                switch (userInput) {
                    case "Quit":
                        System.out.println("Exiting application..");
                        break;
                    case "1":
                        countTo();
                        break;
                    case "2":
                        countDown();
                        break;
                    default:
                        break;
                }

            }while (!userInput.equalsIgnoreCase("Quit"));
        }
        void countTo () {
            System.out.println("Count Up");
            System.out.println("Please input start number");
            int start = intScanner.nextInt();
            System.out.println("Please input stop number");
            int stop = intScanner.nextInt();
            System.out.println("\n");
            counter.countTo(start, stop);

        }
        void countDown () {
            System.out.println("Count Down");
            System.out.println("Please input start number");
            int start = intScanner.nextInt();
            System.out.println("Please input stop number");
            int stop = intScanner.nextInt();
            System.out.println("\n");
            counter.countDown(start, stop);
        }

    }


