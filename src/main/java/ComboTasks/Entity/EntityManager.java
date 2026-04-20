package ComboTasks.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class EntityManager {

    private final List<User> entities = new ArrayList<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(User user) {
        lock.writeLock().lock();
        try {
            entities.add(user);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public boolean remove(User user) {
        lock.writeLock().lock();
        try {
            return entities.remove(user);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public List<User> getAll() {
        lock.readLock().lock();
        try {
            return new ArrayList<>(entities);
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByAge(int minAge, int maxAge) {
        lock.readLock().lock();
        try {
            return entities.stream()
                    .filter(u -> u.getAge() >= minAge && u.getAge() <= maxAge)
                    .collect(Collectors.toList());
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByName(String name) {
        lock.readLock().lock();
        try {
            return entities.stream()
                    .filter(u -> u.getName().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<User> filterByActive(boolean isActive) {
        lock.readLock().lock();
        try {
            return entities.stream()
                    .filter(u -> u.getActive() == isActive)
                    .collect(Collectors.toList());
        } finally {
            lock.readLock().unlock();
        }
    }
}