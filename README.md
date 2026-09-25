# Patatometro Profetico 🥔🔮

Un progettino Java inutilmente solenne che stima quanto una patata sia sospetta e le assegna una profezia del tutto priva di valore scientifico.

Include anche un sito statico in `site/` per presentare l'illustre ricerca al mondo.

## Avvio

Serve un JDK 17 o successivo.

```bash
javac -d out src/main/java/it/patatometro/PatatometroProfetico.java
java -cp out it.patatometro.PatatometroProfetico
```

Puoi specificare il nome di una patata:

```bash
java -cp out it.patatometro.PatatometroProfetico "Patata Cosmica"
```

## Sito

Apri `site/index.html` in un browser oppure pubblicalo con GitHub Pages.

## Licenza

Distribuito con licenza [MIT](LICENSE).
