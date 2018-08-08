package com.dt.xlb.test3;

import java.util.List;

/**
 * Created by lb.xiao on 2018/7/31.
 */
public class ExchangeData {
    InvtMessage invtMessage;
    DecContainers decContainers;
    DecLicenseDocus decLicenseDocus;

    public DecLicenseDocus getDecLicenseDocus() {
        return decLicenseDocus;
    }

    public void setDecLicenseDocus(DecLicenseDocus decLicenseDocus) {
        this.decLicenseDocus = decLicenseDocus;
    }

    public InvtMessage getInvtMessage() {
        return invtMessage;
    }

    public void setInvtMessage(InvtMessage invtMessage) {
        this.invtMessage = invtMessage;
    }

    public DecContainers getDecContainers() {
        return decContainers;
    }

    public void setDecContainers(DecContainers decContainers) {
        this.decContainers = decContainers;
    }
}
