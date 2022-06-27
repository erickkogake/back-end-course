const cliente = {
  nome: "Andre",
  idade: 36,
  cpf: "12371273709",
  email: "andre@gmail.com",
  dependentes: [{
    nome: 'Laise',
    idade: 50,
    parentesco: 'conjuge' ,
  } , {
    nome: 'Eduardo',
    idade: 30,
    parentesco: 'tio' ,
  } , {
    nome: 'Roberto',
    idade: 32,
    parentesco: 'tio' ,
  }]
}

let relatorio= "";

// for (let info in cliente){
//   relatorio += `${cliente[info]}`
// }

for (let info in cliente) {
  if(typeof cliente[info] === "object" || typeof cliente[info] === "function") {
    continue
  } else {
    relatorio += `
    ${info} ==> ${cliente[info]}`
  }
}
console.log(relatorio) //mostra o resultado do objeto
