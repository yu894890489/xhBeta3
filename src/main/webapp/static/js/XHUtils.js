(function($) {
    //全局系统对象
    window['XHUtils'] = {};
    XHUtils.SESSION_NAME = "xhSession";



    /**
     * 获取SeSSIOn
     * @return {[type]} [description]
     */
    XHUtils.getSession = function() {
            return getCookie(XHUtils.SESSION_NAME)
        }
        /**
         * 设置Session
         * @param {[type]} sessionId [description]
         */
    XHUtils.setSession = function(sessionId) {
            setCookie(XHUtils.SESSION_NAME, sessionId);
        }
        /**
         * 删除Session
         * @return {[type]} [description]
         */
    XHUtils.delSession = function() {
        delCookie(XHUtils.SESSION_NAME);
    }
    /**
     * 公共数据，先加Session，后续不断扩展
     * @return {[type]} [description]
     */
    XHUtils.getCommData = function() {
            var data = {
                session: XHUtils.isEmpty(XHUtils.getSession()) ? "" : XHUtils.getSession()
            };
            return data;
        }
        /**
         * 判断是否为空
         */
    XHUtils.isEmpty = function(value, allowEmptyString) {
        return (value === null) || (value === undefined) || (!allowEmptyString ? value === '' : false) || ($.isArray(value) && value.length === 0);
    };
    /**
     * 共同ajax调用
     * @param config 是一个自定义对象属性有
     * config.data:提交参数信息
     * config.url:请交路径
     * config.callBackFun:回调函数
     * config.async : true|false 默认为false，是同步模式，true 表示异步加载
     */
    XHUtils.ajax = function(config) {
        var btn = config.btn;
        if (config.url) {
            config.url += (config.url.indexOf("?") != -1 ? "&" : "?") + "_dc=" + $.now();
        }
        if (typeof(config.data) == "string") {
            $.extend(JSON.parse(config.data), )
        }
        $.extends(config.data, {});
        $.ajax($.extend({
            async: config.async || false,
            cache: false,
            type: "POST",
            dataType: "json",
            contentType: "application/json",
            timeout: 300000,
            url: "",
            data: {},
            success: function(data) {
                //如果失败显示失败信息
                if (!XHUtils.isEmpty(data) && data.result == 6) {
                    store.clear();
                    window.top.location.href = XHUtils.ROOTURL + "/login.html";
                }
                var fn = function(data) {};
                if (config.callBackFun) { //如果有回调函数
                    fn = function(rs) {
                        config.callBackFun(rs);
                    };
                }
                fn(data);
            },
            error: function(r, m, d) { // 请求失败处理函数
                if (config.errorCallback && config.errorCallback !== null) {
                    config.errorCallback(r, m, d);
                } else {
                    XHUtils.ajaxError(r, m, d);
                }
            }
        }, config));
    };

    /**
     * Ajax 调用失败时的处理
     * @param r
     * @param m
     * @param d
     */
    XHUtils.ajaxError = function(r, m, d) {
        if (r.readyState == 4 && r.status == 200) {
            alert("向服务器发送请求失败，失败的原因是:<br>" + d.message);
        } else {
            alert("向服务器发送请求无响应！");
        }
    };



    /**
     * 获取Cookie
     * @param  {[type]} name [description]
     * @return {[type]}      [description]
     */
    var getCookie = function(name) {
        var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
        if (arr = document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }
    var setCookie = function(name, value) {
        var Days = 30;
        var exp = new Date();
        exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
        document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
    }

    var delCookie = function delCookie(name) {
        var exp = new Date();
        exp.setTime(exp.getTime() - 1);
        var cval = getCookie(name);
        if (cval != null)
            document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
    }

})(jQuery);