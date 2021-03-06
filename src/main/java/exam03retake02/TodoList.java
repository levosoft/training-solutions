package exam03retake02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList();

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public int getNumberOfItemsLeft() {
        int left = 0;
        for (Todo todo : todos){
            if(todo.getState().equals(State.NON_COMPLETED)){
                left++;
            }
        }
        return left;
    }

    public List<String> getMostImportantTodosText() {

        List<String> importants = new ArrayList<>();
        List<Integer> priorities = new ArrayList<>();

        for (Todo todo : todos) {
            priorities.add(todo.getPriority());
        }

        Collections.sort(priorities);
        int highestPriority = priorities.get(0);

        for (Todo todo : todos) {
            if(todo.getPriority() == highestPriority){
                importants.add(todo.getText());
            }
        }

        return importants;
    }


    public void deleteCompleted() {

        List<Todo> toRemove = new ArrayList<>();

        for (Todo todo: todos) {
            if (todo.getState() == State.COMPLETED) {
                toRemove.add(todo);
            }
        }
        todos.removeAll(toRemove);
    }


}
