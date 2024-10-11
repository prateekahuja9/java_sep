package sep28;

public class ForLoop {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if(i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            if(i == 3){
//                break;
//            }
//            System.out.println(i);
//        }

        //break = break the iteration
        //continue = skip the iteration

        for ( int i =1; i<=100; i++){
            if(i%7 == 0){
                System.out.println("Prateek");
                continue;
            }
            System.out.println(i);
        }
    }
}
