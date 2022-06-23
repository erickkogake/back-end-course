const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com"
}

console.log(cliente.nome)
console.log(`Meu nome é ${cliente.nome}, e tenho ${cliente.idade} anos.`)

console.log(cliente.nome, cliente.idade, cliente.cpf, cliente.email)

//substring - usamos para colocar a quantidade de strings dentro do valor dado.
// primeiro parâmetro é o início da informação, onde passamos o valor do indíce
// segundo parâmetro é o numero do índice a ser passado.

console.log(cliente.cpf.substring(0,4))