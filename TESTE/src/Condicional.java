public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = false;
        double note = 8.1;
        String tipoPlano = "plus";


        if(incluidoNoPlano || tipoPlano.equals ("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague a mensalidade");
        }
    }
}
