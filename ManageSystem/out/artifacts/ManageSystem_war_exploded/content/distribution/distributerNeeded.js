/**
 * Created by riosysm on 2017/12/18.
 */

function  chaxun() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询所有维修</h6>"


}

function fenpei(){
        document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>分配所有未分配任务</h6>"
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