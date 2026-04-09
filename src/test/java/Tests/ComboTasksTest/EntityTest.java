package Tests.ComboTasksTest;

import ComboTasks.Entity.EntityManager;
import ComboTasks.Entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityTest {
    EntityManager entityManager = new EntityManager();

    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void config(){
        user1 = new User("Mark",25,false);
        user2 = new User("Milli", 30, true);
        user3 = new User("Bob", 35,true);

        entityManager.add(user1);
        entityManager.add(user2);
        entityManager.add(user3);
    }

    @Test
    public void addTest(){
        entityManager.add("str");
        List<String> result = entityManager.getAll();
        assertEquals(1,result.size());
    }

    @Test
    public void removeTest(){
        entityManager.add("str");
        assertTrue(entityManager.remove("str"));
    }

    @Test
    public void getAlltest(){
        entityManager.add("str");
        List<String> result = entityManager.getAll();
        assertEquals("str",result.get(0));
    }

    @Test
    public void filterByAgeTest(){

        List<User> result = entityManager.filterByAge(20,30);

        assertEquals(2,result.size());
        assertTrue(result.contains(user1));
        assertFalse(result.contains(user3));
    }

    @Test
    public void filterByNameTest(){
        List<User> result = entityManager.filterByName("Lola");
        assertTrue(result.isEmpty());
    }

    @Test
    public void filterByIsActiveTest(){
        List<User> result = entityManager.filterByActive(true);
        assertTrue(result.contains(user3));
        assertEquals(2,result.size());
    }
}
