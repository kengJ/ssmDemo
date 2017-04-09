$(document).ready(function(){
	$('#tijiao').click(function(){
		$.post('login',function(date){
			alert(date);
		});
	});
});