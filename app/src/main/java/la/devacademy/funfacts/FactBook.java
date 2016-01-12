package la.devacademy.funfacts;

import java.util.Random;

public class FactBook {
    // Fields (Member variables) - Properties about the object
    private String[] mFacts = {
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

    // Methods - Actions the object can take
    public String getFact() {

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
