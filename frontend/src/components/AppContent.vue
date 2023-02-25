<template>
  <div>
    <table class="table table-bordered">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">First</th>
          <th scope="col">Last</th>
          <th scope="col">Handle</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(emp, idx) in this.Employees" v-bind:key="emp.empNo">
          <th scope="row">{{ emp.empNo }}</th>
          <td>{{ emp.item}}</td>
          <td></td>
          <td>
              <button type="button" class="btn btn-danger btn-sm" v-on:click="removeEmp({emp, idx})">Delete</button>
          </td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Jacob</td>
          <td>Thornton</td>
          <td>@fat</td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td colspan="2">Larry the Bird</td>
          <td>@twitter</td>
        </tr>
      </tbody>
      <Modal v-if="showModal" @close="showModal = false">
          <!--
      you can use custom content here to overwrite
      default content
    -->
          <h3 slot="header">Employee ADD</h3>
          <div slot="body">
              <form class="row g-3">
    <div class="col-md-6">
      <label for="inputEmail4" class="form-label">Email</label>
      <input type="email" class="form-control" id="inputEmail4">
    </div>
    <div class="col-md-6">
      <label for="inputPassword4" class="form-label">Password</label>
      <input type="password" class="form-control" id="inputPassword4">
    </div>
    <div class="col-12">
      <label for="inputAddress" class="form-label">Address</label>
      <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
    </div>
    <div class="col-12">
      <label for="inputAddress2" class="form-label">Address 2</label>
      <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
    </div>
    <div class="col-md-6">
      <label for="inputCity" class="form-label">City</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="col-md-4">
      <label for="inputState" class="form-label">State</label>
      <select id="inputState" class="form-select">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="col-md-2">
      <label for="inputZip" class="form-label">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
    <div class="col-12">
      <div class="form-check">
        <input class="form-check-input" type="checkbox" id="gridCheck">
        <label class="form-check-label" for="gridCheck">
          Check me out
        </label>
      </div>
    </div>
    <div class="col-12">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </form>
          </div>
      </Modal>
    </table>
    <button type="button" class="btn btn-primary" v-on:click="showModal = true">ADD</button>
    </div>
</template>

<script>
import Modal from "./common/common-modal.vue"
import { mapGetters, mapMutations } from "vuex";

export default {
    data: function(){
      return {
        showModal: false,
      }
    },
    methods: {
      ...mapMutations({
        removeEmp: 'removeEmp'
      }),
      addEmp(){
          this.showModal = true;
      },
    },
    computed: {
      ...mapGetters({
        Employees: 'getEmployees'  
      })
    },
    components:{
      // eslint-disable-next-line vue/no-unused-components
      Modal: Modal,
      
    }

}
</script>

<style>

</style>
