package concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
         Thread reasoning = new Reasoning();
         reasoning.start();
         TeamTC1 codeConnoisseurs = new TeamTC1();
         codeConnoisseurs.run();

    }
}