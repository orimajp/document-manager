<template>
  <div>
    <h2 @click="showChildren = !showChildren">
      {{ open }} {{ node.contents.label }}
    </h2>

    <div v-if="showChildren">
      <NestedTree
        :key="index"
        v-for="(child, index) in node.nodes"
        :node="child"
        :style="indent"
        :depth="depth + 1"
      ></NestedTree>
    </div>
  </div>
</template>

<script>
// https://qiita.com/superyusuke/items/ef23435c93be3c23a5a7
import NestedTree from '~/components/tree/NestedTree'
export default {
  name: 'NestedTree',
  components: { NestedTree },
  //  props: ['node', 'depth'],
  props: {
    // eslint-disable-next-line vue/require-default-prop
    node: Object,
    // eslint-disable-next-line vue/require-default-prop
    depth: Number
  },
  data: () => ({
    showChildren: false
  }),
  computed: {
    indent() {
      // return { transform: `translate(${this.depth * 50}px)` }
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
    }
  }
}
</script>

<style></style>
