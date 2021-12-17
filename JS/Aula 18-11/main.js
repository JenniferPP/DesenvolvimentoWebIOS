const items = document.querySelectAll (".item");
const listaItem = document.querySelectAll ("#items");
const preco = document.querySelectorAll (".preco");
const span = document.querySelectAll ("span");


function promocaoDoDia(){
    var diaDePromocao = new Date().getDay();
        var desconto = 0.20;

    var tagP = document.createElement('p');
    tagP.innerHTML = 'Promoção do dia';

    if (diaDePromocao == 1){
        calculo(preco * desconto)
        items[0].appendChild(tagP)
        return
    }
    else if (diaDePromocao == 2){
        calculo(preco, 0, desconto)
        items[1].appendChild(tagP)
        return
    }
    else if(diaDePromocao == 3){
        calculo(preco, 0, desconto)
        items[2].appendChild(tagP)
        return
    }
    else if(diaDePromocao == 4){
        calculo(preco, 0, desconto)
        items[3].appendChild(tagP)
        return
    }
    else if(diaDePromocao == 5){
        calculo(preco, 0, desconto)
        items[4].appendChild(tagP)
        return
    }
}

let calculo = (list, ind, porcentagem) => {
    let preco = parseInt(list[ind].innerText, 10)
   let precoDoDesconto = preco - preco * porcentagem

    list[ind].innerText = precoDoDesconto
}
