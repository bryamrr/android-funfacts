package la.devacademy.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "Sabias que los cocodrilos pueden comer una sola vez al año.",
                        "Es imposible estornudar con los ojos abiertos.",
                        "La cucaracha puede vivir nueve días sin su cabeza, antes de morir de hambre.",
                        "Es posible hacer que una vaca suba escaleras pero no que las baje.",
                        "Las estrellas de mar no tienen cerebro.",
                        "Utilizar audífonos por solo una hora, incrementa el numero de bacteria en tu oido unas 700 veces.",
                        "El 35% de la gente que atiende los anuncios de citas amorosas es gente casada.",
                        "Una de cada mil personas puede doblar la lengua para atrás.",
                        "Thomas Alva Edison temía a la oscuridad.",
                        "Los elefantes son los únicos animales que no pueden saltar."
                };

                // The button was clicked, so update the fact TextView with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);

                // Update the screen with our dynamic fact
                mFactTextView.setText(facts[randomNumber]);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }

}
