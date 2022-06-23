function soma(num1 , num2) {
    return num1 + num2;
}

console.log(soma(25 , 34));

// parametros x argumentos, podemos usar os dois termos.

function nomeIdade(nome, idade) {
    return `O meu nome é ${nome} e minha idade é ${idade}`;
}

console.log(nomeIdade("Julio", 52));

function multiplica(numero1 , numero2) {
    return numero1 * numero2;
}

console.log(multiplica(12,40));

console.log(multiplica(soma(2,2) , 4))

console.log(nomeIdade("Juliao" , multiplica(2,2)));