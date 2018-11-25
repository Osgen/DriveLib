$(document).ready(function () {
   $.get("http://localhost:8080/students/1", function (data) {
      console.log(data);
   });
});