const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com"
}

const chaves = ["nome", "idade", "cpf", "email"]

console.log(cliente[chaves[0]])
console.log(cliente[chaves[0],chaves[1]])
console.log(cliente[chaves[0],[1]])
