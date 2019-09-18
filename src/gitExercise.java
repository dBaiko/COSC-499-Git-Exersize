public class gitExercise {

    public static void main(String args[]) {
      
        randomPrint test = new randomPrint();
        test.main(args);

        printHi(10);

        addUpTo(20);

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
