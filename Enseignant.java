import java.util.Objects;

public class Enseignant {
    private int id;
    private String nom;
    private String prenom;

    // Constructeur sans paramètres
    public Enseignant() {
    }

    // Constructeur avec paramètres
    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignant that = (Enseignant) o;
        return id == that.id;
    }

    // Redéfinition de la méthode hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
