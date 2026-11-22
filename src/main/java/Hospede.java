public class Hospede {
    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Hospede() {
        avaliacao = new AvaliacaoEstrelas();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNota();
    }
}
