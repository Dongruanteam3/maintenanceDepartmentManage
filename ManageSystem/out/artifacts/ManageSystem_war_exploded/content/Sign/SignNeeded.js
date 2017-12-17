/**
 * Created by riosysm on 2017/12/16.
 */
function bigImg(x)
{
    x.style.height="60px";
    x.style.width="60px";
}

function normalImg(x)
{
    x.style.height="50px";
    x.style.width="50px";
}
var tack = 0;
function showhide_password(){
    var pwd=document.getElementById("password");
    var img=document.getElementById("showpassword")
    if(tack == 0){
        pwd.type="text";
        img.src="../../res/png/function/眼.png";
        tack =  1;
    }
    else
    {
        img.src="../../res/png/function/眼%20(1).png";
        tack = 0;
        pwd.type="password";

    }
}rn

function reloadCode()
{
    var time=new Date().getTime();
    alert(time);
    document.getElementById("imagecode").src="<%=request.getContextPath()%>/servlet/ImageServlet";
    //var img = document.getElementById("imagecode");
    //img.src=""
}