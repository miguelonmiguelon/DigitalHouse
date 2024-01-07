const prompt = require("prompt-sync")({ sigint: true });
let cajon1 = "cajón 1"
let cajon2 = "cajón 2"
let prenda1 = prompt("Dame el nombre de las primeras prendas ")
let prenda2 = prompt("Dame el nombre de las segundas prendas ")
function guardar(){
    if(prenda1=="Pantalones" && prenda2=="Remeras"){
        console.log("El orden está desordenado ");
    } else{
        console.log(`El orden es correcto, ${prenda1} van en el ${cajon1} \n y los ${prenda2} van en el ${cajon2}`);
    }
}
console.log(guardar());
