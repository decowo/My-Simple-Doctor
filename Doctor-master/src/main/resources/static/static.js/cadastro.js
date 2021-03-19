var usuario = {};
var url_atual = window.location.href;


if(typeof url_atual != "undefined") {
	
	$.ajax({
		url: "/cadastro/cadastrarUsuario/" + url_atual,
		type: 'POST',
	}).done(function(e){
		
		usuario = e;
		
		$("#id").val(usuario.id);
		$("#nome").val(usuario.nome);
		$("#email").val(usuario.email);
		$("#birthdate").val(usuario.birthdate);
        $("#gender").val(usuario.gender);
        $("#user").val(usuario.user);
        $("#psw").val(usuario.password);

	}).fail(function(){
		$.alert("Erro, Usuario não encontrado!");
	});
}

function setUsuario()
{
    usuario = {};
    
    usuario.id = $("#id").val();
    console.log(usuario.id);
    
    usuario.nome  = $("#nome").val();
    usuario.email = $("#email").val();
    usuario.birthdate = $("#birthdate").val();
    usuario.gender = $("#gender").val();
    usuario.user = $("#user").val();
    usuario.password = $("#psw").val();
    
}

$("#enviar").click(function() {

	cliente = {};
	
	if($("#nome").val() != '' 
	&& $("#email").val() != ''
	&& $("#birthdate").val() != ''
	&& $("#gender").val() != ''
	&& $("#user").val() != ''
	&& $("#psw").val() != '') {
		
		setUsuario();
		
		$.confirm({
			type: 'green',
		    title: 'Cliente: ' + $("#nome").val(),
		    content: 'Cadastrar cliente?',
		    buttons: {
		        confirm: {
		            text: 'Cadastrar',
		            btnClass: 'btn-green',
		            keys: ['enter'],
		            content: "Deseja enviar?",
		            action: function(){
						$.ajax({
							url: "/cadastro/cadastrarUsuario",
							type: 'POST',
							dataType: "json",
							contentType:'application/json',
							data: JSON.stringify(usuario)
							
						}).done(function(e){
							$.alert({
								type: 'green',
								title: 'Sucesso!',
								content: "Usuario cadastrado",
							});
						}).fail(function(e){
							$.alert({
								type: 'red',
								title: 'Aviso',
								content: "Usuario não cadastrado!"
							});
						});
					}
		        },

			}
		});
	}
});