package strategy;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void ascSort(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    swap(array, j , j+1);
                }
            }
        }
    }

    @Override
    public void descSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] < array[j + 1]){
                    swap(array, j , j + 1);
                }
            }
        }
    }

    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
