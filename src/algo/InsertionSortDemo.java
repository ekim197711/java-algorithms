package algo;

public class InsertionSortDemo {

    public static void main(String[] args) {
        int[] myarray = {3, 6, 9, 1, 2, 4, 45, 22, 100, 98};
        InsertionSortAlgorithm insertionSortAlgo = new InsertionSortAlgorithm();
        insertionSortAlgo.printArray(myarray);
        System.out.println("Lets sort the array");
        int[] sortedarray = insertionSortAlgo.ordertheArray(myarray);
        System.out.println("Original array");
        insertionSortAlgo.printArray(myarray);
        System.out.println("Sorted array");
        insertionSortAlgo.printArray(sortedarray);
        // time-to-sort-in-seconds = c*n*n / instructions-per-second-computer-can-handler

    }
}
