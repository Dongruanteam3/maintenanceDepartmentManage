/**
 * Created by riosysm on 2017/12/18.
 */
function kehu() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>客户管理</h6>"
  document.getElementById("functions").innerHTML = "<a href='userinsert.html'><img src='../../res/png/customerservice/增加new.png' alt='增加' onmousemove='tianjia()' width='13%'></a>"+
                "&nbsp; &nbsp;"+
                "&nbsp; &nbsp;"+
                "<a href='userdelete.html'><img src='../../res/png/customerservice/减少.png' alt='减少' onmousemove='jianshao()' width='13%'></a>"+
                "&nbsp; &nbsp;"+
                "&nbsp; &nbsp;"+
                "<a href='userselect.html'><img src='../../res/png/customerservice/查询%20(1).png' alt='查询' onmousemove='chaxun()' width='13%'></a>"+
                  "&nbsp; &nbsp;"+
                "&nbsp; &nbsp;"+
                "<a href='userselect.html'><img src='../../res/png/customerservice/修改.png' alt='修改' onmousemove='xiugai()' width='13%'></a>"
}
function weixiu(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>报修管理</h6>"
    document.getElementById("functions").innerHTML = "<a href='AfterSelect/records.html'><img src='../../res/png/customerservice/登记.png' alt='填写' onmousemove='tianxie()' width='13%'></a>"+
        "&nbsp; &nbsp;"+
        "&nbsp; &nbsp;"+
        "<a href='AfterSelect/recordsselect.html'><img src='../../res/png/customerservice/修改.png' alt='修改' onmousemove='weihu()' width='13%'></a>"+
        "&nbsp; &nbsp;"+
        "&nbsp; &nbsp;"+
        "<a href='AfterSelect/ConfirmationPrint.html'><img src='../../res/png/function/打印.png' alt='打印' onmousemove='dayin()' width='13%'></a>"+
        "&nbsp; &nbsp;"+
        "&nbsp; &nbsp;"+
        "<a href='AfterSelect/submit.html'><img src='../../res/png/function/提交的副本.png' alt='提交' onmousemove='tijiao()' width='13%'></a>";
}
function jiesuan(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>结算管理</h6>"
    document.getElementById("functions").innerHTML = "<a href='AfterSelect/settleFront.html'><img src='../../res/png/function/结算.png' alt='结算' onmousemove='jiesuan2()' width='13%'></a>";
}
function tianjia () {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>添加客户</h6>"
}

function  xiugai(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>修改客户信息</h6>"
}
function  weihu(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>维护报修信息</h6>"
}

function  jianshao(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>删除客户</h6>"
}

function  chaxun(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询客户信息</h6>"
}

function tianxie(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>填写报修设备表</h6>"
}

function dayin() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>打印表单</h6>"
}

function xiugaishebei() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>修改设备维修表</h6>"
}
function tijiao() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>提交设备维修表</h6>"
}
function jiesuan2() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>结算维修并生成确认单</h6>"
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