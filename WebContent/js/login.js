function login(){
	document.getElementById("loginForm").action="LoginAction";
}

function createUser(){
	document.getElementById("loginForm").action="CreateUserAction";
}

function resetPassword(){
	document.getElementById("loginForm").action="ResetPasswordAction";
}
