package sep28;

public class NestedForLoop {
    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(" " +j);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("  " + i*j);
            }
            System.out.println();
        }

    }
}