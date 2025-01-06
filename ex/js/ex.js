function focus(){
    document.querySelector("#email").focus();
}
function check() {
    let expemail = /^[a-z0-9+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/;
    let exppasswd = /^[a-zA-Z0-9,!,@,#,$]+$/;
    let exppasswd2 = /^[a-zA-Z0-9,!,@,#,$]{8,12}$/;
    //이메일이 공백이면 오류발생
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
    //비밀번호를 입력하지 않으면 메시지 출력
    if(!document.getElementById("passwd").value){
        alert("비밀번호를 입력하세요!");
        document.getElementById("passwd").focus();
        return false;
    }
    //비밀번호는 영문대소문자, 숫자,_만 입력가능
    if(!document.getElementById("passwd").value.match(exppasswd)){
        alert("비밀번호는 영문자와 숫자와 !,@,#,$만 입력 가능합니다!");
        document.getElementById("passwd").value=""
        document.getElementById("passwd").focus();
        return false;
    }
    //비밀번호는 8글자이상 12글자이하만 입력가능
    if(!document.getElementById("passwd").value.match(exppasswd2)){
        alert("비밀번호는 8글자이상 12글자 이하만가능합니다!");
        document.getElementById("passwd").value=""
        document.getElementById("passwd").focus();
        return false;
    }
   
    document.member.submit();
}