package ComboTasks.Movies;

public class Rating<T extends Number> {
    private T value;

    public Rating(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public double convertToDouble(){
        return value.doubleValue();
    }
}
