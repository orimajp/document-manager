<template>
  <div>
    <!--
    <h2 @click="showChildren = !showChildren">
      {{ open }} {{ node.contents.label }}
    </h2>
    -->
    <h2 @click="openChildren">{{ open }} {{ node.contents.label }}</h2>

    <div v-if="showChildren" ref="parent">
      <NestedTree
        v-for="(child, index) in node.nodes"
        ref="tree"
        :key="index"
        :node="child"
        :style="indent"
        :depth="depth + 1"
        :ignore-list="getIgnoreList"
        @closeOtherChildren="closeChildren"
      />
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
    node: {
      type: Object,
      required: true
    },
    depth: {
      type: Number,
      required: true
    },
    ignoreList: {
      type: Array,
      required: true
    }
  },
  data: () => ({
    showChildren: false,
    list: []
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
    },

    getIgnoreList() {
      console.log(this.ignoreList)
      const addedList = this.ignoreList.concat(this.node.index)
      console.log(addedList)
      return addedList
    }
  },
  /*
  mounted() {
    console.log(this.ignoreList)
    this.list = this.ignoreList.concat(this.node.index)
  },
  */
  methods: {
    openChildren() {
      console.log('openChildren() called.')
      console.log(this.ignoreList)
      //      this.$emit('closeOtherChildren', this.node.index)
      // this.$emit('closeOtherChildren', this.ignoreList.push(this.node.index))
      this.showChildren = true
    },
    /*
    closeChildren(ignoreIndex) {
      console.log('closeChildren() called. ignoreIndex=' + ignoreIndex)
      if (this.node.index === ignoreIndex) {
        return
      }
      this.showChildren = false
    }
    */
    closeChildren(ignoreLists) {
      console.log('closeChildren() called.')
      console.log(ignoreLists)
      /*
      if (ignoreLists.contain(this.node.index)) {
        return
      }
       */
      // this.showChildren = false
    }
  }
}
</script>

<style></style>
