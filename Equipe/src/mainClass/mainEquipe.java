/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainClass;

import entite.Equipe;
import service.EquipeService;

/**
 *
 * @author Ousse
 */
public class mainEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       EquipeService es = new EquipeService();
       Equipe E = new Equipe(1,"real madrid","335021438_877929036854713_3893784838907560567_n.jpg",13,"spain");
   //   System.out.println(es.readById(1));
   
   es.update(E);
      
      for (Equipe equipe : es.readAll()) {
    System.out.println(equipe.getNom() + " " + equipe.getOrigine());
        
    }
    
}}
