<template>
  <div class="container-fluid">
          <div class="container bg-light m-3 rounded p-3 mx-auto d-block">
            
            <h1 id="title" class="text-center py-3">Company A</h1>

            <div class="pb-2 my-4 border-bottom fw-bold">
              Incomplete Forms
            </div>

            <ul>
              <li>Form A
                (Due on 
                <span class="text-decoration-underline">01/01/2020</span>
                )
              </li>
              <li>Form B
                (Due on 
                <span class="text-decoration-underline">01/01/2020</span>
                )
              </li>
              <li>Form C
                (Due on 
                <span class="text-decoration-underline">01/01/2020</span>
                )
              </li>
              <li>Form D
                (Due on 
                <span class="text-decoration-underline">01/01/2020</span>
                )
              </li>
              <li>Form E
                (Due on 
                <span class="text-decoration-underline">01/01/2020</span>
                )
              </li>
            </ul>

            <div class="pb-2 my-4 border-bottom fw-bold">
              Completed Forms
            </div>

            <ul>
              <li>Form A</li>
              <li>Form B</li>
              <li>Form C</li>
              <li>Form D</li>
              <li>Form E</li>
            </ul>

            <div class="text-center">
              <button type="button" class="btn btn-success my-4">Assign New Form</button>
            </div>


          </div>
      </div>
</template>

<script>
export default {
name:'SpecificVendor',
watch: {
  input: function () {
    if (isLocalStorage() /* function to detect if localstorage is supported*/) {
      localStorage.setItem('edit', true)
    }
  }
}
}

</script>

<style>

</style>