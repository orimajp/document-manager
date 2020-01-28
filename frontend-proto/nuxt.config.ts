// https://ja.nuxtjs.org
// https://typescript.nuxtjs.org/ja/
// https://github.com/vuejs/composition-api
// https://qiita.com/Aruneko/items/552fcd3ae5da4eb1b218

// Vuetify
// https://qiita.com/reireias/items/3688ff593185a79d521b
// https://github.com/nuxt-community/vuetify-module

// nuxtjs/markdownit
// https://blog.nakamu.life/posts/vue-markdown-nuxtjs-markdownit

import { Configuration } from '@nuxt/types'
import colors from 'vuetify/es5/util/colors'
import { NuxtAxiosInstance } from '@nuxtjs/axios'

// export default {
const nuxtConfig: Configuration = {
  mode: 'spa',
  /*
   ** Headers of the page
   */
  head: {
    title: process.env.npm_package_name || '',
    meta: [
      { charset: 'utf-8' },
      { name: 'viewport', content: 'width=device-width, initial-scale=1' },
      {
        hid: 'description',
        name: 'description',
        content: process.env.npm_package_description || ''
      }
    ],
    link: [{ rel: 'icon', type: 'image/x-icon', href: '/favicon.ico' }]
  },
  /*
   ** Customize the progress-bar color
   */
  loading: { color: '#fff' },
  /*
   ** Global CSS
   */
  css: [],
  /*
   ** Plugins to load before mounting the App
   */
  plugins: ['@/plugins/composition-api'],
  /*
   ** Nuxt.js dev-modules
   */
  buildModules: [
    // Doc: https://github.com/nuxt-community/eslint-module
    '@nuxtjs/eslint-module',
    '@nuxtjs/proxy',
    '@nuxtjs/vuetify',
    '@nuxt/typescript-build'
  ],
  proxy: {
    '/v1': 'http://localhost:8080'
  },
  vuetify: {
    /* module options */
  },
  /*
   ** Nuxt.js modules
   */
  modules: [
    // Doc: https://axios.nuxtjs.org/usage
    '@nuxtjs/axios',
    '@nuxtjs/markdownit'
  ],
  markdownit: {
    injected: true
  },
  /*
   ** Axios module configuration
   ** See https://axios.nuxtjs.org/options
   */
  axios: {},
  /*
   ** Build configuration
   */
  build: {
    /*
     ** You can extend webpack config here
     */
    extend(config, ctx) {}
  }
}

declare module 'vue/types/vue' {
  interface Vue {
    $axios: NuxtAxiosInstance
  }
}

module.exports = nuxtConfig
