package lv.jg.lesson9.ToDo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<String> todolist = new ArrayList<>();
    public void add(String task) {
        todolist.add(task);
    }
    public void print() {
        todolist.stream().forEach(todo->System.out.println(todo)); //todo - lokalais mainigais
    }
    public void complete(String task) {
        todolist.remove(task);
    }
}

