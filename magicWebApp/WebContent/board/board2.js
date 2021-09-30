function check_ok(){
	if(document.boardWrite.b_name.value.length == 0){
		alert("아이디를 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(document.boardWrite.b_email.value.length == 0){
		alert("이메일을 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(document.boardWrite.b_title.value.length == 0){
		alert("제목을 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(document.boardWrite.b_content.value.length == 0){
		alert("내용 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(document.boardWrite.b_pwd.value.length == 0){
		alert("비밀번호를 입력해주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	
	boardWrite.submit();
}

function delete_ok(){
	if(document.form.b_pwd.value.length == 0){
		alert("비밀번호를 입력해주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	
	document.form.submit();
}