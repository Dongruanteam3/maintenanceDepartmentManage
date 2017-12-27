/**
 * Created by riosysm on 2017/12/19.
 */
function  chaxun() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询目前备件情况</h6> 查询目前备件情况并适当入库";

}
function  ruku() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>入库</h6> 入库分为两个界面 一个是已经存在的 这个只用修改数量和入库时间即可 另一个是不存在的 这个需要填完整的表单";

}
function  chuku() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>出库</h6> 对于出库,只用修改数量即可 对于每次的出入库都要填写流水"+
    "这里的配件包括一个很多零件,所有存在的零件(形成字符串)配上单号再加上不存在的零件作为的备注为一个单位,因为传到的零件其实是一个数组就可以动态生成表单然后后面两个链接 一个是出库 一个是入库 有两种情况 第一种 如果不存在备注(也就是不存在未入库的备件)仅仅只是零件不够, 判断逻辑就是取出对应备件数量 - 需求数量 > 红线 如果存在未入库备件,需要将备注字符串转化为Map 然后完成存入并设置信息 检测逻辑与之前一直 不过多了备注组成的数组检查";

}
function getstatu(){
    var state = document.getElementById('a75').value - document.getElementById('a76').value;
    if(state > 0)
        document.getElementById('a77').value = 1;
    else if(state == 0 && document.getElementById('a75').value!= 0)
        document.getElementById('a77').value = 2;
    else if(document.getElementById('a75').value >0)
        document.getElementById('a77').value = 3;
    else
        document.getElementById('a77').value = 4;
}


function deleteboChange(obj){
    obj.style="text-shadow: 0 0 10px white;"
}

function deleteboChangeback(obj){
    obj.style="text-shadow: 0 0 1px white;"
}

function test(){
    var out = document.getElementById("a1051").value;
    alert("1");
    alert(out);
}

function today(){
    var today=new Date();
    document.getElementById("a66").value = today();
}

function vilidate_form(){
    if(document.getElementById("a72").value==""){
        alert("备件名");
        document.getElementById("a72").focus();
        return false;
    }
    else if(document.getElementById("a73").value=="") {
        alert("备件型号");
        document.getElementById("a73").focus();
        return false;
    }
    else {
        return true;
    }
}

function vilidate_select(){
    if(document.getElementById(selectStatus).value= 5){
        if(document.getElementById(selectName).value==""){
            document.getElementById(selectName).focus();
            return false;
        }
    }else{
        return true;
    }
}
