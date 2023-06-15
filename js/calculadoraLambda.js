const sumar = (num1, num2) => num1 + num2;


const sumarNumeros = () => {
    var numero1 = convertir('idNum1');
    var numero2 = convertir('idNum2');
    document.getElementById('labelResultado').innerHTML = 'Resultado: ' + sumar(numero1, numero2);

}

const restar = (num1, num2) => num1 - num2;

const restarNumeros = () => {
    var numero1 = convertir('idNum1');
    var numero2 = convertir('idNum2');
    document.getElementById('labelResultado').innerHTML = 'Resultado: ' + restar(numero1, numero2);

}

const multiplicar = (num1, num2) => num1 * num2;

const multiplicarNumeros = () => {
    var numero1 = convertir('idNum1');
    var numero2 = convertir('idNum2');
    document.getElementById('labelResultado').innerHTML = 'Resultado: ' + multiplicar(numero1, numero2);

}

const dividir = (num1, num2) => num1 / num2;


const dividirNumeros = () => {
    var numero1 = convertir('idNum1');
    var numero2 = convertir('idNum2');
    document.getElementById('labelResultado').innerHTML = 'Resultado: ' + dividir(numero1, numero2);

}

const convertir = (idCampo) => {
    console.log('Convertir' + idCampo)
    return parseInt(document.getElementById(idCampo).value);
}

const eliminarElemento = () => {
    document.getElementById('ideliminar').remove();
    console.log(document.getElementById('ideliminar'))
    console.log('Test')
}

const insertarElemento = () => {
    document.getElementById('elemento').innerHTML = "<strong>Importante</strong>";
}

const conceptosJS = () => {

    //Declaracion de variables
    //var (ya no es comunmente utilizada)
    //let 
    //const

    var variable1 = 'Kevin';
    var variable2 = 1;

    let variable3 = 'Kevin';
    let variable4 = 8;

    const variable5 = 'Kevin';
    const variable6 = 8;

    console.log(variable1);

    //Declaracion de Arreglos
    const diasSemana = ['Lunes', 'Martes', 'Miercoles'];
    console.log(diasSemana);
    console.log(diasSemana[0]);
    diasSemana.push('Jueves');
    diasSemana.push('Viernes');
    console.log(diasSemana);

    const diasFinSemana = ['Sabado', 'Domingo'];
    console.log(diasSemana.concat(diasFinSemana));
    console.log(diasSemana);

    const diasCompleto = diasSemana.concat(diasFinSemana);
    console.log(diasCompleto);

    for (const dia of diasCompleto) {
        console.log(dia);
    }

    //Declaración de Objetos
    const persona = {
        nombre: "Kevin",
        apellido: "Chiguano",
        edad: 33,
        ciudad: "Quito"
    }

    console.log(persona);

    const persona2 = {
        nombre: "Paul",
        apellido: "Correa",
        edad: 20,
        ciudad: "Quito",
        vehiculo:{
            marca: "Mazda",
            modelo: "BT-50",
            anio: "1998"
        }
    }

    console.log(persona2);

    /*const nombres = ["Kevin","Paul","Ana"];
    console.log(nombres);
    nombres[0] = "Fernando";
    console.log(nombres);

    nombres = ["Ellon","Sucaritas"];
    console.log(nombres);

    const nombre = "Cesar" ;
    console.log(nombre);
    nombre = "Veronica";
    console.log(nombre);*/

    //Desestructuración de Arreglos
    const dias2=['Lunes','Martes','Miercoles','Jueves','Viernes'];
    const [dia1,dia2,dia3,dia4]=dias2;
    console.log(dia2);
    console.log(dia4);

    //Descomposicion de un arreglo en una linea
    const [d1,d2,d3,d4,d5]=['Lunes','Martes','Miercoles','Jueves','Viernes'];
    console.log(d1);
    console.log(d3);
    console.log(d5);

    //Desestructuración de Objetos

    const persona3 = {
        nombre: "Kevin",
        apellido: "Chiguano",
        edad: 33,
        ciudad: "Quito"
    }

    const {nombre,ciudad} = persona3;
    console.log(nombre);
    console.log(ciudad);

    const persona4 = {
        nombre: "Paul",
        apellido: "Correa",
        edad: 20,
        ciudad: "Quito",
        vehiculo:{
            marca: "Mazda",
            modelo: "BT-50",
            anio: "1998"
        }
    }

    console.log(persona4.nombre);
    console.log(persona4.apellido);


    const {vehiculo} = persona4;
    console.log(vehiculo);

    const {marca,anio} = vehiculo;
    console.log(marca);
    console.log(anio);

}