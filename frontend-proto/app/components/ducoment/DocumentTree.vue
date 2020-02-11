<template>
  <div>
    <h2 @click="openChildren(addIdList)">
      {{ open }} {{ node.contents.label }}
    </h2>
    <div v-if="node.expand">
      <DocumentTree
        v-for="(child, index) in node.nodes"
        :key="index"
        :nested-id-list="addIdList"
        :node="child"
        class="indent"
        @openChildren="openChildren"
      />
    </div>
  </div>
</template>

<script>
import DocumentTree from './DocumentTree'
export default {
  name: 'DocumentTree',
  components: {
    DocumentTree
  },
  props: {
    node: {
      type: Object,
      required: true
    },
    nestedIdList: {
      type: Array,
      required: true
    }
  },
  computed: {
    open() {
      if (!this.node.nodes) {
        return ''
      }
      if (this.node.nodes && !this.node.expand) {
        return '+'
      }
      return '-'
    },
    addIdList() {
      return this.nestedIdList.concat(this.node.id)
    }
  },
  methods: {
    openChildren(idList) {
      this.$emit('openChildren', idList)
    }
  }
}
</script>

<style scoped>
.indent {
  margin-left: 50px;
}
</style>
