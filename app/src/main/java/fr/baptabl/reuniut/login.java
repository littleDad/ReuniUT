package fr.baptabl.reuniut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;
import java.lang.String;
/**
 * Created by bat on 13/12/14.
 */

public class login extends UTCeen{
    private static login Instance = null;
    //Context curContext;
    private String mdp;
    private LinkedList<Groupe> groupes;
    private LinkedList<Reunion> reunions;


//Constructeur
    private login(String login, String mdp) {
        super(login);//On fait appel au constructeur de UTCeen
        this.mdp=mdp;
        groupes= new LinkedList<Groupe>();
        reunions=new LinkedList<Reunion>();

    }
    public void addReunion(Reunion reu)
    {
        reunions.add(reu);

    }
    public Reunion getReunion(int i)
    {
        return reunions.get(i);
    }
    public void addGroupe(String nom, String membres)
    {
        Groupe g= new Groupe(nom);
        String m[]=membres.split(",");
        for (int i = 0; i < m.length; i++)
        {
            m[i]=m[i].replace(" ", "");
            g.add(new UTCeen(m[i]));
        }
        groupes.add(g);

    }

    public String[] getGroupe()
    {
        ListIterator<Groupe> it=groupes.listIterator(0);
        String gr[]=new String[this.groupes.size()];
        while(it.hasNext())
        {
            gr[it.nextIndex()]=this.groupes.get(it.nextIndex()).getNom();//On récupère les noms des groupes dans un tableau
            it.next();
        }
        return gr;
    }
    public Groupe getGroupe(String nom)
    {
        ListIterator<Groupe> it=groupes.listIterator(0);
        while(it.hasNext())
        {
            if(groupes.get(it.nextIndex()).getNom().equals(nom))
            {
                break;
            }
            it.next();
        }
        return groupes.get(it.nextIndex());
    }
    public Reunion getReunion(String nom)
    {
        ListIterator<Reunion> it=reunions.listIterator(0);
        while(it.hasNext())
        {
            if(reunions.get(it.nextIndex()).getSujet().equals(nom))
            {
                break;
            }
            it.next();
        }
        return reunions.get(it.nextIndex());
    }
    //getInstance()
    static public login getInstance(String login, String mdp) {
        if (Instance == null) {
            Instance = new login(login, mdp);
        }
        return Instance;
    }
    static public login getInstance() {//Accesseur "classique" de l'objet
        return Instance;
    }
    static public boolean connexion() {// test de connexion
        return true; //En attendant le test
    }


    public String getLogin(){return super.getLogin();}
    public String getMdp(){return mdp;}

}