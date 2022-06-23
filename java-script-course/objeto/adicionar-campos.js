const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com"
}

console.log(cliente)
cliente.fone = '9845615451'
console.log(cliente)
cliente.fone='6546432165'
console.log(cliente)

delete cliente.nome 
delete cliente['idade']

console.log(cliente)