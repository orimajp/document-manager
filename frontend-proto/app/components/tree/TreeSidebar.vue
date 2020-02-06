<template>
  <NestedTree :node="tree" :depth="1" :ignore-list="ignoreList" />
</template>

<script>
import NestedTree from './NestedTree'

export default {
  components: {
    NestedTree
  },
  data: () => ({
    ignoreList: [],
    tree: {
      contents: { label: '1' },
      index: 1,
      nodes: [
        {
          contents: { label: '2.1' },
          index: 2,
          nodes: [
            {
              contents: { label: '3.1' },
              index: 3,
              nodes: [
                { contents: { label: '4.1' }, index: 4 },
                { contents: { label: '4.2' }, index: 5 }
              ]
            },
            {
              contents: { label: '3.2' },
              index: 6,
              nodes: [
                { contents: { label: '4.1' }, index: 7 },
                { contents: { label: '4.2' }, index: 8 }
              ]
            }
          ]
        },
        {
          contents: { label: '2.2' },
          index: 9,
          nodes: [
            {
              contents: { label: '3.1' },
              index: 10,
              nodes: [
                { contents: { label: '4.1' }, index: 11 },
                { contents: { label: '4.2' }, index: 12 }
              ]
            },
            {
              contents: { label: '3.2' },
              index: 13,
              nodes: [
                { contents: { label: '4.1' }, index: 14 },
                { contents: { label: '4.2' }, index: 15 }
              ]
            }
          ]
        }
      ]
    }
  }),
  methods: {
    closeChildren(ignoreIndex) {
      // eslint-disable-next-line no-console
      console.log('top layer: ignoreIndex=' + ignoreIndex)
    }
  }
}
</script>

<style></style>
