package lv.jg.lesson9.ToDo;

public class ToDoListTest {
    public static void main(String[] args) {
        ToDoList todolist = new ToDoList();
        todolist.add("Buy milk");
        todolist.add("Buy sour cream");
        todolist.add("Do my JavaGuru homework");
        todolist.add("Watch YT on why need HashMap");

        todolist.print();
        todolist.complete("Buy milk");
        todolist.print();
    }
}
