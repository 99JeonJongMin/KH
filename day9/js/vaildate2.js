function check() {
    let expid = /^[a-z0-9]+$/;
    let exppasswd = /^[\w]+$/;
    let exppasswd2 = /^[\w]{8,12}$/;
    let exptel = /^[0-9]{11}$/;
    let expaddr = /^[가-힣a-zA-Z0-9-,]+$/;
    let expemail = /^[a-z0-9+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/;
    //아이디를 입력하지 않으면 메시지 출력
    if(!document.getElementById("id").value){
        alert("아이디를 입력하세요!");
        document.getElementById("id").focus();
        return false;
    }
    //아이디는 영문소문자와 숫자만 입력가능
    if(!document.getElementById("id").value.match(expid)){
        alert("아이디는 영문소문자와 숫자만 입력 가능합니다!");
        document.getElementById("id").value=""
        document.getElementById("id").focus();
        return false;
    }
    //비밀번호를 입력하지 않으면 메시지 출력
    if(!document.getElementById("passwd1").value){
        alert("비밀번호를 입력하세요!");
        document.getElementById("passwd1").focus();
        return false;
    }
    //비밀번호는 영문대소문자, 숫자,_만 입력가능
    if(!document.getElementById("passwd1").value.match(exppasswd)){
        alert("비밀번호는 영문자와 숫자와 _만 입력 가능합니다!");
        document.getElementById("passwd1").value=""
        document.getElementById("passwd2").value=""
        document.getElementById("passwd1").focus();
        return false;
    }
    //비밀번호는 8글자이상 12글자이하만 입력가능
    if(!document.getElementById("passwd1").value.match(exppasswd2)){
        alert("비밀번호는 8글자이상 12글자 이하만가능합니다!");
        document.getElementById("passwd1").value=""
        document.getElementById("passwd2").value=""
        document.getElementById("passwd1").focus();
        return false;
    }
    //비밀번호와 비밀번호 확인이 일치하지 않으면 메시지 출력
    if(document.getElementById("passwd1").value != document.getElementById("passwd2").value){
        alert("비밀번호가 일치하지 않습니다.")
        document.getElementById("passwd1").value=""
        document.getElementById("passwd2").value=""
        document.getElementById("passwd1").focus();
        return false;
    }
    if(!document.getElementById("tel").value){
        alert("연락처를 입력하세요!");
        document.getElementById("tel").focus();
        return false;
    }
    //연락처는 숫자만 입력가능
    if(!document.getElementById("tel").value.match(exptel)){
        alert("연락처는 11글자의숫자만 입력 가능합니다!");
        document.getElementById("tel").value=""
        document.getElementById("tel").focus();
        return false;
    }
    if(!document.getElementById("addr").value){
        alert("주소를 입력하세요!");
        document.getElementById("addr").focus();
        return false;
    }
    //주소는 한글,영문,숫자,-,만입력가능
    if(!document.getElementById("addr").value.match(expaddr)){
        alert("주소는 한글,영문,숫자,-,만입력가능 가능합니다!");
        document.getElementById("addr").value=""
        document.getElementById("addr").focus();
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
    document.member.submit();
}