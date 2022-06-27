const cliente = [{
  nome: 'André',
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
  }],} , {
    nome: 'Juliana',
    idade:20,
    cpf:"35463513516",
    email: 'andera@email.com',
    dependentes: [{
    nome: 'João',
    idade: 40,
    parentesco: 'primo'
    }]
  },
]

const listaDependentes = [...cliente[0].dependentes, ...cliente[1].dependentes]
console.log(listaDependentes)