function focus() {
    document.querySelector("#id").focus()
}

function check() {
    let idc = /^[a-z0-9]+$/;
    let passwdc = /^[a-zA-Z0-9,!,_,#,?]+$/;
    let passwdc2 = /^[a-zA-Z0-9,!,_,#,?]{6,}$/;

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
    //5
    if(!document.querySelector("#passwd").value){
        alert("비밀번호를 입력해주세요!");
        document.querySelector("#passwd").focus();
        return false;
    }
    if(!document.querySelector("#passwd").value.match(passwdc)){
        alert("비밀번호의 형식이 잘못 되었습니다.")
        document.querySelector("#passwd").value="";
        document.querySelector("#passwd").focus();
        return false;
    }
    if(!document.querySelector("#passwd").value.match(passwdc2)){
        alert("비밀번호는 6자리 이상으로 하시오")
        document.querySelector("#passwd").value="";
        document.querySelector("#passwd").focus();
        return false;
    }
    
    document.member.submit();
}