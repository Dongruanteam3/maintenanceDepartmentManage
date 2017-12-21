/**
 * Created by riosysm on 2017/12/18.
 */

function  chaxun() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询需要做的维修</h6>";

}

function baoxiu(){
        document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查看对应的报修设备</h6><p>需要在查询页面之后对单独的维修作业查看</p>";
}

function xiugai(){
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>修改自己的维修进度</h6><p>需要在查询页面之后进入单独的维修作业修改</p>";
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

function addrow(){
    document.getElementById("repairtable").innerHTML+=" <tr> <th colspan='2' style='text-align: center'></th>"+
        "<th>"+
        "<select onselect=''>"+
        "<option value='1'>显卡</option> <option value='2'>主板</option> <option value='3'>声卡</option> <option value='4'>CPU</option> <option value='5'>外设</option> </select>"+
        "<select name='a10361[]' id='a10361[]'> <option value='1'>GTX850</option> <option value='2'>GTX960</option> <option value='3'>GTX1060</option> </select></th>"+
        "<th> <input type='number' name='a10362[]' id='a10362[]' class='customer-form-input' style='width:50%'><button class='table-buttom' onclick='addrow()'>+</button> </th> </tr>";
}