const { createApp } = Vue

createApp({
    data() {
        return {
            companyName: "Hello",
            companyEmail: "Hello@gmail.com",
            password: "Hello1234",
            access: ""
        }
    },
    methods: {
            submitHandler() {
                console.log(this.companyName, this.companyEmail, this.password, this.access)
            }
    }
}).mount('#app')