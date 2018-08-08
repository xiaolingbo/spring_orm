package com.dt.xlb.webSer;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public interface SendService {

    public boolean sendOA(@WebParam(name = "param") String param);

    //public boolean sendOrg(OrgEntity org);

}