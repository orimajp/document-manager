<template>
  <div>
    <h2 @click="openChildren(addCurrentList)">
      {{ open }} {{ node.contents.label }}
    </h2>
    <div v-if="node.expand">
      <NestedTree2
        v-for="(child, index) in node.nodes"
        :key="index"
        :style="indent"
        :index-array="addCurrentList"
        :node="child"
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
    indexArray: {
      type: Array,
      required: true
    }
  },
  computed: {
    indent() {
      return { transform: 'translate(50px)' }
    },
    open() {
      if (!this.node.nodes) {
        return ''
      }
      if (this.node.nodes && !this.showChildren) {
        return '+'
      }
      return '-'
    },
    addCurrentList() {
      return this.indexArray.concat(this.node.index)
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
