package service;

import entities.Article;
import entities.Categorie;
import metier.MetierImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/journal")
@Produces(MediaType.APPLICATION_JSON+"; charset=utf8")
public class WebService {
    private final MetierImpl metier;

    public WebService(){
        metier = new MetierImpl();
        metier.initialiser();
    }

    @GET
    @Path("/categories")
    public List<Categorie> consulterCategories(){
        return metier.listCategories();
    }

    @GET
    @Path("/articles")
    public List<Article> consulterArticles(){
        return metier.listArticles();
    }

    @GET
    @Path("/articles/{idCat}/categories")
    public List<Article> articlesParCategorie(@PathParam(value = "idCat") Long idCat){
        return metier.articlesParCategorie(idCat);
    }

    @GET
    @Path("/categories/{idCat}")
    public Categorie getCategorie(@PathParam(value = "idCat")Long idCat){
        return metier.getCategorie(idCat);
    }

    @GET
    @Path("/articles/{idArt}")
    public Article getArticle(@PathParam(value = "idArt")Long idArt){
        return metier.getArticle(idArt);
    }

}
