<template>
  <NestedTree2
    :node="tree"
    :index-array="indexArray"
    @openChildren="openChildren"
  />
</template>

<script>
import NestedTree2 from './NestedTree2'

export default {
  components: {
    NestedTree2
  },
  data: () => ({
    indexArray: [],
    tree: {
      contents: { label: '1' },
      expand: false,
      index: 1,
      nodes: [
        {
          contents: { label: '2.1' },
          expand: false,
          index: 2,
          nodes: [
            {
              contents: { label: '3.1' },
              expand: false,
              index: 3,
              nodes: [
                { contents: { label: '4.1' }, expand: false, index: 4 },
                { contents: { label: '4.2' }, expand: false, index: 5 }
              ]
            },
            {
              contents: { label: '3.2' },
              expand: false,
              index: 6,
              nodes: [
                { contents: { label: '4.1' }, expand: false, index: 7 },
                { contents: { label: '4.2' }, expand: false, index: 8 }
              ]
            }
          ]
        },
        {
          contents: { label: '2.2' },
          expand: false,
          index: 9,
          nodes: [
            {
              contents: { label: '3.1' },
              expand: false,
              index: 10,
              nodes: [
                { contents: { label: '4.1' }, expand: false, index: 11 },
                { contents: { label: '4.2' }, expand: false, index: 12 }
              ]
            },
            {
              contents: { label: '3.2' },
              expand: false,
              index: 13,
              nodes: [
                { contents: { label: '4.1' }, expand: false, index: 14 },
                { contents: { label: '4.2' }, expand: false, index: 15 }
              ]
            }
          ]
        }
      ]
    }
  }),
  methods: {
    openChildren(list) {
      console.log('TreeSidebar2#openChildren() called.')
      console.log(list)
      this.tree.expand = false
      this.openNode(this.tree, list)
    },
    openNode(node, list) {
      console.log('openNode called.')
      node.expand = !!list.includes(node.index)
      if (!node.expand) {
        return
      }
      if (!node.nodes) {
        return
      }
      for (let i = 0; i < node.nodes.length; i++) {
        this.openNode(node.nodes[i], list)
      }
    }
  }
}
</script>
