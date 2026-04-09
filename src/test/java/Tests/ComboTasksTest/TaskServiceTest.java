package Tests.ComboTasksTest;

import ComboTasks.TaskManager.Priority;
import ComboTasks.TaskManager.Status;
import ComboTasks.TaskManager.Task;
import ComboTasks.TaskManager.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService<Integer> service;

    @BeforeEach
    void setUp(){
          service = new TaskService<>();
        service.addTask(new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2024,1,1)));
        service.addTask(new Task<>(2, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.of(2024,2,1)));
        service.addTask(new Task<>(3, Status.DONE, Priority.LOW, LocalDate.of(2024,3,1)));
    }

    @Test
    public void addTaskTest(){
        boolean added = service.addTask(new Task<>(4,Status.NEW,Priority.LOW,LocalDate.now()));
        assertTrue(added);
        assertEquals(4,service.size());
    }

    @Test
    public void addDuplicateTaskTest(){
        boolean added =  service.addTask(new Task<>(1, Status.DONE, Priority.HIGH, LocalDate.of(2024,1,1)));
        assertFalse(added);
        assertEquals(3,service.size());
    }

    @Test
    public void removeTaskTest(){
        boolean remoed = service.removeTask(1);
        assertTrue(remoed);
        assertEquals(2,service.size());
    }

    @Test
    public void findTaskByStatusTest(){
        List<Task<Integer>> result = service.findTaskByStatus(Status.NEW);

        assertEquals(1,result.size());
        assertEquals(1,result.get(0).getId());
    }

    @Test
    public void findTaskByPriorityTest(){
        List<Task<Integer>> result = service.findTaskByPriority(Priority.HIGH);

        assertEquals(1,result.size());
        assertEquals(1,result.get(0).getId());
    }

    @Test
    public void sortedTaskByDateASCTest(){
        List<Task<Integer>> result = service.sortedByDateASC();

        assertEquals(1,result.get(0).getId());
    }

    @Test
    public void sortedTaskByDateDESCTest(){
        List<Task<Integer>> result = service.sortedByDateDESC();

        assertEquals(3,result.get(0).getId());
    }


}
