$(document).ready(function(){
	$('#login-form > input[type=submit]').click(function(){

		$.post('login',{ AdminName: $('#AdminName').val(), AdminPassword:$('#AdminPassword').val() },function(date){
			//alert($('#AdminName').val());
			var json = JSON.stringify(date, null, 2);
			alert(json);
		});
	});
});