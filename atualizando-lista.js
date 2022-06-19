const listaDeChamada = ['João', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Leo']

listaDeChamada.splice(3,2,'Pudim')
console.log(listaDeChamada);

//no .splice, utiliza a estrutura de 2 ou 3 param.
//primeiro param - Utilizamos para colocar em qual indice que queremos "retirar" da array.
//segundo param - Quantos índices queremos retirar
//terceiro param - Se queremos incluir algum outro elemento na array. 

console.log(`A lista de chamada: ${listaDeChamada}`)

