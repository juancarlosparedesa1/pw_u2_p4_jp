console.log('Componenete Vue')
console.log(Vue)

const app = Vue.createApp({
    //template:`
    //<h1>hola mundo</h1>
    //<p>Desde Vue.JS</p>
    //<p>{{1+1}}</p>`
    data() {
        return {
            nombre:'Juan Carlos',
            apellido:'Paredes',
            mensaje:'Hola mundo 2 desde Vue.JS'

        }
    },
    methods:{
        cambiarNombre(){
            console.log('boton cambiar nombre')
            this.nombre='Jean Carl'

        },
        cambiarApellido(){
            console.log('boton cambiar apellido')
            this.apellido='Angulo'
        }


    }

    

})

app.mount('#myApp')