package ifsp.ff.spring_API.model.conserto;

public record DadosListagemConserto(String entrada, String saida, String nome_mecanico, String marca_veiculo, String modelo_veiculo) {

    public DadosListagemConserto(Conserto conserto){
        this(conserto.getEntrada(),
                conserto.getSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo());
    }
}