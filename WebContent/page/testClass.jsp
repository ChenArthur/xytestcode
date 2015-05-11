<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<!-- <script src="//code.jquery.com/jquery-1.11.0.min.js"></script> -->
<!-- <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script> -->
<script type="text/javascript">
	//第一种方法
	$(document)
			.ready(
					function() {
						var doc = document, inputs = doc
								.getElementsByTagName('input'), supportPlaceholder = 'placeholder' in doc
								.createElement('input'), placeholder = function(
								input) {
							var text = input.getAttribute('placeholder'), defaultValue = input.defaultValue;
							if (defaultValue == '') {
								input.value = text
							}
							input.onfocus = function() {
								if (input.value === text) {
									this.value = ''
								}
							};
							input.onblur = function() {
								if (input.value === '') {
									this.value = text
								}
							}
						};
						if (!supportPlaceholder) {
							for (var i = 0, len = inputs.length; i < len; i++) {
								var input = inputs[i], text = input
										.getAttribute('placeholder');
								if (input.type === 'text' && text) {
									placeholder(input)
								}
							}
						}

					});

	//第二种方法
	$(function() {
		if (!placeholderSupport()) { // 判断浏览器是否支持 placeholder
			$('[placeholder]').focus(function() {
				var input = $(this);
				if (input.val() == input.attr('placeholder')) {
					input.val('');
					input.removeClass('placeholder');
				}
			}).blur(
					function() {
						var input = $(this);
						if (input.val() == ''
								|| input.val() == input.attr('placeholder')) {
							input.addClass('placeholder');
							input.val(input.attr('placeholder'));
						}
					}).blur();
		}
		;
	})

	function placeholderSupport() {
		return 'placeholder' in document.createElement('input');
	}
</script>
</head>
<body>
	<input id="name" name="placeholder" placeholder="姓名|证件号|国家学籍注册号">
	<form>
		<label for="name">用户名：</label> <input type="text" placeholder="请输入用户名" />
	</form>
</body>
</html>