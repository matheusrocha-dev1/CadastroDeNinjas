package dev.matheusrocha.CadastrosDeNInjas.Ninjas;
import dev.matheusrocha.CadastrosDeNInjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_cadastro_de_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
