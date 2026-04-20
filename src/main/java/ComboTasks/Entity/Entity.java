package ComboTasks.Entity;

public class Entity {
    static void main(String[] args) {
        EntityManager entityManager = new EntityManager();

        entityManager.add(new User("Alex", 25, true));
        entityManager.add(new User("Bob", 30, false));
        entityManager.add(new User("Alice",22,true));

        System.out.println(entityManager.getAll());

        System.out.println(entityManager.filterByAge(18,26));
        System.out.println(entityManager.filterByName("Alice"));
        System.out.println(entityManager.filterByActive(true));
    }
}
