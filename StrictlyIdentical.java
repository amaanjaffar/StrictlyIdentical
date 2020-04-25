import java.util.Scanner;
public class StrictlyIdentical {

    public static void main(String[] args) {
        //initialize list arrays
        int list1[] = new int[5];
        int list2[] = new int[5];

        //prompt user to put in array values
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter all the elements of list1:");

        //set the input as the array values
        for (int i = 0; i < 5; i++) {

            list1[i] = input1.nextInt();
        }

        //repeat with list2
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter all the elements of list2:");

        for (int i = 0; i < 5; i++) {

            list2[i] = input2.nextInt();
        }
        //check if the lists are equal
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");

        }


    }


    //create method to check if lists are equal
    public static boolean equals(int[] list1, int[] list2) {

        //if they are different lengths, they are not equal
        if (list1.length != list2.length) return false;

        //if they do not have the same values, they are not equal
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }

        return true;
    }
}


