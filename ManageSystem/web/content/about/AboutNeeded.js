/**
 * Created by riosysm on 2017/12/15.
 */
function kefu () {
    document.getElementById("function-detail").innerHTML="" +
        "<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>客户管理</h6>"+
        "作为一个面向客户的系统,需要记录客户的相关信息,并易于维护<br>功能:<br>包括客户信息的录入,编辑,查看,删除";
}
function diaodu(){
            "用于客户维护报修相关的信息,包括报修设备的信息 <br>功能: <br>1. 维护报修消息(包括报修记录和报修设备的维护)"+
            "<br>2. 打印客户确认单<br>3. 提交客户确认单:客户认可客户确认单并签字后,客服提交客户确认单,系统会展开一个维修任务"+
            "<br>4. 设定维修任务监察状态:每天定时监察维修任务的信息并能判断系统维修状态";
}
function weixiu(){
    document.getElementById("function-detail").innerHTML="<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>维修管理</h6>"+
            "客户报修后,维修任务由任务调度人员分配后才能有相应的技术工程师维修,系统能够记录分配和维修环节中的相关信息.<br>功能:<br>" +
            "1. 任务调度查询分配的维修任务,并将未分配维修任务分配给技术工程师.<br>"+
            "2. 技术工程师查询分配给自己的维修任务,然后试试维修活动,并能将维修活动中的相关信息记录到系统. 技术工程师在维修任务结束之前可以维护活动中的相关信息.";
}
function jiesuan(){
    document.getElementById("function-detail").innerHTML="<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>结算管理</h6>"+
        "维修技术后需要结算费用,费用主要来自于人工费用,材料费用和备件费用."+
        "<br>功能:<br>1. 客服根据维修过程中产生的人工费,材料费生成结算信息 ,交友客户确认.<br>"+
        "2. 财务人员需要查看结算费用";
}

function cangku(){
    document.getElementById("function-detail").innerHTML="<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>备件管理</h6>"+
            "在维修过程中可能会用到备件,业务单元需要管理备件,包括备件的入库,出库,查询"+
            "<br>功能:<br>1. 入库维护: 备件库有备件入库时,记录流水明细,并更新系统备件信息<br>"+
            "2. 出库:  备件库有备件出库时,记录流水明细,并更细 系统备件信息<br>"+
            "3. 查询库存: 查询备件库存信息<br>"+
            "4. 检查库存状态: 库管办理出库操作后,系统自动设置库存状态";
}

function jianguan(){
    document.getElementById("function-detail").innerHTML="<h6 style='font-size: 30px; text-shadow: 0 0 25px #fbf3e0 ;' class='heading'>运营监督管理</h6>"+
            "运营监督员有责任监控报修,维修和结算各个环节的工作情况, 发现延迟情况及时独处相关人员尽快完成任务, 可能查询客户信息,和查询结算信息.<br>"+
            "功能<br>"+
            "1. 查询维护任务<br>2. 查询仓库<br>3. 查询结算信息<br>4. 查询客户信息";
}


