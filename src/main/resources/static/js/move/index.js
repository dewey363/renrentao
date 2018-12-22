$(function () {

    //	初始化
    init();
    //	数据初始化
    data(true, 1);


});

//遮罩
function hide() {
    $("#preloader").show();
    $("#status").show();
}

//去掉遮罩
function slow() {
    $("#status").fadeOut();
    $("#preloader").delay(100).fadeOut("slow");
}

/**
 * 初始化
 */
function init() {
    $(".mall_list a").click(function () {
        var index = layer.open({
            type: 1,
            title: false,
            closeBtn: false,
            shadeClose: false,
            offset: '25%',
            content: "<div class='no_login_show'><h1>亲！您还没登录一起惠哦！</h1><a href='login.html'>马上登录</a><a href='register.html'>免费注册</a><a href='#'>先购物，再返利</a><a href='javascript:layer.closeAll();'>取消</a></div>"
        });
    });
    $("#msg_bijia").click(function () {
        layer.tips('请耐心等待一下，我们正在拼命开发中···', '#msg_bijia');
    });

    //返回顶部
    $(window).scroll(function () {
        var scrollHeight = $(document).height();
        var scrollTop = $(window).scrollTop();
        var $windowHeight = $(window).innerHeight();
        scrollTop > 75 ? $(".gotop").fadeIn(200).css("display", "block") : $(".gotop").fadeOut(200).css({
            "background-image": "url(images/iconfont-fanhuidingbu.png)"
        });
    });
    $('.backtop').click(function (e) {
        $(".gotop").css({
            "background-image": "url(images/iconfont-fanhuidingbu_up.png)"
        });
        e.preventDefault();
        $('html,body').animate({
            scrollTop: 0
        });
    });

}

/**
 * 加载按钮
 */
function loadMore(addTo) {
    if (addTo != null) {this.addTo = addTo;};
    data();
}


/**
 * 数据加载
 * @param {Boolean} addTo  true 追加
 */
var page = 0;
var size = 30;
var addTo = false;
var type = 1;

function data() {
    hide()
    $.get("move/product/list?type=" + type + "&page=" + page + "&size=" + size, function (result) {
        if (result.code == 0) {
            if (!addTo){
            //    不追加
                $(".baoliao_list").empty();
            }
            //    加载成功
            result.data.forEach(function (val, index) {
                var itemHtml = "<a href=\""+val.productDiscountCouponAddress+"\">" +
                    "<div class=\"baoliao_content\"><div class=\"bl_img\">" +
                    "<img src=\"" + val.productImgAddress + "\" /></div>" +
                    "<div class=\"bl_right\">" +
                    "<div class=\"bl_title\">" + val.productName + "</div>" +
                    "<div class=\"bl_note\">" + val.discountCouponSum + "</div>" +
                    "<div class=\"bl_tag\">" +
                    "<div class=\"bl_price\">￥" + val.productCouponPrice + "</div>" +
                    "<div class=\"bl_oprice\">￥" + val.productPrice + "</div>" +
                    "<div class=\"bl_time\">" + val.discountCouponStartTime.split(" ")[0] + "</div>" +
                    "<div class=\"bl_mall\">" + val.platform + "</div></div></div></div></a>";
                $(".baoliao_list").append(itemHtml);
            });
        } else {
            //    失败
        }
        page += 1;
        slow();
    });


}

