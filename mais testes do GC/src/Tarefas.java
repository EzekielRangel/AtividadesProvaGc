import java.util.ArrayList;

public class Tarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Faxer exercicios");
        tarefas.add("Revisar codigo");

        for(String tarefa : tarefas){
            if(tarefa.contains("Java")){
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}
