package it.patatometro;

import java.util.List;
import java.util.Random;

/** Un oracolo per tuberi: decisamente non una disciplina scientifica. */
public final class PatatometroProfetico {
    private static final List<String> PROFEZIE = List.of(
            "Oggi troverai una moneta, ma sarà probabilmente una briciola.",
            "Un piccione approverà silenziosamente la tua prossima idea.",
            "Evita di discutere con un tostapane: ha opinioni troppo calde.",
            "Una calza spaiata diventerà la tua guida spirituale.",
            "Il destino ti sorride, ma ha ancora un pezzetto di prezzemolo tra i denti.");

    private PatatometroProfetico() { }

    public static void main(String[] args) {
        String patata = args.length == 0 ? "Patata Anonima" : String.join(" ", args);
        Random caso = new Random();
        int sospetto = 1 + caso.nextInt(100);
        String profezia = PROFEZIE.get(caso.nextInt(PROFEZIE.size()));

        System.out.println("🥔 Patatometro Profetico");
        System.out.printf("Patata analizzata: %s%n", patata);
        System.out.printf("Indice di sospettosità: %d/100%n", sospetto);
        System.out.println("Profezia: " + profezia);
    }
}
