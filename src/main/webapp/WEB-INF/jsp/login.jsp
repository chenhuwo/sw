<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>chat</title>
<!-- Bootstrap Core CSS -->
<link href="/sw/static/layui-v0.0.5/layui/css/layui.css"
	rel="stylesheet" type="text/css">

<script src="/sw/static/layui-v0.0.5/layui/layui.js"/>
<script type="text/javascript">
layui.use('layim', function(layim){
	  //先来个客服模式压压精
	  layim.chat({
	    name: '客服姐姐'
	    ,type: 'kefu'
	    ,avatar: 'http://tp1.sinaimg.cn/5619439268/180/40030060651/1'
	    ,id: -2
	  });
	});

</script>
</head>
<body>

</body>
</html>
