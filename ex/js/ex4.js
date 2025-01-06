function focus() {
    document.querySelector("#id").focus()
}

function check() {
    let idc = /^[a-z0-9]+$/;
    let expemail = /^[a-z0-9+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/;
    let bdc = /^\d{4}\d{2}\d{2}$/;

    //3
    if(!document.querySelector("#id").value){
        alert("아이디를 입력해주세요!");
        document.querySelector("#id").focus();
        return false;
    }
    //4
    if(!document.querySelector("#id").value.match(idc)){
        alert("아이디의 형식이 잘못 되었습니다.")
        document.querySelector("#id").value="";
        document.querySelector("#id").focus();
        return false;
    }
    if(!document.getElementById("email").value){
        alert("이메일을 입력하세요!");
        document.getElementById("email").focus();
        return false;
    }
    //이메일 형식
    if(!document.getElementById("email").value.match(expemail)){
        alert("이메일 형식이 맞지 않습니다.");
        document.getElementById("email").value=""
        document.getElementById("email").focus();
        return false;
    }

    if(!document.querySelector("#bd").value){
        alert("생년월일을 입력해주세요!");
        document.querySelector("#bd").focus();
        return false;
    }
    if(!document.querySelector("#bd").value.match(bdc)){
        alert("생년월일의 형식이 잘못 되었습니다.")
        document.querySelector("#bd").value="";
        document.querySelector("#bd").focus();
        return false;
    }
    
    document.register.submit();
}