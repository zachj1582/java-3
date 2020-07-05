package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A process is an executing program, a thread is a small part of the process. Each process has its own memory space, the threads of the same process share that same memory space address as part of that process. \n");
        System.out.println("When a program calls start() a new thread is created and the code inside run() method is executed. When you call run() method directly no new Thread is created and the code inside the run() method will run on the current Thread. \n");

    }

    public void run(){
        distinguish();
    }
}

