


// $("form").on("submit", function (e) {
//   var dataString = $(this).serialize();
var dataString = {"hello":"hello"}
function send(){
  $.ajax({
    type: "GET",
    url: "http://localhost:8080/product",
    // data: dataString,
    success: function (response) {
      // Display message back to the user here
      // response = JSON.parse(response)  
      console.log(response)
    }
  });

  // e.preventDefault();
// });
}