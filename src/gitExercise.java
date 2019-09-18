public class gitExercise {

    public static void main(String args[]) {

        //randomPrint;

        printHi(10);

        addUpTo(15);

    }

    private static void printHi(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hi");
        }
    }

    private static void addUpTo(int number){
        int sum = 0;
        for(int i = 0; i < number; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
