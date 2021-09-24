function check_ok(){
	if(boardWrite.b_name.value.length == 0){
		alert("아이디를 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(boardWrite.b_email.value.length == 0){
		alert("이메일을 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(boardWrite.b_title.value.length == 0){
		alert("제목을 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	if(boardWrite.b_content.value.length == 0){
		alert("내용 써주세요.");
//		reg_frm.mem_uid.focus();
		return;
	}
	
	boardWrite.submit();
}