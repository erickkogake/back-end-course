const listaNota = [10,6,8]
listaNota.push(7)
listaNota.push(5,6,4,8,6,1,2,3)
console.log(listaNota)

let media = (listaNota[0] + listaNota[1] + listaNota[2] + listaNota[3] + listaNota[4] + listaNota[5] + listaNota[6])/listaNota.length

console.log(media)

console.log(media)

let media1 = (listaNota[0] + listaNota[1] + listaNota[2] + listaNota[3] + listaNota[4] + listaNota[5] + listaNota[6] + listaNota[7] + listaNota[8])/listaNota.length

console.log(media1)

//a função .pop, serve para excluir o ultimo elemento da array.
//não precisa de nenhum param

const notas = [10,7,8,5,10]
notas.pop();
console.log(notas)

let media2 =(notas[0] + notas[1] + notas[2] + notas[3])/notas.length

console.log(`A média da nota do aluno é: ${media2}`)