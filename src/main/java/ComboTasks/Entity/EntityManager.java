package ComboTasks.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class EntityManager<T> {

    private final List<T> entities = new ArrayList<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(T entity){
        lock.writeLock().lock();
        try {
            entities.add(entity);
        }
        finally {
            lock.writeLock().unlock();
        }
    }

    public boolean remove(T entity){
        lock.writeLock().lock();
        try {
            return entities.remove(entity);
        }
        finally {
            lock.writeLock().unlock();
        }
    }

    public List<T> getAll(){
        lock.readLock().lock();
        try {
            return new ArrayList<>(entities);
        }
        finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByAge(int minAge, int maxAge){
        lock.readLock().lock();
        try {
            return entities.stream().filter(e -> e instanceof User)
                    .map(e -> (User) e)
                    .filter(u -> u.getAge() >= minAge && u.getAge() <= maxAge).collect(Collectors.toList());
        }
        finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByName(String name){
        lock.readLock().lock();
        try {
            return entities.stream().filter(e -> e instanceof User)
                    .map(e -> (User) e)
                    .filter(u -> u.getName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
        }
        finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByActive(boolean IsActive){
        lock.readLock().lock();
        try {
            return entities.stream().filter(e -> e instanceof User)
                    .map(e -> (User) e)
                    .filter(u -> u.getActive() == IsActive)
                    .collect(Collectors.toList());
        }
        finally {
            lock.readLock().unlock();
        }
    }
}
