<template>
  <v-treeview activatable open-on-click :items="items" />
</template>

<script>
export default {
  props: {
    items: {
      type: String,
      required: true
    }
  }
}
</script>

<style></style>
