/* ===============================================-->
                    등록 버튼 관련 JS
   ===============================================--> */

// 등록 버튼 누를 시, 등록 플래그 ON시키는 함수(등록과 수정을 같은 폼 사용하므로 구별하기 위해)
/*document.getElementById("registerBtn").onclick = function() {
    document.getElementById("registerOrModifyFlag").value = 1;
    if (document.getElementById("prodType") != null) {
        document.getElementById("prodType").value = 1;
    }
    form.action = goUrlXdmForm;
    form.submit();
}*/

$(".item").on("click", function() {
	for (let i = 0; i < document.querySelectorAll(".listItem").length; i++) {
		document.querySelectorAll(".listItem")[i].classList.remove("selectActive");
	}
    $(this).children('.listItem').addClass("selectActive");
});

$("#detailBtn").on("click", function() {
	for (let i = 0; i < document.querySelectorAll(".listItem").length; i++) {
		if(document.querySelectorAll(".listItem")[i].classList.contains("selectActive")) {
			$("#pdorNum").val(document.querySelectorAll(".pdorNum")[i].innerText);
		}
	}
	
	form.action = URL_REGISTER_ORDER_MOBILE_FORM;
	form.method = "post";
	form.submit();
});

$("#listBtn").on("click", function() {
	location = URL_MANUFACTURE_MOBILE_LIST;
});