<template>
  <NestedTree2 :node="tree" :id-array="idArray" @openChildren="openChildren" />
</template>

<script>
import NestedTree2 from './NestedTree2'

export default {
  components: {
    NestedTree2
  },
  data: () => ({
    idArray: [],
    tree: {
      contents: { label: '1' },
      expand: false,
      id: 1,
      nodes: [
        {
          contents: { label: '2.1' },
          expand: false,
          id: 2,
          nodes: [
            {
              contents: { label: '3.1' },
              expand: false,
              id: 3,
              nodes: [
                { contents: { label: '4.1' }, expand: false, id: 4 },
                { contents: { label: '4.2' }, expand: false, id: 5 }
              ]
            },
            {
              contents: { label: '3.2' },
              expand: false,
              id: 6,
              nodes: [
                { contents: { label: '4.1' }, expand: false, id: 7 },
                { contents: { label: '4.2' }, expand: false, id: 8 }
              ]
            }
          ]
        },
        {
          contents: { label: '2.2' },
          expand: false,
          id: 9,
          nodes: [
            {
              contents: { label: '3.1' },
              expand: false,
              id: 10,
              nodes: [
                { contents: { label: '4.1' }, expand: false, id: 11 },
                { contents: { label: '4.2' }, expand: false, id: 12 }
              ]
            },
            {
              contents: { label: '3.2' },
              expand: false,
              id: 13,
              nodes: [
                { contents: { label: '4.1' }, expand: false, id: 14 },
                { contents: { label: '4.2' }, expand: false, id: 15 }
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
      console.log('select id=' + list[list.length - 1])
      this.tree.expand = false
      this.openNode(this.tree, list)
    },
    openNode(node, list) {
      console.log('openNode called. id=' + node.id)
      if (!node.nodes) {
        return
      }
      node.expand = !!list.includes(node.id)
      if (!node.expand) {
        return
      }
      for (let i = 0; i < node.nodes.length; i++) {
        this.openNode(node.nodes[i], list)
      }
    }
  }
}
</script>
