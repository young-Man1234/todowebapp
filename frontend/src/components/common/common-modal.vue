<template>
   <transition name="modal">
            <div class="modal-mask">
              <div class="modal-wrapper">
                <div class="modal-container">

                  <div class="modal-header">
                    <slot name="header">
                      default header
                    </slot>
                     <button class="modal-default-button" @click="$emit('close')">
                          close
                    </button>
                  </div>
                  <div class="modal-body">
                    <slot name="body">
                      default body
                    </slot>
                  </div>

                  <div class="modal-footer">
                    <slot name="footer">
                      default footer
                    </slot>
                  </div>
                </div>
              </div>
            </div>
    <!-- <div class="modal" tabindex="-1">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title">Modal title</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <p>Modal body text goes here.</p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary">Save changes</button>
          </div>
        </div>
      </div>
    </div> -->
  </transition>
</template>

<script>
export default {

}
</script>

<style>
.modal-mask {
  position: fixed !important;
  z-index: 9998 !important;
  top: 0 !important;
  left: 0 !important;
  width: 100% !important;
  height: 100% !important;
  background-color: rgba(0, 0, 0, 0.5) !important;
  display: table !important;
  transition: opacity 0.3s ease !important;
}

.modal-wrapper {
  display: table-cell !important;
  vertical-align: middle !important;
}

.modal-container {
  width: 600px !important;
  margin: 0px auto !important;
  padding: 20px 30px !important;
  background-color: #fff !important;
  border-radius: 2px !important;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.33) !important;
  transition: all 0.3s ease !important;
  font-family: Helvetica, Arial, sans-serif !important;
}

.modal-header h3 {
  margin-top: 0 !important;
  color: #42b983 !important;
}

.modal-body {
  margin: 20px 0 !important;
}

.modal-default-button {
  float: right !important;
}

/*
 * The following styles are auto-applied to elements with
 * transition="modal" when their visibility is toggled
 * by Vue.js.
 *
 * You can easily play with the modal transition by editing
 * these styles.
 */

.modal-enter {
  opacity: 0;
}

.modal-leave-active {
  opacity: 0;
}

.modal-enter .modal-container,
.modal-leave-active .modal-container {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}

</style>