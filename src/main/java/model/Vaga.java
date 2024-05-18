package model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
@Data
@Entity
@Table(name = "Vaga")
@Getter
@Setter
public class Vaga{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String descricao;
    private String data;
    private String salario;
}
