package strategy;

public class Sorter {
    private SortingStrategy sortingStrategy;
    public Sorter(){

    }

    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public Sorter(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array, Constants constants){
        if (sortingStrategy != null){
            if (constants.equals(Constants.ASC)){
                sortingStrategy.ascSort(array);
            }
            else if(constants.equals(Constants.DESC)){
                sortingStrategy.descSort(array);
            }
        }
    }
}
