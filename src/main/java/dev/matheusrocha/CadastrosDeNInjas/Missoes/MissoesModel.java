package dev.matheusrocha.CadastrosDeNInjas.Missoes;

import dev.matheusrocha.CadastrosDeNInjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}

