import java.util.ArrayList;
import java.util.List;
public class ToDo {
    private final List<String> tasks;

    public ToDo() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task){
        this.tasks.add(task);
    }

    public void removeTask(int index){
        if(!this.tasks.isEmpty()){
            this.tasks.remove(index);
        }
        else{ System.out.print("Список пуст."); }
    }

    public String getTask(int index){
        if(!this.tasks.isEmpty()){
            return this.tasks.get(index);
        }
        else { return("Список пуст."); }
    }

    public List<String> getAllTasks(){
        return new ArrayList<>(this.tasks);
    }

    public Integer size(){
        return this.tasks.size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++){
            sb.append(i+1).append(". ").append(tasks.get(i)).append("\n");
        }
        return sb.toString();
    }
}
