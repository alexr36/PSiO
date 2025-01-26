package List3;

public class Main {
    //  Task 1
    private static int findMax(int a, int b, int c) {
        int[] aux_arr = {a, b, c};
        int max = aux_arr[0];

        //  Finding the greatest value
        for (int i = 1; i < aux_arr.length; i++) {
            if (max < aux_arr[i]) {
                max = aux_arr[i];
            }
        }

        return max;
    }


    //  Task 2
    private static void printTree(int height) {
        if (height < 1) System.out.println("Invalid tree height: " + height);

        System.out.println("Tree of height: " + height + ":");

        for (int i = 0; i < height; i++) {
            //  Printing the correct indent
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            //  Printing leaves
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }

            System.out.println();
        }

        int trunk_height = height / 3;
        printTrunk(trunk_height, height);
    }


    //  Aux method for printing tree's trunk
    private static void printTrunk(int trunk_height, int tree_height) {
        if (trunk_height < 1) System.out.println("Invalid trunk height: " + trunk_height);

        for (int i = 1; i <= trunk_height; i++) {
            //  Printing the correct indent
            for (int j = 1; j <= tree_height; j++) {
                System.out.print(" ");
            }

            //  Printing the trunk's part
            System.out.println("H");
        }
    }


    public static void main(String[] args) {
        //  Task 1
        int a = 3;
        int b = 4;
        int c = 5;
        int x = findMax(a, b, c);

        System.out.println("Task 1:");
        System.out.println("Inserted values: " + a + ", " + b + ", " + c);
        System.out.println("Max value: " + x);


        System.out.println("\n#######################");

        //  Task 2
        int height = 7;

        System.out.println("\nTask 2:");
        printTree(height);
    }
}
