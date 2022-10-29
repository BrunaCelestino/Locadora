public class CD extends Midia{
    private String artista;
    private int quantidadeFaixas;

    public CD(String codigo, Double preco, String nome, String artista, int quantidadeFaixas) {
        super(codigo, preco, nome);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    @Override
    public String getTipo(){
        return "CD";
    }
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + "Mídia: CD" +
                "\nArtista: " + artista +
                "\nQuantidade de faixas: " + quantidadeFaixas + "\n";
    }

    @Override
    public void darPlay() {
        System.out.println("Primeira faixa tocando");
    }
}
