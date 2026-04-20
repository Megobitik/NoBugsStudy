package Tests.ComboTasksTest;

import ComboTasks.Entity.EntityManager;
import ComboTasks.Entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityTest {

    private EntityManager entityManager;

    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void config() {
        entityManager = new EntityManager();

        user1 = new User("Mark", 25, false);
        user2 = new User("Milli", 30, true);
        user3 = new User("Bob", 35, true);

        entityManager.add(user1);
        entityManager.add(user2);
        entityManager.add(user3);
    }

    @Test
    public void addTest() {
        User user4 = new User("Lola", 20, true);
        entityManager.add(user4);

        List<User> result = entityManager.getAll();
        assertEquals(4, result.size());
        assertTrue(result.contains(user4));
    }

    @Test
    public void removeTest() {
        assertTrue(entityManager.remove(user1));
        assertFalse(entityManager.getAll().contains(user1));
    }

    @Test
    public void getAllTest() {
        List<User> result = entityManager.getAll();
        assertEquals(3, result.size());
    }

    @Test
    public void filterByAgeTest() {
        List<User> result = entityManager.filterByAge(20, 30);

        assertEquals(2, result.size());
        assertTrue(result.contains(user1));
        assertFalse(result.contains(user3));
    }

    @Test
    public void filterByNameTest() {
        List<User> result = entityManager.filterByName("Lola");
        assertTrue(result.isEmpty());
    }

    @Test
    public void filterByIsActiveTest() {
        List<User> result = entityManager.filterByActive(true);

        assertTrue(result.contains(user2));
        assertTrue(result.contains(user3));
        assertEquals(2, result.size());
    }
}