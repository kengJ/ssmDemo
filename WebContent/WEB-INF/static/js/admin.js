$(document).ready(function(){
	$('#login-form > input[type=submit]').click(function(){
		$.post(
		'Admin/login',
		{ 
			AdminName: $('#AdminName').val(),
			AdminPassword:$('#AdminPassword').val() 
		},
		function(date){
			var json = JSON.stringify(date, null, 2);
			var key =jQuery.parseJSON(json).key;
			if(key){
	
				location.href ="Admin/toAdmin/"+$('#AdminName').val()+"/"+$('#AdminPassword').val();
			}
		});
	});
	//GetList
	$('button#GetList').click(function() {
		// alert('test');
		$.post('Admin/GetList', function(data) {
			/*optional stuff to do after success */
			html='';
			alert(JSON.stringify(data,null,2));
			html+='<table border=1>'
			for(list in data){
				html+='<tr>';
				html+='<td>'+data[list].adminName+'</td>';
				html+='<td>'+data[list].adminPassword+'</td>';
				html+='</tr>';
			}
			$('body').append(html);
		});
	});
	
	


});