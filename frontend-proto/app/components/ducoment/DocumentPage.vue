<template>
  <div>
    <h1>コンテンツ</h1>
    <div class="markdown-body">
      <div v-if="documentData !== ''">
        <div v-html="$md.render(documentData)" />
      </div>
      <div v-else>
        <div class="no-data">
          ページデータ無し。
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    documentData: {
      type: String,
      required: true,
      default: ''
    }
  }
}
</script>

<style scoped>
.markdown-body {
  border: solid 1px lightgrey;
  padding: 32px;
}
.no-data {
  text-align: center;
}
</style>
