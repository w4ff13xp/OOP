// axios.get("http://localhost:8080/product"),{params:{
//   headers: {
//     'Access-Control-Allow-Origin': true,
//   },
// }}
// .then(response =>  {
  
//   console.log(response.data)
// })
// .catch(err =>{
//   console.log(err)
// });

// axios({
//   method: 'get',
//   url: "http://localhost:8080/product",
//   withCredentials: false,
//   params: {
//     //access_token: SECRET_TOKEN,
//   },
// });




// $("form").on("submit", function (e) {
//   var dataString = $(this).serialize();
// var dataString = {"hello":"hello"}
// function send(){
//   $.ajax({
//     type: "GET",
//     url: "http://localhost:8080/product",
//     // data: dataString,
//     dataType: "jsonp",
//     jsonpCallback: "response",
//     cors:true,
//     secure: true,
//     headers: {
//         'Access-Control-Allow-Origin': '*',
//     },
//     success: function (response) {
//       // Display message back to the user here
//       response = JSON.parse(response)  
//       console.log("wheeee")
//       console.log(response)
//     }
//   });

//   // e.preventDefault();
// // });
// }

function send(){
$.ajax({
  url: "http://localhost:8080/product",
  type: "GET",
  crossDomain: true,
  // data: JSON.stringify(somejson),
  dataType: "json",
  success: function (response) {
      var resp = JSON.parse(response)
      alert(resp.status);
  },
  error: function (xhr, status) {
      alert("error");
  }
});

}