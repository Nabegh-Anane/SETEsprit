# Conception par Objet et Programmation Java

## Module: Interfaces et Collections

### Objectif
Ce projet a pour but de mettre en pratique les concepts de **programmation orientée objet** et d'utilisation des **collections Java** en construisant des classes et interfaces pour gérer des enseignants au moyen de `HashSet` et `TreeSet`.

---

## Étapes du Projet

### 1. **Classe `Enseignant`**
Un enseignant est caractérisé par:
- **`id`**: Identifiant unique de l'enseignant.
- **`nom`**: Nom de l'enseignant.
- **`prenom`**: Prénom de l'enseignant.

#### Méthodes et Constructeurs
- Deux constructeurs : 
  - Un constructeur par défaut (sans paramètre).
  - Un constructeur avec des paramètres pour initialiser les attributs.
- Méthodes **d'accès et de modification** :
  - `getId()`, `getNom()`, `getPrenom()`
  - `setId(..)`, `setNom(..)`, `setPrenom(..)`
- Redéfinition de la méthode `equals(Object o)` pour comparer deux enseignants en fonction de leur `id`.
- Redéfinition de la méthode `toString()` pour fournir une représentation textuelle d'un enseignant.

#### Test
Un programme `main` doit être écrit pour tester toutes les méthodes de la classe `Enseignant`.

---

### 2. **Interface `GestionEnseignant`**

Cette interface définit les opérations à effectuer pour gérer une liste d'enseignants :

```java
public interface GestionEnseignant {
    void ajouterEnseignant(Enseignant e);
    boolean rechercherEnseignant(Enseignant e);
    boolean rechercherEnseignant(int id);
    void supprimerEnseignant(Enseignant e);
    void displayEnseignants();
}
```

---

### 3. **Classes `EspritHashSet` et `EspritTreeSet`**

Ces classes implémentent l'interface `GestionEnseignant` et utilisent respectivement un `HashSet` et un `TreeSet` pour stocker les enseignants.

#### Points Clés :
- **`EspritHashSet`** :
  - Gère les enseignants à l'aide d'un `HashSet`.
- **`EspritTreeSet`** :
  - Gère les enseignants à l'aide d'un `TreeSet`.
  - Implémente l'ordre des enseignants (par exemple, basé sur `id`).

---

## Organisation des Fichiers

- `Enseignant.java`: Définition de la classe `Enseignant`.
- `GestionEnseignant.java`: Définition de l'interface `GestionEnseignant`.
- `EspritHashSet.java`: Implémentation basée sur `HashSet`.
- `EspritTreeSet.java`: Implémentation basée sur `TreeSet`.
- `Main.java`: Programme principal pour tester l'ensemble des fonctionnalités.

---

## Instructions

1. **Implémentez la classe `Enseignant`** avec les attributs et méthodes décrits.
2. **Créez l'interface `GestionEnseignant`** avec les signatures des méthodes listées.
3. **Implémentez les classes `EspritHashSet` et `EspritTreeSet`** pour gérer les enseignants.
4. **Testez toutes les fonctionnalités** dans un programme principal.

---

## Résultat Attendu
- Une gestion efficace des enseignants à l'aide de collections (`HashSet` et `TreeSet`).
- Comparaison d'enseignants basée sur leur `id`.
- Affichage et manipulation des enseignants via l'interface définie.

