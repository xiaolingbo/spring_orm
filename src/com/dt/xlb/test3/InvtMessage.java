package com.dt.xlb.test3;

import java.util.List;

/**
 * Created by lb.xiao on 2018/7/31.
 */
public class InvtMessage {
    InvtHeadType invtHeadType;
    List<InvtListType> invtListTypeList;

    public InvtHeadType getInvtHeadType() {
        return invtHeadType;
    }

    public void setInvtHeadType(InvtHeadType invtHeadType) {
        this.invtHeadType = invtHeadType;
    }

    public List<InvtListType> getInvtListTypeList() {
        return invtListTypeList;
    }

    public void setInvtListTypeList(List<InvtListType> invtListTypeList) {
        this.invtListTypeList = invtListTypeList;
    }
}
