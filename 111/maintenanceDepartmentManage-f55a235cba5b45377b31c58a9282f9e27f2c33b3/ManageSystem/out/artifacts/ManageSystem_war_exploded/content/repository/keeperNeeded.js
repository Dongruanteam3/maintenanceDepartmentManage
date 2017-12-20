/**
 * Created by riosysm on 2017/12/19.
 */
function  chaxun() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>查询目前维修需要的配件</h6> 这里的配件包括一个很多零件,所有存在的零件(形成字符串)配上单号再加上不存在的零件作为的备注为一个单位,因为传到的零件其实是一个数组就可以动态生成表单然后后面两个链接 一个是出库 一个是入库 有两种情况 第一种 如果不存在备注(也就是不存在未入库的备件)仅仅只是零件不够, 判断逻辑就是取出对应备件数量 - 需求数量 > 红线 如果存在未入库备件,需要将备注字符串转化为Map 然后完成存入并设置信息 检测逻辑与之前一直 不过多了备注组成的数组检查";

}
function  ruku() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>入库</h6> 入库分为两个界面 一个是已经存在的 这个只用修改数量和入库时间即可 另一个是不存在的 这个需要填完整的表单";

}
function  chuku() {
    document.getElementById("cus-functions").innerHTML = "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>出库</h6> 对于出库,只用修改数量即可 对于每次的出入库都要填写流水";

}
function getstatu(){
    var remain = document.getElementById("a1054").value;
    var red = document.getElementById("a1056").value;
    var statu = document.getElementById("a1057").value;
    if(remain == null && red == null)
    return false;
    if(remain - red >0)
        statu = 1;
    else if(remain = red)
        statu = 2;
    else if(remain > 0)
        statu = 3;
    else
        statu = 4;
    alert(statu);
}