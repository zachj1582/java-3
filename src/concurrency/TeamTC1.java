package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable {

    List<String> team = new ArrayList<>();

    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List  After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package. 
    
    @Override
    public void run(){
        String taGroup = "Mark Bennett, Arron White, Cody Clark, Caleb Waters, Gotham Katta, Justin Cheng, John Bozarov, Kevin Keesee, Korey Brooks, Matthew Choat, Sarah Bates, Tyler Clements, Zach Johnson";
        String[] group = taGroup.split(", ");
        String[] colors = {"\u001B[30m","\u001B[31m","\u001B[32m","\u001B[33m","\u001B[34m","\u001B[35m","\u001B[36m"};
        for(String element: group){
            try {
                Thread.sleep(1000);
                System.out.println(element + "\n");
            } catch(Exception e) {
                System.out.println("Exception: " + e);
            }
            team.add(element);
        }
        for(String e:team){
            System.out.println(colors[(int) (Math.floor(Math.random() * 7))] + e);
        }

    }
}