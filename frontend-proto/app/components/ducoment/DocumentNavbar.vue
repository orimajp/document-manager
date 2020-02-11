<template>
  <v-app-bar color="primary" dark app fixed>
    <v-app-bar-nav-icon @click="toggleDrawer" />
    <v-toolbar-title>{{ title }}</v-toolbar-title>
  </v-app-bar>
</template>

<script>
export default {
  props: {
    title: {
      type: String,
      required: true
    }
  },
  methods: {
    toggleDrawer() {
      this.$emit('toggleDrawer')
    }
  }
}
</script>
