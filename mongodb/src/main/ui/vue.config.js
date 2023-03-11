const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  
  devServer: {
    proxy: {
      '^/api': {
        target: 'http://localhost:8080/',
        changeOrigin: true, 
        port: 3000
      },
    }
    // port: 3000,
    // proxy: 'http://localhost:8080/',

  },
  pluginOptions: {
    vuetify: {
			// https://github.com/vuetifyjs/vuetify-loader/tree/next/packages/vuetify-loader
		}
  },
})