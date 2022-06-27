const cliente = {
  nome: "André",
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

const propsClientes1 = Object.keys(cliente.dependentes) //Object.keys - retorna todas as chaves que tem dentro do objeto
 console.log(propsClientes1)

// console.log(Object.values(cliente))

function oferecerSeguro(obj) {
  const propsClientes = Object.keys(obj);
  if(propsClientes.includes("dependentes")){
    console.log(`Oferta de seguro de vida para ${obj.nome}`)
  }
}

oferecerSeguro(cliente)