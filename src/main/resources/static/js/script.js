$('#table_id tr td').each(function(){
  var booleanValue = $(this).html();
  if((booleanValue)) {
    if (booleanValue === "false") {
      $(this).css('background-color','red');
    }
   }
});

$(document).ready( function () {
    $('#table_id').DataTable();
} );