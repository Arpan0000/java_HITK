import java.util.*;

class QueueClass<T>{
    private ArrayList<T> queue;

    QueueClass(){
        this.queue=new ArrayList<>();
    }

    void Enqueue(T item){
        queue.add(item);
        System.out.println("Added item : " + item + " in queue");
    }

    T Dequeue(){
        if(!queue.isEmpty()){
            T item=queue.remove(0);
            System.out.println("Item : "+ item+ " is removed from queue");
            return item;
        }
        else{
            System.out.println("Queue is empty");
            return null;
        }
    }

}



public class QueueImplement {
    public static void main(String[] args) {

        QueueClass<Integer> intQueue = new QueueClass<>();
        intQueue.Enqueue(10);
        intQueue.Enqueue(20);
        intQueue.Dequeue();
        intQueue.Dequeue();
        intQueue.Dequeue();

        QueueClass<String> stringQueue = new QueueClass<>();
        stringQueue.Enqueue("Hello");
        stringQueue.Enqueue("World");
        stringQueue.Dequeue();
        stringQueue.Dequeue();
        stringQueue.Dequeue();
    }
}
