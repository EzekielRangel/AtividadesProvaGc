import java.util.ArrayList;

public class horarios {
    public static void main(String[] args) {
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");
        System.out.println(horarios.get(0)); //testa indice 0 (no caso horario 1)
        System.out.println(horarios.get(1)); //testa indice 1 (no caso horario 2)
    }
}
