import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Datas {
    public static void main(String[] args) {
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if(envio.isBefore(limite)) {
            System.out.println("Fora do Horario");
        } else {
            System.out.println("Tarefa enviada");
        }
    }
}
