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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean possuiLegenda() {
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
    public void darPlay() {
        System.out.println("Filme iniciado.");
    }
}
