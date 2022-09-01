package inventorysystemjava;
import java.util.*;
 
public class Implementing_Queue {
   public static void main(String[] args) {
    //declaring the Queue   
    Queue<String> catQueue = new LinkedList<>();
    //initialize the queue with values
    
    catQueue.add("apple");
    
    
//print the Queue
    System.out.println("The Queue contents:" + catQueue);
    }
}