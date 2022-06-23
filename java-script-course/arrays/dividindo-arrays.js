const nomes = ['joão', 'lucas', 'kogs', 'lara']
const sala1 = nomes.slice(0, nomes.length/2) //colocamos num 0 como param, para pegar desde o primeiro índice em diante.
const sala2 = nomes.slice(nomes.length/2) //quando não utilizamos nenhum primeiro núm como param, ele sempre irá até o final da length.

console.log(sala1)
console.log(sala2)

const numeros = [5, 2, 4, 6, 4, 8, 9, 7]
const primeiraColuna = numeros.slice(0, numeros.length/3)
const segundaColuna = numeros.slice(numeros.length/2)

console.log(primeiraColuna)
console.log(segundaColuna)



