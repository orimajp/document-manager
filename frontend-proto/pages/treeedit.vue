<template>
  <div class="container">
    <div class="row">
      <div class="col-3">
        <tree :data="tree1data" draggable="draggable" cross-tree="cross-tree">
          <div slot-scope="{ data, store }">
            <template v-if="!data.isDragPlaceHolder">
              <b
                v-if="data.children &amp;&amp; data.children.length"
                @click="store.toggleOpen(data)"
              >
                {{ data.open ? '-' : '+' }}&nbsp;</b
              >
              <span>{{ data.text }}</span>
            </template>
          </div>
        </tree>
      </div>

      <!--
      <div class="col-3">
        <tree :data="tree2data" draggable="draggable" cross-tree="cross-tree">
          <div slot-scope="{ data, store }">
            <template v-if="!data.isDragPlaceHolder">
              <b
                v-if="data.children &amp;&amp; data.children.length"
                @click="store.toggleOpen(data)"
                >{{ data.open ? '-' : '+' }}&nbsp;</b
              >
              <span>{{ data.text }}</span>
            </template>
          </div>
        </tree>
      </div>
      -->
    </div>
  </div>
</template>

<script lang="ts">
// https://www.kabanoki.net/5179/
// https://github.com/phphe/vue-draggable-nested-tree
// https://www.npmjs.com/package/tree-helper
// https://github.com/phphe/tree-helper
import { breadthFirstSearch } from 'tree-helper'
export default {
  data() {
    return {
      tree1data: [
        { text: 'node 1' },
        { text: 'node 2' },
        { text: 'node 3 undraggable', draggable: false },
        { text: 'node 4 undroppable', droppable: false },
        {
          text: 'node 5',
          children: [{ text: 'node 6' }, { text: 'node 7' }]
        }
      ]
    }
  },
  methods: {
    expandAll(): void {
      breadthFirstSearch(this.tree1data, (node: { open: boolean }) => {
        node.open = true
      })
    },
    collapseAll(): void {
      breadthFirstSearch(this.tree1data, (node: { open: boolean }) => {
        node.open = false
      })
    }
  }
}
</script>

<style>
.he-tree {
  border: 1px solid #ccc;
  padding: 20px;
  width: 300px;
}
.tree-node-inner {
  padding: 5px;
  border: 1px solid #ccc;
  cursor: pointer;
}
.draggable-placeholder-inner {
  border: 1px dashed #0088f8;
  box-sizing: border-box;
  background: rgba(0, 136, 249, 0.09);
  color: #0088f9;
  text-align: center;
  padding: 0;
  display: flex;
  align-items: center;
}
.row .col-3 {
  float: left;
}
</style>
