/* ===============================================-->
                        상수
   ===============================================--> */
// 공통
const ON = 1;
const OFF = 0;

// 삭제 모달
const DELETE_FLAG = 1;
const UELETE_FLAG = 2;
const SEVERAL_DELETE_FLAG = 3;
const SEVERAL_UELETE_FLAG = 4;

// 로그인관련 경로
const URL_SIGNIN_FORM_XDM = "/mobileXdm/member/LoginMobileForm";
const URL_SIGNIN_PROC_XDM = "/mobileXdm/member/SigninMobileProc";
const URL_SIGNOUT_PROC_XDM = "/mobileXdm/member/SignoutMobileProc";
const URL_INDEX_VIEW_XDM = "/mobileXdm/index/IndexXdmView";

// 상품관련 경로
const URL_PRODUCT_FUNCTION_XDM = "/xdm/product/ProductXdmProc";
const URL_PRODUCT_FUNCTION_BACKUP_XDM = "/xdm/product/ProductBackupXdmProc";
const URL_PRODUCT_XDM_FORM = "/xdm/product/ProductXdmForm";
const URL_PRODUCT_XDM_LIST = "/xdm/product/ProductXdmList";

// 접수 관련 경로
const URL_MANUFACTURE_MOBILE_PROC = "/mobileXdm/manufacture/MafaRegisterProc";
const URL_MANUFACTURE_MOBILE_LIST = "/mobileXdm/manufacture/ManufactureXdmList";
const URL_PRODUCT_MOBILE_LIST = "/mobileXdm/productorder/ProductOrderXdmList";
const URL_MANUFACTURE_COMPLETE_PROC = "/mobileXdm/manufacture/MafaCompleteProc";

// 상세 관련 경로
const URL_REGISTER_ORDER_MOBILE_FORM = "/mobileXdm/productorder/ProductOrderXdmForm";
const URL_DELIVERY_ORDER_MOBILE_FORM = "/mobileXdm/delivery/DeliveryXdmForm";
const DELIVERY = "delivery";
const MANUFACTURE = "manufacture";

// 입고 관련 경로
const URL_INCOME_MOBILE_PROC = "/mobileXdm/income/IncomeXdmProc";
const URL_INCOME_MOBILE_LIST = "/mobileXdm/income/IncomeXdmList";

// 출고 관련 경로
const URL_OUTCOM_MOBILE_LIST = "/mobileXdm/delivery/DeliveryMobileXdmList";
const URL_DELIVERY_MOBILE_PROC = "/mobileXdm/delivery/DeliRegisterProc";

// 정규식 상수
const regex1 = /^[a-z|A-Z|0-9|]+$/;
const regex2 = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|~|/|(-)|,|]+$/;
const regex3 = /^[a-z|A-Z|0-9|~|/|(-)|,|]+$/;
const regex4 = /^[0-9|]+$/;
const regex5 = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|!-/|_|]+$/;
const regexId = /^[a-z]+[a-z0-9]{5,19}$/g;