function maiorNumero() {
    var num1 = parseFloat(prompt("Insira o primeiro número: "));
    var num2 = parseFloat(prompt("Insira o segundo número: "));
    var num3 = parseFloat(prompt("Insira o terceiro número: "));

    if (num1 > num2 && num1> num3){
        alert(`O maior número é: ${num1}`)
    }

    else if (num2 > num1 && num2 > num3){
        alert(`O maior número é: ${num2}`)
    }

    else alert(`O maior número é: ${num3}`)

};