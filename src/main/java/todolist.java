public class todolist {
    public static void main(String[] args){
        var todo = new ToDo();

        todo.addTask("task_1");
        todo.addTask("task_2");
        todo.addTask("task_3");

        System.out.println("Мои задачи:\n" + todo);

        System.out.println("Первая задача: \n" + todo.getTask(0));
        todo.removeTask(1); // Удаляем вторую задачу
        System.out.println("\nПосле удаления:\n" + todo);
    }
}
