<template>
  <div class="container">
    <div>{{ pageTitle }}</div>
    <div>{{ createDateTime }}</div>
    <div>{{ createUserName }}</div>
    <div class="markdown-body">
      <div v-html="$md.render(pageData)" />
    </div>
  </div>
</template>

<script lang="ts">
import { Context } from '@nuxt/types'

interface PageDataResponse {
  pageKey: string
  pageTitle: string
  pageData: string
  documentKey: string
  createDateTime: Date
  createUserName: string
  updateDateTime: Date
  updateUserName: string
  revision: number
  version: number
}

export default {
  async asyncData(ctx: Context) {
    const data = await ctx.app.$axios.get(
      'http://localhost:8080/v1/view/documents/a/pages/a'
    )

    // https://moznion.hatenadiary.com/entry/2014/10/28/233416
    const cr = '0A'
    const crCode = String.fromCharCode(parseInt(cr, 16))

    const res = data.data as PageDataResponse
    console.log(res)

    const pageData = res.pageData.replace(/\\n/g, crCode)

    return {
      pageData,
      pageTitle: res.pageTitle,
      createDateTime: res.createDateTime,
      createUserName: res.createUserName
    }
  }
  /*
  data() {
  return {
    model: '# Hello World!'
  }
  }
  */
}
</script>

<style scoped>
.markdown-body {
  border: solid 1px lightgrey;
  padding: 32px;
}
</style>
