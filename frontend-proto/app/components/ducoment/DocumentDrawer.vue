<template>
  <v-navigation-drawer v-model="drawer" app>
    <DocumentTree :node="documentTree" :nested-id-list="nestedIdList" />
  </v-navigation-drawer>
</template>

<script>
import DocumentTree from './DocumentTree'
export default {
  components: {
    DocumentTree
  },
  props: {
    drawer: {
      type: Boolean,
      required: true
    },
    documentTree: {
      type: Object,
      required: true
    },
    nestedIdList: {
      type: Array,
      required: true
    }
  },
  methods: {
    openChildren(idList) {
      this.$emit('openChildren', idList)
    }
  }
}
</script>

<style></style>
