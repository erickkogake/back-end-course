const alunos = ['Joao' , 'Juliana' ,  'Caio' , 'Ana']

const mediasDosAlunos = [10,7,9,6]

let listaDeNotasEAlunos = [alunos , mediasDosAlunos]

//includes -> booleano
//indexOf -> get the index number

const exibeNomeNota = (nomeAluno) => {
  if(listaDeNotasEAlunos[0].includes(nomeAluno)) {
    let indice = listaDeNotasEAlunos[0].indexOf(nomeAluno)
    return listaDeNotasEAlunos[0][indice] + ', sua média é ' + listaDeNotasEAlunos[1][indice]
  } else {
    return "Aluno não cadastrado"
  }
}

console.log(exibeNomeNota('Caio'));

const restaurantes = ['Cebolinha', 'Macaxeira', 'CocoBambu', 'Marmita']
const numeroEnd = [211,300,400,500]

const listaRestaurantes = [restaurantes, numeroEnd]

const exibição = (nomeRestaurante) => {
  if(listaRestaurantes[0].includes(nomeRestaurante)) {
    let indice = listaRestaurantes[0].indexOf(nomeRestaurante)
    return `O ${listaRestaurantes[0][indice]}, se localiza no número ${listaRestaurantes[1][indice]}`
  } else {
    return 'Restaurante não cadastrado'
  }
}

console.log(exibição('Macaxeira'));
console.log(exibição('Cebolinha'))
