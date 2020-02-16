<template>
  <div>
    <doc-drawer />
    <doc-nav-bar />
    <doc-page />
  </div>
</template>

<script>
import DocDrawer from '~/components/doctest/DocDrawer'
import DocNavBar from '~/components/doctest/DocNavBar'
import DocPage from '~/components/doctest/DocPage'

export default {
  layout: 'document2',
  components: {
    DocDrawer,
    DocNavBar,
    DocPage
  }
}
</script>

<style></style>
