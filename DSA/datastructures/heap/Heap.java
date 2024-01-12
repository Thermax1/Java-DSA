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

     public Integer remove() { // only ever remove the top item
        if (heap.isEmpty()) { return null; }
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return maxValue;
     }

     private void sinkDown(int index) {
        int maxIndex = index;

        while(true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex< heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if(maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
     }


}
