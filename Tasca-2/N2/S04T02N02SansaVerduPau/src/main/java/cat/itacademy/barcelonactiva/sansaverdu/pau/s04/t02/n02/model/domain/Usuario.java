package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50)
    private String name;

    private String surname;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;
}
