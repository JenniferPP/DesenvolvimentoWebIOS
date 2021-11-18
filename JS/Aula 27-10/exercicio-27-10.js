function calculoImc(){
    var nome = String(prompt("Insira seu nome"));
    var peso =Number(prompt("Insira seu peso"));
    var altura =Number(prompt("Insira sua altura"));
    var imc

    imc = (peso/altura*altura);


    alert(`${nome} possui altura ${altura} e peso ${peso}, então seu IMC é ${imc}`);
}