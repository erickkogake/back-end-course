const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com",
  dependentes: [{
    nome: 'Laise',
    idade: 50,
    parentesco: 'conjuge' ,
  }]
} 

cliente.dependentes.push({
  nome: 'mo',
  parentesco: 'ela mesmo'
}) 

console.log(cliente)

const parente = cliente.dependentes.filter(dependente => dependente.parentesco === 'ela mesmo')

console.log(parente)
console.log(parente[0].parentesco)

