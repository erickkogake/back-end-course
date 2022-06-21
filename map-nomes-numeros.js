let nomes = ['ana Julia', 'Caio vinicius', 'BIA silva']

const nomesAtualizados = nomes.map(nome => nome.toUpperCase())

console.log(nomesAtualizados)

const nome = "Alura";
let nomeMaiusculas = "";

for (let i = 0; i < nome.length; i++) {
 nomeMaiusculas += nome[i].toUpperCase()
}
console.log(nomeMaiusculas) //ALURA

const multiplicaPorDois = (num) => num * 2;
const numeros = [2,1,4,6]
const numerosAtualizados = numeros.map(multiplicaPorDois)

console.log(numerosAtualizados);
