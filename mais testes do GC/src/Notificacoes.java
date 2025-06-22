public class Notificacoes {
    public static void main(String[] args) {
        int notifi = 0;

        for (int i = 1; i <= 5; i++) {
            if(i % 2 == 0){
                notifi += 2;
            } else {
                notifi++;
            }
        }
        System.out.println(notifi);
    }
}
