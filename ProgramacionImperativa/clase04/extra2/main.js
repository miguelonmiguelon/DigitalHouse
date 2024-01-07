const prompt = require("prompt-sync")({ sigint: true });
let nombre = prompt("¿Cómo te llamas? " )
let institucion = prompt("¿En dónde estudias? ")
let religion = prompt("¿Qué religión profesas? ")
console.log(`${nombre} es estudiante de ${institucion} \ny es de religión ${religion}`);