import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




                System.out.println("enter a string");

                Scanner read = new Scanner(System.in);
                String string = read.nextLine();
                String reverse = "";


                for(int i = string.length() - 1; i >= 0; i--)
                {
                    reverse = reverse + string.charAt(i);
                }

                System.out.println("Reversed string is:");
                System.out.println(reverse);
            }
        }
