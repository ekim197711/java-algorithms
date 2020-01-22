package algo;

public class InsertionSortAlgorithm {


    public int[] ordertheArray(int[] arrayToSort){
        int[] resultArray = new int[arrayToSort.length];
        for (int o = 0; o < arrayToSort.length; o++){
            resultArray[o] = arrayToSort[o];
        }

        for (int i = 1; i < resultArray.length; i++){
            int valueToEvaluate = resultArray[i];
            int indexLeft = i-1;
            while (indexLeft >= 0 && resultArray[indexLeft] > valueToEvaluate){
                resultArray[indexLeft+1] = resultArray[indexLeft];
                indexLeft = indexLeft-1;
            }
            resultArray[indexLeft+1] = valueToEvaluate;
        }
        return resultArray;
    }

    public void printArray(int[] myarray){
        for (int i : myarray){
            System.out.println(i);
        }
    }


}
