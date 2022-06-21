const notas = [10,5,4,3.5,6,7]

let somaDasNotas = 0

for (let i = 0; i < notas.length; i++) {
  somaDasNotas += notas[i];
}

let media = somaDasNotas/notas.length;

console.log(media)

