/**
 * Created by riosysm on 2017/12/18.
 */
function tianjia () {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>添加客户</h6>"
}

function  xiugai(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>修改客户信息</h6>"
}

function  jianshao(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>删除客户信息</h6>"
}

function  chaxun(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询客户信息</h6>"
}

function queren(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>生成客户确认单</h6>"
}

function jiesuan() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>生成结算清单</h6>"

}

//每次提交的确认
function submit_sure(){
    var gnl=confirm("确定要提交?");
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