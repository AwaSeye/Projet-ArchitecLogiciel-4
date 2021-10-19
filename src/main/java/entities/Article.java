package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Article implements Serializable {
    public Long idArticle;
    public String titre;
    public String contenu;
    public Categorie categorie;

    public Article() {
    }

    public Article(Long idArticle, String titre, String contenu, Categorie categorie) {
        this.idArticle = idArticle;
        this.titre = titre;
        this.contenu = contenu;
        this.categorie = categorie;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
