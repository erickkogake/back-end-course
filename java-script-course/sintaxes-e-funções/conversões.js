// tipo de dado
// booleanos 

// conversão implícita (Number / String)
const numero = 456;
const numeroString = "456";

console.log(numero === numeroString);
console.log(String(numero) + Number(numeroString));

// conversão explícita

let telefone = 165443214;
console.log("O número de telefone é " + telefone);
console.log("O número de telefone é " + String(telefone));
console.log("O número de telefone é " + telefone.toString()); //também temos essa outra opção de conversão, parecida com outras linguagens.

let usuarioConectado = false;
console.log(String(usuarioConectado)); // teremos a conversão da booleana para string, nesse caso teremos uma string “false”.
usuarioConectado = true;
console.log(String(usuarioConectado)); // agora teremos uma string “true”.
