/**
 * 程式描述: 確認此變數是否為物件
 * 
 * @param variable: 傳入的變數 
 * @returns true: 變數為物件, false: 變數不為物件
 * */
function isObj(variable){
	return (!((variable==null)||(variable==undefined)));
}
/**
 * 程式描述: 將一個html form中的所有資料 encode 為一個 JSONObject 格式並以 POST 方法傳輸到指定 url
 * 
 * @param url: 目標url
 * @param formID: 欲傳輸的html form
 * @param key: 目標url以 POST 收到的 parameter key
 * @param target: 是否另開視窗,預設為否
 * @returns
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
 * 程式目的: 將一個json物件以post方式由form submit至指定url
 * 
 * @param key
 * @param obj
 * @param url
 * @param target
 * @returns
 */
function postJsonObjectViaSubmit(key, obj, url, target) {
	var form = document.createElement("form");
	form.action = url;
	form.method = "post";
	form.target = target || "_self";
	form.style.display = "none";
	var textArea = document.createElement("textarea");
	textArea.name = key;
	textArea.value = JSON.stringify(obj);
	form.appendChild(textArea);
	document.body.appendChild(form);
	form.submit();
	document.body.removeChild(form);
}

/**
 * 程式目的 複製物件實例 
 * 
 * @param origObj
 * @returns clone of origObj
 */
function clone(origObj) {
	return JSON.parse(JSON.stringify(origObj));
}