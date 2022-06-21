const notas = [10,10,4,8,5]

let somaDasNotas = 0;

notas.forEach(imprimeNumeros);

function imprimeNumeros(notas) {
    console.log(notas)
}
//callback - esse método é um callback, pois ele chama outra função.

//notas.forEach(notas => {
 //   somaDasNotas += notas;
//})

//let media = somaDasNotas/notas.length

//console.log(media)
