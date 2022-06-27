const armadura = {
  peitoral: 'aço',
  bota: 'inox',
  luva: 'diamante',
  capacete: 'prata'
} 
const locomoção = {
  veiculo1: 'cavalo',
  veiculo2: 'andar',
}

// const guerreiro = {armadura, veiculo}
// console.log(guerreiro)

const guerreiro = {...armadura, ...locomoção}
console.log(guerreiro)