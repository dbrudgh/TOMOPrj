<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>
<title>${board_name}</title>
</head>
<body>

<textarea rows="content" id="content" rows= "22" style="width:645px;">
${board_contents}
</textarea>
</body>

<script type="text/javascript">

	 var oEditors = [];
	
	 nhn.husky.EZCreator.createInIFrame({
	
	 	oAppRef: oEditors,
	
	 	elPlaceHolder: "content", //textarea에서 지정한 id와 일치해야 합니다.
	
	 	sSkinURI: "${contextPath}/smarteditor/SmartEditor2Skin.html",
	
	 	fCreator: "createSEditor2"
	
	 });

</script>

</html>

