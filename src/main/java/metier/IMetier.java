package metier;

import entities.Article;
import entities.Categorie;

import java.util.List;

public interface IMetier {
    public Categorie addCategorie(Categorie c);
    public Article addArticle(Article a);
    public List<Categorie> listCategories();
    public List<Article> listArticles();
    public List<Article> articlesParCategorie(Long idCat);
    public Categorie updateCategorie(Categorie c);
    public boolean deleteCategorie(Long idCat);
    public Article updateArticle(Article a);
    public boolean deleteArticle(Long idArt);
    public Categorie getCategorie(Long idCat);
    public Article getArticle(Long idArt);

}
