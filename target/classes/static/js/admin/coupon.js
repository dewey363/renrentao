//JavaScript代码区域
layui.use(['element', 'upload', 'table', 'layer'], function () {
    var element = layui.element,
        $ = layui.jquery,
        upload = layui.upload,
        layer = layui.layer,
        table = layui.table;
    //loading层
    var index = null;
    //指定允许上传的文件类型
    upload.render({
        elem: '#coupon_xls'
        , url: '/admin/product/import'
        , exts: 'xls|xlsx'
        , accept: 'file' //普通文件
        , before: function () {
            index = layer.load(1, {
                shade: [0.5, '#fff'] //0.1透明度的白色背景
            });
        },
        done: function (res) {
            layer.close(index);
            console.log(res)
        }
    })
    ;


    //第一个实例
    table.render({
        elem: '#product'
        , height: 700
        , url: '/admin/product/findPageList' //数据接口
        , page: true //开启分页
        , limit: 15
        , limits: [15, 30, 45, 60, 75, 90, 100]
        , cols: [[ //表头
            {field: 'productId', title: 'ID', sort: true}
            , {field: 'productName', title: '商品名称'}
            , {
                field: 'productImgAddress',
                title: '商品略缩图',
                templet: '<div><img src="{{d.productImgAddress}}"></div>',
                style: 'height:48px;width:48px;line-height:48px!important;'
            }
            , {field: 'productCategory', title: '商品分类'}
            , {field: 'productPrice', title: '商品原价格', sort: true}
            , {field: 'productCouponPrice', title: '商品优惠价格', sort: true}
            , {field: 'productSellerWangwang', title: '商品店铺名'}
            , {field: 'discountCouponSum', title: '优惠卷详情', sort: true}
            , {field: 'productRate', title: '佣金（单位：%）', sort: true}
            , {field: 'discountCouponStartTime', title: '开始日期', sort: true}
            , {field: 'discountCouponOverTime', title: '结束日期', sort: true}
        ]]
    });

});