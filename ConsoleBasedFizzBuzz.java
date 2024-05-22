public class ConsoleBasedFizzBuzz implements FizzBuzz2 {
    @Override
    public void start(int from, int to) {
        do {
            if(from % 3 == 0 && from % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (from % 3 == 0) {
                System.out.println("Fizz");
            } else if (from % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(from);
            }
            from++;
        } while (from <= to);
    }
    
}
interface FizzBuzz2 {
    void start(int from, int to);
}
class FizzBuzzTest {
    public static void main(String[] args) {
        ConsoleBasedFizzBuzz fzbz = new ConsoleBasedFizzBuzz();
        fzbz.start(1,200);
    }
}