/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ousse
 */
public class Equipe {
    int id;
    String nom,logo;
    int nb_joueurs;
    String origine;
     private List<PerformanceEquipe> PerformanceEquipe = new ArrayList<PerformanceEquipe>();

    @Override
    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + ", logo=" + logo + ", nb_joueurs=" + nb_joueurs + ", origine=" + origine + '}';
    }
    
    
    
    //cons
//1
    public Equipe(String nom, String logo, int nb_joueurs, String origine) {
        this.nom = nom;
        this.logo = logo;
        this.nb_joueurs = nb_joueurs;
        this.origine = origine;
    }
//2
    public Equipe(int id, String nom, String logo, int nb_joueurs, String origine) {
        this.id = id;
        this.nom = nom;
        this.logo = logo;
        this.nb_joueurs = nb_joueurs;
        this.origine = origine;
    }

    //g & s
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getNb_joueurs() {
        return nb_joueurs;
    }

    public void setNb_joueurs(int nb_joueurs) {
        this.nb_joueurs = nb_joueurs;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }
    
}
