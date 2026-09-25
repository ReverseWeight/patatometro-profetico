const prophecies = [
  "Oggi il tuo calzino sinistro avrà un'idea brillante.",
  "Un piccione approverà la tua prossima scelta di snack.",
  "Non fidarti di una forchetta con troppa autostima.",
  "Il destino ha prenotato per te un posto vicino alla marmellata.",
  "Qualcuno pronuncerà la parola 'patata' al momento giusto."
];

document.querySelector('#ask').addEventListener('click', () => {
  const potato = document.querySelector('#potato').value.trim() || 'Patata Anonima';
  const score = Math.floor(Math.random() * 100) + 1;
  const prophecy = prophecies[Math.floor(Math.random() * prophecies.length)];
  document.querySelector('#result').textContent = `${potato}: sospettosità ${score}/100. ${prophecy}`;
});
