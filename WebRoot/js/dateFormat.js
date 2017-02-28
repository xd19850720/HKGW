function formatTimeStr(val) {
	if (val) {
		return val.substring(0, 10);
	}
}

function formatTimeDate(val) {

	if (val) {

		var re = /-?\d+/;
		var m = re.exec(val);
		var d = new Date(parseInt(m[0]));
		// 按【2012-02-13 09:09:09】的格式返回日期
		// return d.format("yyyy-MM-dd hh:mm:ss");
		return d.getFullYear().toString() + "-" + (d.getMonth() + 1).toString()
				+ "-" + d.getDate().toString();
	}

	function getNowYear() {
		date = new Date();
		nowYear = date.getFullYear();
		nowYear = (nowYear < 1900 ? (1900 + nowYear) : nowYear);
		return nowYear;
	}
}