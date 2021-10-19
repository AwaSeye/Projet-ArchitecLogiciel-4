package entities;

import java.io.Serializable;

public class Categorie implements Serializable {
    public Long idCategorie;
    public String libelle;

    public Categorie() {
    }

    public Categorie(Long idCategorie, String libelle) {
        this.idCategorie = idCategorie;
        this.libelle = libelle;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
