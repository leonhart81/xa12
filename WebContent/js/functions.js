/**
 * 程式描述: 將一個html form中的所有資料 encode 為一個 JSONObject 格式並以 POST 方法傳輸到指定 url
 * 
 * @param url: 目標url
 * @param formID: 欲傳輸的html form
 * @Param key: 目標url以 POST 收到的 parameter key
 * @Param target: 是否另開視窗,預設為否
 * */
function postFormViaJSONObject(url, formOrDivID, key, target) {
	var origForm = document.getElementById(formOrDivID);
	var origInputs = origForm.getElementsByTagName("input");
	var origTextAreas = origForm.getElementsByTagName("textarea");
	var origSelects = origForm.getElementsByTagName("select");
	var json = new Object();
	for (var input in origInputs) if (input.value != "") json[input.name] = input.value;
	for (var textarea in origTextAreas) if (textarea.value != "") json[textarea.name] = textarea.value;
	for (var select in origSelects) {
		if (select.selectedIndex != -1) {
			var value = select.options[select.selectedIndex].text;
			if (value != "") json[select.name] = value;
		}
	}
	var textArea = document.createElement("textarea");
	textArea.name = key;
	textArea.value = JSON.stringify(json);
	var form = document.createElemnt("form");
	form.action = url;
	form.method = "post";
	form.target = target || "_self";
	form.appendChild(textArea);
	form.style.diplay = "none";
	document.body.appendChild(form);
	form.submit();
	document.body.removeChild(form);
}

/**
 * 程式目的 複製物件實例 
 * @param origObj
 * @returns
 */
function clone(origObj) {
	return JSON.parse(JSON.stringify(origObj));
}