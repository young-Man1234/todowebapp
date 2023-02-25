<template>
  <div id="app">
    <AppHeader></AppHeader>
    <AppContent v-bind:propsdata="employees" v-on:removeEmp="removeOneItem"></AppContent>
  </div>
</template>

<script>
import AppHeader from './components/AppHeader.vue';
import AppContent from './components/AppContent.vue';

export default {
  name: 'App',
  data: function () {
    return {
      employees: [],
      num: 1,
    }
  },
  created: function () {
      
  },
  methods: {
    removeOneItem: function(empNo, idx){
      localStorage.removeItem(empNo);
      this.employees.splice(idx, 1);
    }
  },
  components: {
    AppHeader,
    AppContent
  },
}
</script>

<style>

</style>
