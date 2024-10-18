package ifsp.ff.spring_API.model.conserto;

import ifsp.ff.spring_API.model.veiculo.Veiculo;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ifsp.ff.spring_API.model.mecanico.Mecanico;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
    private String entrada;

    @NotBlank
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
    private String saida;

    @Embedded
    @Valid
    private Veiculo veiculo;

    @Embedded
    @Valid
    private Mecanico mecanico;

    public Conserto(DadosConserto dados){
        this.entrada = dados.entrada();
        this.saida = dados.saida();
        this.veiculo = new Veiculo(dados.veiculo());
        this.mecanico = new Mecanico(dados.mecanico());
    }
}