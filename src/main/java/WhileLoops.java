public class WhileLoops {

    int counter = 0;
    int roomInBelly = 5;
    int lizard = 0;

    public int count(){
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        return counter;
    }

    public void whileStatement(){
        System.out.println("The simplest control structure in Java is the while statement");
        System.out.println("Termination condition - boolean will continue as long as true");
    }

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0){
            bitesOfCheese --;
            roomInBelly --;
        }
        System.out.println(bitesOfCheese + "pieces left");
    }

    public void doWhileStatement(){
        System.out.println("do/while guarantees the statement will be executed at least once");
        System.out.println("syntactic structure do body come first to guarantee its done first");
        System.out.println("Can convert while to dowhile and vice versa");
        System.out.println("Use a while loop when the code will execute 0 or more times");
        System.out.println("Use do/while when you want loop to execute at lease once");
    }

    public void doWhileExample(){
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);
    }


}
