const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com",
  dependentes: [{
    nome: 'Laise',
    idade: 50,
    parentesco: 'conjuge' ,
  }] ,
} 

cliente.dependentes.push({
  nome: 'mo',
  parentesco: 'ela mesmo'
}) 
 
cliente.saldo = 100,

cliente.depositar = function(valor)
  {
    this.saldo = this.saldo + valor;
    // this.saldo += valor;
  }

console.log(cliente.saldo)
cliente.depositar(50)
console.log(cliente.saldo)