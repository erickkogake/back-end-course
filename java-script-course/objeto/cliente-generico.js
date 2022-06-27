function Cliente(nome, idade,cpf, saldo) {
  this.nome = nome
  this.idade = idade
  this.cpf = cpf
  this.saldo = saldo
  this.deposita = function(valor) {
    this.saldo += valor;
  }
}

const Murilo = new Cliente('Edu', 12, "654521651456", 200, 250 );

console.log(Murilo)

Murilo.deposita(200)

console.log(Murilo.saldo)