package fr.baptabl.reuniut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bat on 10/12/14.
 */

public class ActivityMenu extends Activity implements View.OnClickListener {
    private Button buttCreerGroupe = null;
    private Button buttCreerReu = null;
    private Button buttVoirEDT = null;
    private Button buttLogout = null;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent(); //on récupère le parent
        //EDT = i.getStringExtra("EDT");

        setContentView(R.layout.activity_menu);

        buttCreerGroupe = (Button) findViewById(R.id.buttCreerGroupe);
        buttCreerGroupe.setOnClickListener(this);
        buttCreerReu = (Button) findViewById(R.id.buttCreerReu);
        buttCreerReu.setOnClickListener(this);
        buttVoirEDT = (Button) findViewById(R.id.buttVoirEDT);
        buttVoirEDT.setOnClickListener(this);
        buttLogout = (Button) findViewById(R.id.buttLogout);
        buttLogout.setOnClickListener(this);

        //on récupère l'extra passé par ActivityLogin
        //boolean connectionReussie = i.getIntExtra(ActivityLogin.connectionReussie, 0);

    }

    @Override
    public void onClick(View v) {
        //Button buttLogout = (Button) v;
        switch(v.getId()){
            case R.id.buttLogout://quitte l'appli. dans la V2, détruit le singleton CAS et retourne à la page de login.
                this.finish();
                //System.exit(0);//redémarre l'appli, réinitialise les valeurs dont le isConnected du CAS
            break;

            case R.id.buttCreerReu:
                Intent newActivity2 = new Intent(ActivityMenu.this, ActivityReunion.class);
                startActivity(newActivity2);
                break;

            case R.id.buttCreerGroupe:
                Intent newActivity3 = new Intent(ActivityMenu.this, ActivityGroupe.class);
                startActivity(newActivity3);
            break;

            case R.id.buttVoirEDT:
                Intent newActivity4 = new Intent(ActivityMenu.this, ActivityMenuVueEdt.class);
                startActivity(newActivity4);
            break;

        }

    }
}
