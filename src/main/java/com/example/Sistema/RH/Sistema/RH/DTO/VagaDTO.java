package com.example.Sistema.RH.Sistema.RH.DTO;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import java.io.Serializable;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VagaDTO extends RepresentationModel<VagaDTO> implements Serializable{
    @NonNull
    private UUID id;
    @NonNull
    private String descricao;
    private String data;
    @NonNull
    private String salario;


}
