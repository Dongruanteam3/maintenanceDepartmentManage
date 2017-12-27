<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>SignUp</title>
    <link rel="stylesheet" type="text/css" href="../frame.css">
    <link rel="stylesheet" type="text/css" href="../Sign/banerNeeded.css">
    <link rel="icon" href="/res/png/eyu.ico"/>
    <script src="../Sign/SignNeeded.js"></script>
</head>
<body>
<div class="banner">
    <div class="banner-container">
        <a href="/content/about/About.html">
            <img class="logo" height="150px" width="150px" src="../../res/png/brandwhite.png" style="margin-bottom: -40px;">
        </a>
    </div>
</div>

<main role="main">
    <div class="sign-form" id="login">
        <form accept-charset="UTF-8" action="" method="post" >
            <div class="sign-form-header">
                Sign in to ZouYu
            </div>

            <div class="sign-form-body">
                <br>
                <label for="username">
                    账户
                </label>
                <br>
                <input autofocus="autofocus" class="sign-form-input" id="username" name="username" tabindex="1" type="text">
                <br>
                <label for="password">
                    密码
                </label>
                <br>
                <input class="sign-form-input" id="password" name="password" tabindex="2" type="password">
                <!--<input style="height: 20px; width: 20px" type="image" name="showHidePwd" src="../../res/png/function/眼%20(1).png"  onchange="showhide_password(this)">-->

                <img src="../../res/png/function/眼%20(1).png" alt="显示密码" class="showPassword" onclick="javascript:showhide_password()" id="showpassword">
                <br>
                <!--<input class="submitbuttom" name="commit" tabindex="3" type="submit" ><img src="../../res/png/function/提交bai.png">-->
                <label for="captcha">
                    验证
                </label>
                <br>
                <input type="text" name="captcha" id="captcha" class="sign-form-input" style="width: 200px">
                &nbsp; &nbsp;
                <img alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/servlet/root/ImageServlet"/>
                <a onclick="document.getElementById('imagecode').src='<%=request.getContextPath()%>/servlet/root/ImageServlet?'+Math.random()" style="color: #c2c3aa;">看不清,换一张</a>
                <span class="submitbuttom-frame">
                    <input name="imgbtn" type="image" src="../../res/png/function/提交bai.png" class="submitbuttom" onmousemove="bigImg(this)" onmouseout="normalImg(this) ">
                </span>
            </div>
        </form>
    </div>
    <div class="sign-linkpos">
        <div class="sign-link">
            <a style="color: white;" href="../about/About.html">About</a>
            <a style="color: white;" href="/episodes">Episodes</a>
            <a style="color: white;" href="/contact">Contact</a>
            <a style="color: white;" href="/search">Search</a>
            <a style="color: white;" href="/">SignIn</a>
        </div>
    </div>
</main>

</body>
</html>

