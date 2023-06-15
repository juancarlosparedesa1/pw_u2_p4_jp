const ponerUno = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("1");
    digitarPantalla(contenido);
}

const ponerDos = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("2");
    digitarPantalla(contenido);
}

const ponerTres = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("3");
    digitarPantalla(contenido);
}

const ponerCuatro = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("4");
    digitarPantalla(contenido);
}

const ponerCinco = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("5");
    digitarPantalla(contenido);
}

const ponerSeis = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("6");
    digitarPantalla(contenido);
}

const ponerSiete = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("7");
    digitarPantalla(contenido);
}

const ponerOcho = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("8");
    digitarPantalla(contenido);
}

const ponerNueve = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("9");
    digitarPantalla(contenido);
}

const ponerCero = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("0");
    digitarPantalla(contenido);
}

const ponerSuma = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("+");
    digitarPantalla(contenido);
}

const ponerResta = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("-");
    digitarPantalla(contenido);
}

const ponerMulti = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("*");
    digitarPantalla(contenido);
}

const ponerDiv = ()=>{
    let contenido = document.getElementById('idpantalla').textContent.concat("/");
    digitarPantalla(contenido);
}

const borrar = ()=>{
    digitarPantalla("")
}

const resolver = ()=>{
    let contenido = document.getElementById('idpantalla').textContent;
    console.log(contenido);
    let res = eval(contenido);
    digitarPantalla(res);
}

const digitarPantalla = (contenido) =>{
    document.getElementById('idpantalla').innerHTML=contenido;
}