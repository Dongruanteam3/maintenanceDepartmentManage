/**
 * Created by riosysm on 2017/12/19.
 */
function  jiesuan() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>所有未结算已经完成的维修</h6> 这里,理论上只用核实就行,判断之前有没有做保修以及填写注意事项";
}

function  queren() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>生成确认表单</h6> 这里,根据结算费用表形成确认表单 一旦签字确认状态为1(但是无法反馈 所以默认打印就为1)";
}

function  chaxun() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询账单</h6> ";
}
function doSubmit(){
    window.location='settleComform.html';
}
function deleteboChange(obj){
    obj.style="text-shadow: 2px 1px 1px white;"
}

function deleteboChangeback(obj){
    obj.style="text-shadow: 0 0 5px white;"
}