public class Dvd extends Midia{

    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    @Override
    public String getTipo(){
        return "DVD";
    }
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean getPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public void legenda(boolean ligar, String idioma){
        this.possuiLegenda = ligar;
        this.idiomaLegenda = idioma;
    }

    public void legenda(boolean ligarDesligar){
        this.possuiLegenda = ligarDesligar;
    }

    @Override
    public String toString() {
        return super.toString() + "Mídia: DVD \n" +
                "Idioma: " + idioma +
                "\nPossui legenda?: " + (possuiLegenda ? "SIM" : "NÃO") +
                "\nIdioma da legenda: " + idiomaLegenda;
    }
    @Override
    public void darPlay() {
        System.out.println("Filme iniciado.");
    }
}
