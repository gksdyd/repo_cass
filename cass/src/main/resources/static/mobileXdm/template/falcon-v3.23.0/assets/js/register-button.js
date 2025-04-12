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

	if ($("#pdorNum").val() == "") {
		return;
	}
	
	if ($(this).val() == MANUFACTURE) {
		form.action = URL_REGISTER_ORDER_MOBILE_FORM;	
	} else if ($(this).val() == DELIVERY) {
		form.action = URL_DELIVERY_ORDER_MOBILE_FORM;	
	}
	form.method = "post";
	form.submit();
});

$("#listBtn").on("click", function() {
	if ($(this).val() == MANUFACTURE) {
		location = URL_MANUFACTURE_MOBILE_LIST;	
	} else if ($(this).val() == DELIVERY) {
		location = URL_OUTCOM_MOBILE_LIST;	
	}
});

$("#mafaBtn").on("click", function() {
	let value;
	
	for (let i = 0; i < document.querySelectorAll(".listItem").length; i++) {
		if(document.querySelectorAll(".listItem")[i].classList.contains("selectActive")) {
			value = document.querySelectorAll(".pdorNum")[i].innerText;
		}
	}

	if (value == null) {
		return;
	}
	
	$.ajax({
      async: true 
      ,cache: false
      ,type: "post"
      ,url: URL_MANUFACTURE_MOBILE_PROC
      ,data: {"pdorNum" : value}
      ,success: function(response) {
          location.href = URL_MANUFACTURE_MOBILE_LIST;
      }
      ,error : function(jqXHR){
        alert("ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
      }
	});
})

$(".item2").on("click", function() {
	for (let i = 0; i < document.querySelectorAll(".listItem2").length; i++) {
		document.querySelectorAll(".listItem2")[i].classList.remove("selectActive");
	}
    $(this).children('.listItem2').addClass("selectActive");
});

$("#mafaComplateBtn").on("click", function() {
	let value;
	
	for (let i = 0; i < document.querySelectorAll(".listItem2").length; i++) {
		if(document.querySelectorAll(".listItem2")[i].classList.contains("selectActive")) {
			value = document.querySelectorAll(".mafaNum")[i].innerText;
		}
	}
	
	if (value == null) {
		return;
	}

	$.ajax({
      async: true 
      ,cache: false
      ,type: "post"
      ,url: URL_MANUFACTURE_COMPLETE_PROC
      ,data: {"mafaNum" : value}
      ,success: function(response) {
          location.href = URL_MANUFACTURE_MOBILE_LIST;
      }
      ,error : function(jqXHR){
        alert("ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
      }
	});
})

$("#incomeBtn").on("click", function() {
	let mafaNum;
	let mafaTotalQty;
	
	for (let i = 0; i < document.querySelectorAll(".listItem").length; i++) {
		if(document.querySelectorAll(".listItem")[i].classList.contains("selectActive")) {
			mafaNum = document.querySelectorAll(".mafaNum")[i].innerText;
			mafaTotalQty = document.querySelectorAll(".mafaTotalQty")[i].value;
		}
	}
	
	if (mafaNum == null) {
		return;
	}

	$.ajax({
      async: true 
      ,cache: false
      ,type: "post"
      ,url: URL_INCOME_MOBILE_PROC
      ,data: {"mafaNum" : mafaNum, "mafaTotalQty" : mafaTotalQty}
      ,success: function(response) {
          location.href = URL_INCOME_MOBILE_LIST;
      }
      ,error : function(jqXHR){
        alert("ajaxUpdate " + jqXHR.textStatus + " : " + jqXHR.errorThrown);
      }
	});
})