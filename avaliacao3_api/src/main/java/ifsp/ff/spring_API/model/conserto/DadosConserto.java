package ifsp.ff.spring_API.model.conserto;

import ifsp.ff.spring_API.model.veiculo.DadosVeiculo;
import ifsp.ff.spring_API.model.mecanico.DadosMecanico;

public record DadosConserto(String entrada, String saida, DadosVeiculo veiculo, DadosMecanico mecanico) {

}