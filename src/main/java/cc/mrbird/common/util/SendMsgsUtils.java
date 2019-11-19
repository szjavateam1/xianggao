package cc.mrbird.common.util;

import cc.mrbird.common.domain.SendSmsIn;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;


import java.net.URLEncoder;
import java.util.List;

public class SendMsgsUtils {




    //普通短信
    public static void sendsms(SendSmsIn smsIn) throws Exception {
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(smsIn.getSendUrl());
        postMethod.getParams().setContentCharset("UTF-8");
        postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler());

        String accesskey = "xxxxxxxxxx"; //用户开发key
        String accessSecret = "yyyyyyyyyy"; //用户开发秘钥
            List<String> mobiles=smsIn.getMobiles();
                    String mobileString=  mobiles.toString();
                           mobileString=mobileString.substring(1,mobileString.length()-1);
        NameValuePair[] data = {
                new NameValuePair("accesskey", smsIn.getAccesskey()),
                new NameValuePair("secret",smsIn.getAccessSecret()),
                new NameValuePair("sign", smsIn.getSign()),
               // new NameValuePair("templateId", "100"),
                new NameValuePair("mobile", mobileString),
                new NameValuePair("content", URLEncoder.encode(smsIn.getSendContent(), "utf-8"))//（示例模板：{1}您好，您的订单于{2}已通过{3}发货，运单号{4}）
        };
        postMethod.setRequestBody(data);
        postMethod.setRequestHeader("Connection", "close");

        int statusCode = httpClient.executeMethod(postMethod);
        System.out.println("statusCode: " + statusCode + ", body: "
                + postMethod.getResponseBodyAsString());
    }


}