import java.util.Random;

public class DoacaoMidia {
    public static void main(String[] args) {
        Midia midia = pegarMidiaAleatoria();
        System.out.println("Mídia: " + midia.getTipo());
        System.out.println("Nome: " + midia.getNome());
        System.out.println();
        midia.darPlay();
        System.out.println();
        System.out.println("Informações:");
        System.out.println(midia);


    }
    public static Midia pegarMidiaAleatoria(){
        Dvd dvd1 = new Dvd ("0001",10.00, "Os Vingadores", "Português", true, "Inglês");
        Dvd dvd2 = new Dvd ("0002",12.00, "O Discurso do Rei", "Português", true, "Inglês");
        Dvd dvd3 = new Dvd ("0003",9.00, "Minha Mãe é Uma Peça", "Português", false, "Português");
        CD cd1 = new CD("0004",5.00, "Circus", "Britney Spears", 20);
        CD cd2 = new CD("0005",15.00, "Punk in Drublic", "NOFX", 17);
        CD cd3 = new CD("0005",19.00, "Ritmo Perfeito", "Annita", 15);

        Random gerador = new Random();
        int aleatorio = gerador.nextInt(6);

        switch (aleatorio){
            case 0: return dvd1;
            case 1: return dvd2;
            case 2:return dvd3;
            case 3:return cd1;
            case 4:return cd2;
            default: return cd3;
        }
    }
    public static void assistirFilme(){
        Dvd dvdEscolhido = new Dvd("0012", 12.00, "Moana", "Português", true, "Inglês");

        dvdEscolhido.legenda(true, "Inglês");
        dvdEscolhido.legenda(false);
    }
}