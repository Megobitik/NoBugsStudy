package ComboTasks.TaskManager;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaskService<T> {

    private final Map<T,Task<T>> tasks= new ConcurrentHashMap<>();

    public boolean addTask(Task<T> task){
        return tasks.putIfAbsent(task.getId(),task) == null;
    }

    public synchronized boolean removeTask(T id){
        return tasks.remove(id) != null;
    }

    public List<Task<T>> findTaskByStatus (Status status){
        return tasks.values().stream().filter(task -> task.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Task<T>> findTaskByPriority(Priority priority){
        return tasks.values().stream().filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortedByDateASC(){
        return tasks.values().stream().sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortedByDateDESC(){
        return tasks.values().stream().sorted((t1,t2) -> t2.getDate().compareTo(t1.getDate()))
                .collect(Collectors.toList());
    }

    public int size(){
        return tasks.size();
    }
}
