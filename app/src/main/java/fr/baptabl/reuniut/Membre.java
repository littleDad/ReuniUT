package fr.baptabl.reuniut;

import java.util.LinkedList;

/**
 * Created by bat on 09/12/14.
 */
public class Membre extends LinkedList<UTCeen> {
    private UTCeen id;
    private Membre suivant;

    //Constructor
    private Membre(UTCeen id, Membre suivant){
    	this.id=id;
    	this.suivant=suivant;
    }

    public UTCeen getId(){return null;}

}
