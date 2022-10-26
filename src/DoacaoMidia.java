import java.util.Random;

public class DoacaoMidia {
    public static void main(String[] args) {
        Midia midia = pegarMidiaAleatoria();

        System.out.println(midia);

    }
    public static Midia pegarMidiaAleatoria(){
        Dvd dvd1 = new Dvd ("0001",10.00, "Os Vingadores", "Português", true, "Inglês");
        Dvd dvd2 = new Dvd ("0002",12.00, "O Discurso do Rei", "Português", true, "Inglês");
        Dvd dvd3 = new Dvd ("0003",9.00, "Minha Mãe é Uma Peça", "Português", false, "Português");

        Random gerador = new Random();
        int aleatorio = gerador.nextInt(3);

        switch (aleatorio){
            case 0: return dvd1;
            case 1: return dvd2;
            default:return dvd3;
        }
    }

}