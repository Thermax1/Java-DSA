package datastructures.heap;
import java.util.ArrayList;
import java.util.List;
public class Heap {

    //helper methods go here to make insert and all that easier
     private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

     private int leftChild(int index) {
         return 2 * index + 1;
     }

     private int rightChild(int index) {
         return 2 * index + 2;
     }

     private int parent(int index) {
         return (index - 1) / 2;
     }

     private void swap(int index1, int index2) {
         int temp = heap.get(index1);
         heap.set(index1, heap.get(index2));
         heap.set(index2, temp);
     }

     public List<Integer> getHeap() {
         return new ArrayList<>(heap);
         // return copy of the heap so nobody can mess with it
     }

     public void insert(int value) {
         heap.add(value);
         int current = heap.size() - 1; //end of list. Latest addition goes here
         while (current > 0 && heap.get(current) > heap.get(parent(current)) ) {
             swap(current, parent(current));
             current = parent(current);
         }
     }


}
