console.log('Componenete Vue')
console.log(Vue)

const app=Vue.createApp({
template:`
<h1>hola mundo</h1>
<p>Desde Vue.JS</p>`
})

app.mount('#myApp')