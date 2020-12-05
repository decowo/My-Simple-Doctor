function Avaliar(estrela) {


    var url = window.location;
    url = url.toString()
    url = url.split("index");
    url = url[0];

    var s1 = document.getElementById("s1").src;
    var s2 = document.getElementById("s2").src;
    var s3 = document.getElementById("s3").src;
    var s4 = document.getElementById("s4").src;
    var s5 = document.getElementById("s5").src;
    //var avaliacao = 0;

    if (estrela == 5) {
        if (s5 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/s36vZvf/star.png";
            //avaliacao = 5;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 4;
        }
    }

    //ESTRELA 4
    if (estrela == 4) {
        if (s4 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 4;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            // avaliacao = 3;
        }
    }

    //ESTRELA 3
    if (estrela == 3) {
        if (s3 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 3;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 2;
        }
    }

    //ESTRELA 2
    if (estrela == 2) {
        if (s2 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 2;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 1;
        }
    }

    //ESTRELA 1
    if (estrela == 1) {
        if (s1 == "https://i.ibb.co/4YL84Hk/starvazia.png") {
            document.getElementById("s1").src = "https://i.ibb.co/s36vZvf/star.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            //avaliacao = 1;
        } else {
            document.getElementById("s1").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s2").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s3").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s4").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            document.getElementById("s5").src = "https://i.ibb.co/4YL84Hk/starvazia.png";
            // avaliacao = 0;
        }
    }

    //document.getElementById('rating').innerHTML = avaliacao;

}


function Login() {

    var done = 0;
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pwd").value;

    if (username == "manu" && password == "123") {
        window.location = "http://localhost:8080/user/2";
        done = 1;
    }
    if (username == "joel" && password == "123") {
        window.location = "http://localhost:8080/user/1";
        done = 1;
    }
    if (username == "glauco" && password == "123") {
        window.location = "http://localhost:8080/user/201";
        done = 1;
    }
    if (done == 0) { alert("Senha ou Usuário inválido." + document.getElementById("uname").value); }




}

function Buscar() {
    var input = document.getElementById("indicacao").value;
    var url = "http://localhost:8080/medicamentos/";
    var link = url + input;
    window.open(url + input, "_blank");

}

function Buscarf() {
    var input = document.getElementById("state").value;
    var url = "http://localhost:8080/farmacias/";
    var link = url + input;
    window.open(url + input, "_blank");

}