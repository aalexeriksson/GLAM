<<<<<<< HEAD:src/main/resources/static/newFolder/popup.js
document.getElementById('bttn').addEventListener('click', function(){
    document.querySelector('.bg-modal').style.display= 'flex';
});
=======
//document.getElementById('btn').addEventListener('click', function(){
//    document.querySelector('.bg-modal').style.display= 'flex';
//});
//
//document.querySelector('.fakebtn1').addEventListener('click', function(){
//    document.querySelector('.bg-modal').style.display = 'none';
//});
>>>>>>> lucinepolice:src/main/resources/static/popup.js

$(function () {
  $('[data-toggle="popover"]').popover()

  console.log("i was clicked")
  $('#button1').popover()

})
$('#exampleModal').on('shown.bs.modal', function () {
  $('#myInput').trigger('focus')
})
$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  var recipient = button.data('whatever') // Extract info from data-* attributes
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
  var modal = $(this)
  modal.find('.modal-title').text('New message to ' + recipient)
  modal.find('.modal-body input').val(recipient)
})