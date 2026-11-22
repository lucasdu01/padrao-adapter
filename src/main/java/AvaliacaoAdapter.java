public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoConceito;

    public AvaliacaoAdapter(IAvaliacao avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() == 5.0f)
            avaliacaoConceito.setAvaliacao("Excelente");
        else if (this.getNota() >= 4.0f)
            avaliacaoConceito.setAvaliacao("Bom");
        else if (this.getNota() >= 3.0f)
            avaliacaoConceito.setAvaliacao("Regular");
        else
            avaliacaoConceito.setAvaliacao("Ruim");
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("Excelente"))
            this.setNota(5.0f);
        else if (avaliacaoConceito.getAvaliacao().equals("Bom"))
            this.setNota(4.0f);
        else if (avaliacaoConceito.getAvaliacao().equals("Regular"))
            this.setNota(3.0f);
        else
            this.setNota(1.0f);
    }
}