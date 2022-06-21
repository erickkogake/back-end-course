const notas = [10,9,8,7,6]

//const notasAtualizadas = notas.map( nota => nota+1)
//vai me dar o valor de +1, em todas as notas

const notasAtualizadas = notas.map(nota => nota == 10 ? nota : ++nota);

console.log(notasAtualizadas);



