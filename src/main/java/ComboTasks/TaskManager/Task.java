package ComboTasks.TaskManager;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {

    private final T id;
    private final Status status;
    private final Priority priority;
    private final LocalDate date;

    public Task(T id,Status status,Priority priority,LocalDate date){
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Task<?> task)) return false;
        return Objects.equals(id,task.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
