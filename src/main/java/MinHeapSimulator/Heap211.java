package MinHeapSimulator;

public class Heap211 {
    int[] heap = new int[16];

    int parent(int index) {
        return index / 2;
    }

    int leftChild(int index) {
        return (index * 2);
    }

    int rightChild(int index) {
        return (index * 2) + 1;
    }

    boolean hasParent(int index) {
        return index > 1;
    }

    boolean hasLeftChild(int index) {
        return index * 2 <= size(heap);
    }

    public int add(int value) {
// store the new value and return the index
        int indexValueAdded =size (heap) + 1;
        heap[indexValueAdded] = value;
        return indexValueAdded;
    }

    public int remove() {
        return 0;
    }

    void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }


    int size(int[] heap){
        int size = 0;
        for(int leaf: heap){
            if(leaf > 0){size++;}
        }
        return size;
    }
}
