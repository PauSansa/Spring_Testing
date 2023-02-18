package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Fruita {
    @Id
    private long id;
    private String nom;
    private int quantitatQuilos;

    public Fruita() {
    }

    public Fruita(long id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruita fruita = (Fruita) o;
        return id == fruita.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Fruita{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", quantitatQuilos=" + quantitatQuilos +
                '}';
    }
}
