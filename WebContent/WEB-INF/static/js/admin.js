$(document).ready(function(){
	$('#login-form > input[type=submit]').click(function(){

		$.post('Admin/login',{ AdminName: $('#AdminName').val(), AdminPassword:$('#AdminPassword').val() },function(date){
			//alert($('#AdminName').val());
			var json = JSON.stringify(date, null, 2);
			var key =jQuery.parseJSON(json).key;
			if(key){

				location.href ="Admin/toAdmin/"+$('#AdminName').val()+"/"+$('#AdminPassword').val();
			}
		});
	});
});