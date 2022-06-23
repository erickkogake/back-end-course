const salaJs = [5,3,6,4]
const salaPython = [9,7,8,6]
const salaJava = [9,5,9,3]


function mediaSala(notasDaSala) {
  const somaDasNotas = notasDaSala.reduce((acum, atual) => atual + acum, 0 ) 
  return somaDasNotas/notasDaSala.length
}

console.log(`a média da sala de Java ${mediaSala(salaJava)}`)
console.log(`a média Python ${mediaSala(salaPython)}`)

const numeros = [10,60,40,25,18,16]

const media = numeros.reduce((acum, atual) => atual + acum, 0)/numeros.length
//let medias = media/numeros.length

console.log(`essa é a média ${media}`)