public class Main {
    public static void main(String[] args) {
        GestionEnseignant gestionHashSet = new EspritHashSet();
        GestionEnseignant gestionTreeSet = new EspritTreeSet();

        Enseignant e1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant e2 = new Enseignant(2, "Durand", "Marie");
        Enseignant e3 = new Enseignant(3, "Martin", "Paul");

        // Test avec HashSet
        System.out.println("Test avec HashSet:");
        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.displayEnseignants();
        System.out.println("Recherche (id=2): " + gestionHashSet.rechercherEnseignant(2));
        gestionHashSet.supprimerEnseignant(e2);
        gestionHashSet.displayEnseignants();

        // Test avec TreeSet
        System.out.println("\nTest avec TreeSet:");
        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e3);
        gestionTreeSet.displayEnseignants();
        System.out.println("Recherche (id=3): " + gestionTreeSet.rechercherEnseignant(3));
        gestionTreeSet.supprimerEnseignant(e3);
        gestionTreeSet.displayEnseignants();
    }
}
