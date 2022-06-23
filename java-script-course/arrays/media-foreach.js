const notas = [10,10,4,8,5]

let somaDasNotas = 0;

//callback - esse método é um callback, pois ele chama outra função.

notas.forEach(notas => {
    somaDasNotas += notas;
})

let media = somaDasNotas/notas.length

console.log(media)