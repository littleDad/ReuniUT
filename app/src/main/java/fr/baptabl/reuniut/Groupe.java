package fr.baptabl.reuniut;

/**
 * Created by jean on 20/11/14.
 */
import java.util.LinkedList;

public class Groupe extends LinkedList<UTCeen>{
    private String nom;


    //Constructor
    private Groupe(String nom){
        this.nom=nom;
    }

    //Getters and Setters
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    //methods
    private void addMembre(UTCeen utceen){}
    private void delMembre(UTCeen utceen){}
    private void next(){}
    private boolean isDone(){return true;}

}
