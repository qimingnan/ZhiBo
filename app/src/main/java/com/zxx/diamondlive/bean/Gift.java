package com.zxx.diamondlive.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */

public class Gift {

    private List<GiftListBean> giftList;

    public List<GiftListBean> getGiftList() {
        return giftList;
    }

    public void setGiftList(List<GiftListBean> giftList) {
        this.giftList = giftList;
    }

    public static class GiftListBean {
        /**
         * giftName : 000.png
         * giftPic : https://raw.githubusercontent.com/DyncKathline/LiveGiftLayout/master/giftlibrary/src/main/assets/p/000.png
         * giftPrice : 1
         */

        private String giftName;
        private String giftPic;
        private String giftPrice;

        public String getGiftName() {
            return giftName;
        }

        public void setGiftName(String giftName) {
            this.giftName = giftName;
        }

        public String getGiftPic() {
            return giftPic;
        }

        public void setGiftPic(String giftPic) {
            this.giftPic = giftPic;
        }

        public String getGiftPrice() {
            return giftPrice;
        }

        public void setGiftPrice(String giftPrice) {
            this.giftPrice = giftPrice;
        }
    }
}
