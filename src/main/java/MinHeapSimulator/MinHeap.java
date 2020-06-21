package MinHeapSimulator;
import java.util.*;

/*
Perform 30 actions consisting of “add “ or “remove”
Use a random number to decide which action to choose now. For example,

        int whatAction = random.nextInt(2);
        if (whatAction ==0) { // add
        Use a random class to determine a value of a node.
        int nodeValue = random.nextInt(100);
        add this node to the heap;
        }
        else
        if (whatAction ==1) { remove min value; }
*/

public class MinHeap {
    public static void main(String[] args) {
        Heap211 heap = new Heap211();
        for (int action =1; action <=30; action ++){
            Random random = new Random();
            int whatAction = random.nextInt(2);

            if (whatAction ==0) { // add
                // Generate a Random number for the node value (0~99);
                int element =  random.nextInt(100);

                /*add the element to the heap;
                update the heap if needed; // bubbling up
                Print current heap;*/

//                could add the bubble to add function
                int indexOfNewValue = heap.add(element);
                    while(heap.parent(indexOfNewValue) < heap.heap[indexOfNewValue])
                        heap.swap(heap.heap, heap.parent(indexOfNewValue), indexOfNewValue);
                    }

            if (whatAction ==1) {
                // remove, if heap is empty skip this action, do not count this action
                if (heap.size(heap.heap) == 0) action--;

            }else {
                   /* remove min from the heap move the last element to the root
                    update the heap; bubbling down Print out current heap;*/

                }
            }
    }
}
