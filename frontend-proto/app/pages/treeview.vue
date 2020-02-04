<template>
  <div>
    <TreeSidebar class="sidebar-area" />
    <div class="scaffold-wrapper">
      <Page />
    </div>
  </div>
</template>

<script>
import TreeSidebar from '../components/tree/TreeSidebar'
import Page from '../components/Page'
export default {
  components: { TreeSidebar, Page }
}
</script>

<style scoped>
.sidebar-area {
  /* 左側に固定 */
  float: left;
}
.scaffold-wrapper {
  /* display: flex; 要素を横並びにする */
  flex-direction: column; /* 要素の並び順の主軸を指定 上 => 下 */
  min-height: 100vh; /* 要素の高さの最小値を指定 vhはviewport(表示領域) heightの略 */

  /* サイドバーのwidth分だけ範囲を削除 */
  width: calc(100% - 200px);

  /* サイドバーで隠れるので右に寄せる */
  margin: 0 0 0 180px;
}
</style>
