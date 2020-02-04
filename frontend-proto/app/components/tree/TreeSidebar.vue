<template>
  <NestedTree :node="tree" :depth="1" />
</template>

<script>
import NestedTree from './NestedTree'

export default {
  components: {
    NestedTree
  },
  data: () => ({
    tree: {
      contents: { label: '1' },
      nodes: [
        {
          contents: { label: '2.1' },
          nodes: [
            {
              contents: { label: '3.1' },
              nodes: [
                { contents: { label: '4.1' } },
                { contents: { label: '4.2' } }
              ]
            },
            { contents: { label: '3.2' } }
          ]
        },
        {
          contents: { label: '2.2' }
        }
      ]
    }
  })
}
</script>

<style></style>
