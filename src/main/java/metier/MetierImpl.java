package metier;

import entities.Article;
import entities.Categorie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetierImpl implements IMetier{

    private Map<Long, Categorie> categories = new HashMap<Long, Categorie>();
    private Map<Long, Article> articles = new HashMap<Long, Article>();

    @Override
    public Categorie addCategorie(Categorie c) {
        categories.put(c.getIdCategorie(), c);
        return c;
    }

    @Override
    public Article addArticle(Article a) {
        a.setCategorie(getCategorie(a.getCategorie().getIdCategorie()));
        articles.put(a.getIdArticle(), a);
        return a;
    }

    @Override
    public Categorie getCategorie(Long idCat) {
        return categories.get(idCat);
    }

    @Override
    public Article getArticle(Long idArt) {
        return articles.get(idArt);
    }

    @Override
    public List<Categorie> listCategories() {
        return new ArrayList<Categorie>(categories.values());
    }

    @Override
    public List<Article> listArticles() {

        return new ArrayList<Article>(articles.values());
    }

    @Override
    public List<Article> articlesParCategorie(Long idCat) {
        List<Article> article = new ArrayList<Article>();
        for (Article a:articles.values())
            if(a.getCategorie().getIdCategorie().equals(idCat))
                article.add(a);
        return article;
    }

    @Override
    public Categorie updateCategorie(Categorie c) {
        categories.put(c.getIdCategorie(), c);
        return c;
    }

    @Override
    public boolean deleteCategorie(Long idCat) {
        if(categories.get(idCat) != null){
            categories.remove(idCat);
            return true;
        }
        else throw new RuntimeException("Categorie inexistante!!!") ;
    }

    @Override
    public Article updateArticle(Article a) {
        articles.put(a.getIdArticle(), a);
        return a;
    }

    @Override
    public boolean deleteArticle(Long idArt) {
        if(articles.get(idArt) != null) {
            articles.remove(idArt);
            return true;
        }
        else throw new RuntimeException("Article inexistant!!!");
    }

    public void initialiser(){
        addCategorie(new Categorie(1L, "Sport"));
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine);
        addCategorie(new Categorie(2L, "Santé"));
        addCategorie(new Categorie(3L, "Réligion"));
        addCategorie(new Categorie(4L, "Politique"));
        addCategorie(new Categorie(5L, "Culture"));
        addCategorie(new Categorie(6L, "Education"));

        addArticle(new Article(1L, "Pétrole au Sénégal", "Le pétrole est trop cher dans ce pays.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(4L)));
        addArticle(new Article(2L, "Situation du Covid", "On a que 04 cas aujourd'hui.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(2L)));
        addArticle(new Article(3L, "Le ballon d'Or", "Le ballon d'Or est remporté par Sadio Mané.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(1L)));
        addArticle(new Article(4L, "Le MAGAL 2021", "Le Grand Magal de TOUBA a été celebré ce dimanche passé.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(3L)));
        addArticle(new Article(5L, "Le GAMOU 2021", "Le Gamou n'aura pas lieu a Tivaoune.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(3L)));
        addArticle(new Article(6L, "Journée Culturelle.", "Culture.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(5L)));
        addArticle(new Article(7L, "Election au Senegal.", "Gagnant.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(4L)));
        addArticle(new Article(8L, "Rentrée Scolaire.", "Eleves et etudiants.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(6L)));
        addArticle(new Article(9L, "Le CAN 2024", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(1L)));
        addArticle(new Article(10L, "Journée Khassida", "Jereujeuff Cheikhoul Khadim.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", getCategorie(3L)));

    }
}
