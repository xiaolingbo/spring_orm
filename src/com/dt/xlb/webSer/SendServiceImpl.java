package com.dt.xlb.webSer;

import javax.jws.WebService;

/**
 * Created by lb.xiao on 2018/8/6.
 */
@WebService(endpointInterface="com.hwt.pdmp.testWeb.SendService",serviceName="sendService")

public class SendServiceImpl implements SendService{

    public boolean sendOA(String param) {

        System.out.println("-------sendOA---------param:"+param);

        if(param.equals("zhoujian")){

            return true;

        }

        return false;

    }

//    public boolean sendOrg(OrgEntity org) {
//
//        System.out.println("-------sendOrg--begin-------");
//
//        return true;
//
//    }

}