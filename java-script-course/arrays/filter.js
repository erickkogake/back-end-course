const names = ['marcos', 'debora', 'maria', 'marcela']
const notas = [7,2,4,6]

const reprovados = names.filter((_, indice) => notas[indice] < 5) 
console.log(`Os alunos reprovados são eles: ${reprovados}`);

const mulheres = ['mu', 'bu', 'lo', 'bru']
const homens = ['ga', 'ma', 'morte', 'ze']

const juntando = mulheres.concat(homens)
const juntandoMais = juntando.concat(mulheres).concat(homens)

console.log(`${juntando}`)
console.log(`${juntandoMais}`)