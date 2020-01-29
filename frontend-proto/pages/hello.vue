<template>
  <div class="container">
    <div class="markdown-body">
      <div v-html="$md.render(model)" />
    </div>
  </div>
</template>

<script>
export default {
  async asyncData(ctx) {
    const data = await ctx.app.$axios.get(
      'http://localhost:8080/v1/view/documents/a/pages/a'
    )

    // https://moznion.hatenadiary.com/entry/2014/10/28/233416
    const cr = '0A'
    const crCode = String.fromCharCode(parseInt(cr, 16))
    // console.log(data.data.pageData.replace(/\\n/g, crCode))
    const tmp = data.data.pageData.replace(/\\n/g, crCode)
    return {
      //      model: data.data.pageData
      model: tmp
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
