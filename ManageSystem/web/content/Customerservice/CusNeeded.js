/**
 * Created by riosysm on 2017/12/18.
 */
function tianjia () {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>结算管理</h6>"
}

function  xiugai(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>客户信息管理</h6>"
}

function  jianshao(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>报修管理</h6>"
}

function  chaxun(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>客户管理</h6>"
}

function queren(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>生成客户确认单</h6>"
}

function jiesuan() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>生成结算清单</h6>"

}

//每次提交的确认
function submit_sure(){
    var gnl=confirm("提交?");
    if (gnl==true){
        return true;
      
    }else{
        return false;
    }
}

function deleteboChange(obj){
    obj.style="text-shadow: 2px 1px 1px white;"
}

function deleteboChangeback(obj){
    obj.style="text-shadow: 0 0 5px white;"
}
function delect(){
	 if(confirm("确定删除？")){
		 alert("已删除");
		
		 }else{
			 }
	}
	function ma(){
		if(confirm("确定提交？")){
  
		
		 }else{
			 }
   
}