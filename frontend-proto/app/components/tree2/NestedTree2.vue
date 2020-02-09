<template>
  <div>
    <h2 @click="openChildren(addIdArray)">
      {{ open }} {{ node.contents.label }}
    </h2>
    <div v-if="node.expand">
      <NestedTree2
        v-for="(child, index) in node.nodes"
        :key="index"
        :id-array="addIdArray"
        :node="child"
        class="indent"
        @openChildren="openChildren"
      />
    </div>
  </div>
</template>

<script>
import NestedTree2 from './NestedTree2'
export default {
  name: 'NestedTree2',
  components: {
    NestedTree2
  },
  props: {
    node: {
      type: Object,
      required: true
    },
    idArray: {
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
    addIdArray() {
      return this.idArray.concat(this.node.id)
    }
  },
  methods: {
    openChildren(list) {
      console.log('openChildren() called.')
      this.$emit('openChildren', list)
    }
  }
}
</script>

<style scoped>
.indent {
  margin-left: 50px;
}
</style>
