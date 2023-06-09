package be.technifutur.TheCookbook.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Aliment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aliment_id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private boolean deleted = Boolean.FALSE;
}
