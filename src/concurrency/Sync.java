package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;


class Sync extends Thread {
    static List nums = new ArrayList<>();

    Sync(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("running");
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randInt = rand.nextInt(100);
            this.nums.add(randInt);
        }
    }

    public static void main(String[] args) {
        System.out.println("main fired 1");
        Sync syncThread1 = new Sync("sync thread 12");
        syncThread1.run();
        System.out.println("syncThread.nums 1:" + syncThread1.nums);


        System.out.println("main fired 2");
        Sync syncThread2 = new Sync("sync thread 2");
        syncThread2.run();
        System.out.println("syncThread.nums 2:" + syncThread2.nums);


        System.out.println("main fired 3");
        Sync syncThread3 = new Sync("sync thread 3");
        syncThread3.run();
        System.out.println("syncThread.nums 3:" + syncThread3.nums);


        System.out.println("main fired 4");
        Sync syncThread4 = new Sync("sync thread 4");
        syncThread4.run();
        System.out.println("syncThread.nums 4:" + syncThread4.nums);


        System.out.println("main fired 5");
        Sync syncThread5 = new Sync("sync thread 5");
        syncThread5.run();
        System.out.println("syncThread.nums 5:" + syncThread5.nums);





        //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up  here.  There is a brute force way and a more sophisticated way.  Either or will work, but strive for sophistication :)

    }
    
}