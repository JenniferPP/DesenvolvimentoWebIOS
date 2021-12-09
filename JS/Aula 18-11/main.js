const items = document.querySelectAll (".item");
const listaItem = document.querySelectAll (".items");
const preco = document.querySelectorAll (".preco");
const span = document.querySelectAll ("span");


function promocaoDoDia(){
    var diaDePromocao = new Date().getDay();
    var desconto = 0.2

    var tagP = document.createElement('p');
        tagP.innerHTML = 'Promoção do dia';

        if (diaDePromocao == 0){
            calculo(preco, 0, desconto)
            items[0].appendChild(tagP)
            return
        }

        else if (diaDePromocao == 1){
            calculo(preco, 1, desconto)
            items[1].appendChild(tagP)
            return
        }
        else if(diaDePromocao == 2){
            calculo(preco, 2, desconto)
            items[2].appendChild(tagP)
            return
        }
        else if(diaDePromocao == 3){
            calculo(preco, 3, desconto)
            items[3].appendChild(tagP)
            return
        }
        else if(diaDePromocao == 4){
            calculo(preco, 4, desconto)
            items[4].appendChild(tagP)
            return
        }

        
}
