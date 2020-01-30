module.exports = {
  root: true,
  env: {
    browser: true,
    node: true
  },
  parserOptions: {
//    parser: 'babel-eslint'
  },
  extends: [
//    '@nuxtjs',
    'prettier',
    'prettier/vue',
    'plugin:prettier/recommended',
    'plugin:nuxt/recommended',
    '@nuxtjs/eslint-config-typescript'
  ],
  plugins: [
    'prettier'
  ],
  // add your custom rules here
  rules: {
    'space-before-function-paren': 0,
//    'semi': ['error', 'never',  {'beforeStatementContinuationChars': 'never'}],
//    "semi-spacing": ["error", {"after": true, "before": false}],
//    "semi-style": ["error", "first"],
//    "no-extra-semi": "error",
//    "no-unexpected-multiline": "error",
//    "no-unreachable": "error"
//    'semi': ['error', 'never'],
  }
}
