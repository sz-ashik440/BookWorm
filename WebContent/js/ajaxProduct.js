function addBTNClick() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("addProduct").innerHTML = xhttp.responseText;
		}
	};
	xhttp.open("GET", "/BookWorm/addBook", true);
	xhttp.send();
}