/* ===============================================-->
                      상품 관련 JS
   ===============================================--> */

/* ===============================================-->
                          Form
   ===============================================--> */

let createFeedInfo = document.getElementById("createFeedInfo");
let createDelBtn = document.getElementById("createDelBtn");

let scaleNameArr = document.getElementById("scaleNameArray");
let scaleCountArr = document.getElementById("scaleCountArray");

var num = 1;

// 사료 가격, 무게, 할인율 추가 버튼
$("#btntemplus").on('click', function() {
  /*validationInit();
  if (!infoValidation()) {
      return false;
  }*/
  let inputGroup = document.createElement('div');
  inputGroup.setAttribute("class", "input-group mb-2");

  let createNum = document.createElement('span');
  createNum.setAttribute("class", "input-group-text fs-11");
  createNum.innerHTML = num;

  let createScale = document.createElement('span');
  createScale.setAttribute("class", "input-group-text fs-11");
  createScale.innerHTML = "저울 이름";

  let createScaleName = document.createElement('input');
  createScaleName.setAttribute("type", "text");
  createScaleName.setAttribute("class", "form-control fs-11 text-right scaleName");
  createScaleName.setAttribute("style", "text-align: right");
  createScaleName.setAttribute("value", $("#product_prdtSeq option:checked").text());
  
  let createCount = document.createElement('span');
  createCount.setAttribute("class", "input-group-text fs-11");
  createCount.innerHTML = "갯수";

  let createInputCount = document.createElement('input');
  createInputCount.setAttribute("type", "text");
  createInputCount.setAttribute("class", "form-control fs-11 scaleCount");
  createInputCount.setAttribute("style", "text-align: right");
  createInputCount.setAttribute("value", $("#pdolQty").val());

  let createDel = document.createElement('button');
  createDel.setAttribute("type", "button");
  createDel.setAttribute("class", "btn btn-outline-danger mb-1 fs-11 ms-2 removeBtn");
  createDel.setAttribute("value", num++);
  createDel.innerHTML = "삭제";

  inputGroup.appendChild(createNum);
  inputGroup.appendChild(createScale);
  inputGroup.appendChild(createScaleName);
  inputGroup.appendChild(createCount);
  inputGroup.appendChild(createInputCount);
  inputGroup.appendChild(createDel);

  document.getElementById("addOrder").appendChild(inputGroup);
  /*scaleName.value = null;
  scaleCount.value = null;*/
});

// 사료 가격, 무게, 할인율 제거 버튼
$(document).on('click', '.removeBtn', function(){
  let parent = $(this).parent();
  parent.remove();
  num--;

  for (let i = 0; i < document.querySelectorAll(".removeBtn").length; i++) {
    document.querySelectorAll(".removeBtn")[i].parentNode.firstChild.innerHTML = i + 1;
  }
});

// 등록 시, 가격, 무게, 할인율 전달하는 함수
scaleInfoSave = function() {
  let scaleNameArray = [];
  let scaleCountArray = [];

  let scaleName = document.querySelectorAll(".scaleName");
  let scaleCount = document.querySelectorAll(".scaleCount");
  
  for (let i = 0; i < scaleName.length; i++) {
    scaleNameArray.push(scaleName[i].value);
    scaleCountArray.push(scaleCount[i].value);
  }
  
  scaleNameArr.value = scaleNameArray;
  scaleCountArr.value = scaleCountArray;
}

// 수정시 초기화하는 함수
initInfo = function() {
  let scaleNameArray = scaleNameArray.value.replace(/\[|\]/g, "").split(',');
  let scaleCountArray = scaleCountArray.value.replace(/\[|\]/g, "").split(',');
  scaleNameArray.value = scaleNameArray;
  scaleCountArray.value = scaleCountArray;
  $("#feedInfoSeqArray").val($("#feedInfoSeqArray").val().replace(/\[|\]/g, "").split(','));

  if (priceArray != "") {
    for (let i = 0; i < priceArray.length; i++) {
      let inputGroup = document.createElement('div');
      inputGroup.setAttribute("class", "input-group mb-2");

      let createNum = document.createElement('span');
      createNum.setAttribute("class", "input-group-text fs-11");
      createNum.innerHTML = num;

      let createScale = document.createElement('span');
      createScale.setAttribute("class", "input-group-text fs-11");
      createScale.innerHTML = "원";

      let createScaleName = document.createElement('input');
      createScaleName.setAttribute("type", "text");
      createScaleName.setAttribute("class", "form-control fs-11 text-right scaleName");
      createScaleName.setAttribute("style", "text-align: right");
      createScaleName.setAttribute("value", scaleNameArray[i]);

      let createCount = document.createElement('span');
      createCount.setAttribute("class", "input-group-text fs-11");
      createCount.innerHTML = "Kg";

      let createInputCount = document.createElement('input');
      createInputCount.setAttribute("type", "text");
      createInputCount.setAttribute("class", "form-control fs-11 scaleCount");
      createInputCount.setAttribute("style", "text-align: right");
      createInputCount.setAttribute("value", scaleCountArray[i]);

      let createDel = document.createElement('button');
      createDel.setAttribute("type", "button");
      createDel.setAttribute("class", "btn btn-outline-danger mb-1 fs-11 ms-2 removeBtn");
      createDel.setAttribute("value", num++);
      createDel.innerHTML = "삭제";

      inputGroup.appendChild(createNum);
      inputGroup.appendChild(createScale);
      inputGroup.appendChild(createScaleName);
      inputGroup.appendChild(createCount);
      inputGroup.appendChild(createInputCount);
      inputGroup.appendChild(createDel);

      createFeedInfo.appendChild(inputGroup);
    }
  } 
}

initInfo();