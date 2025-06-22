public class livro {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }
    public String status(){
        if(emprestado){
            return "Indisponivel";
        } else{
            return "Disponivel";
        }
    }

    public static void main(String[] args) {
        livro l = new livro();
        l.titulo = "Java para iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
