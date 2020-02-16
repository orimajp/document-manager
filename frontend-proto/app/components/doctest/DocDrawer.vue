<template>
  <v-navigation-drawer clipped permanent app color="secondary">
    <div class="link-area">
      <div class="document-top-link">
        ドキュメントトップ
      </div>
      <ul class="doc-layer">
        <li class="doc-list">
          <v-icon class="collapse-icon" />
          <span class="doc-title">これはてすと</span>
        </li>
        <li class="doc-list">
          <v-icon class="collapse-icon">
            mdi-chevron-right
          </v-icon>
          <span class="doc-title">これはてすと</span>
        </li>
        <li class="doc-list">
          <v-icon class="collapse-icon">
            mdi-chevron-down
          </v-icon>
          <span class="doc-title">これはてすと</span>
        </li>
        <li class="collapse-list">
          <ul class="doc-layer">
            <li class="doc-list">
              <v-icon class="collapse-icon" />
              <span class="doc-title">これはてすと</span>
            </li>
            <li class="doc-list">
              <v-icon class="collapse-icon">
                mdi-chevron-right
              </v-icon>
              <span class="doc-title">階層テスト</span>
            </li>
            <li class="doc-list">
              <v-icon class="collapse-icon">
                mdi-chevron-down
              </v-icon>
              <span class="doc-title">階層テスト</span>
            </li>
            <li class="collapse-list">
              <ul class="doc-layer">
                <li class="doc-list">
                  <v-icon class="collapse-icon" />
                  <span class="doc-title">これはてすと</span>
                </li>
                <li class="doc-list selected">
                  <v-icon class="collapse-icon" />
                  <span class="doc-title">これはてすと</span>
                </li>
                <li class="doc-list">
                  <v-icon class="collapse-icon" />
                  <span class="doc-title">これはてすと</span>
                </li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </v-navigation-drawer>
</template>

<style scoped>
.document-top-link {
  padding: 0 0 0 10px;
  margin-bottom: 5px;
}
.document-top-link:hover {
  background-color: lightgrey;
}
.link-area {
  padding: 10px 0 10px 0;
  color: white;
}
.doc-layer {
  padding-left: 0;
}
li > .doc-layer {
  margin-left: 13px;
  background-color: darkgrey;
}
.collapse-list {
  padding: 0;
}
li {
  list-style-type: none;
  line-height: 1;
  padding-top: 5px;
  padding-bottom: 5px;
  font-size: 13px;
  word-wrap: break-word;
  text-indent: -1em;
  padding-left: 1em;
}
.doc-list:hover {
  background-color: lightgrey;
  padding-left: 13px;
}
.collapse-icon {
  color: white;
  margin: -4px;
  font-size: 13px;
  width: 13px;
}
.selected {
  font-weight: bold;
  color: black;
  background-color: white;
}
.selected .collapse-icon {
  /*font-weight: bold;*/
  color: black;
}
.selected > li {
  /*background-color: darkgrey;*/
}
</style>
