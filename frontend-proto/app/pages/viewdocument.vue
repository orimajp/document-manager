<template>
  <div>
    <document-drawer
      :drawer="drawer"
      :document-tree="documentTree"
      :nested-id-list="nestedIdList"
    />
    <document-nav-bar :title="title" @toggle-drawer="toggleDrawer" />
    <v-content>
      <v-container class="fill-height" fluid>
        <document-page :document-data="documentData" />
      </v-container>
    </v-content>
    <v-footer color="primary" dark app>
      Document Manager
    </v-footer>
  </div>
</template>

<script>
import DocumentNavBar from '../components/ducoment/DocumentNavbar'
import DocumentDrawer from '../components/ducoment/DocumentDrawer'
import DocumentPage from '../components/ducoment/DocumentPage'
export default {
  components: {
    DocumentDrawer,
    DocumentNavBar,
    DocumentPage
  },
  data: () => ({
    title: '',
    drawer: true,
    documentData: '',
    documentTree: {},
    nestedIdList: []
  }),
  methods: {
    setTitle(title) {
      this.title = title
    },
    toggleDrawer() {
      this.drawer = !this.drawer
    },
    selectPage(id) {
      console.log(id)
    },
    openChildren(idList) {
      this.documentTree.expand = false
      this.selectPage(idList[idList.length - 1])
      this.openNode(this.documentTree, idList)
    },
    openNode(node, idList) {
      if (!node.nodes) {
        return
      }
      node.expand = !!idList.includes(node.id)
      if (!node.expand) {
        return
      }
      for (let i = 0; i < node.nodes.length; i++) {
        this.openNode(node.nodes[i], idList)
      }
    }
  },
  template: 'document2'
}
</script>

<style scoped>
.container-box {
  margin-top: 63px;
}
</style>
