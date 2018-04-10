package com.bwie.text02.text02;

import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/27.
 */

public class Joke {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-12-27 08:10","title":"2018年AI如何才能更好发展？还需要迈过这五道坎","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/d2a5a871fc684a469a4677274835128920171227081031.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1227/08/D6L9A1JF00097VK4.html"},{"ctime":"2017-12-27 07:56","title":"人工智能芯片创业公司迎来爆发式增长","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/8c880ee8009c4a22b572c3e6a2b95a1220171227075544.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1227/07/D6L8EVT500097VK4.html"},{"ctime":"2017-12-27 07:28","title":"未来AI可能会淘汰180万个工作岗位，你感到恐惧","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/34a0dcacd6334a738410d922e555669e20171227072824.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1227/07/D6L6SEMG00098IEO.html"},{"ctime":"2017-12-27 07:40","title":"2017AI发展回顾：为更快、更强的人工智能奠定基","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/43a08f4ea6164db18e66727a1efd700520171227074200.jpeg?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1227/07/D6L7J0D400097VK4.html"},{"ctime":"2017-12-26 08:53","title":"机器人越来越聪明了，是否应该赋予TA更多的权利","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/151b58bebbd347e695733f62116cc79b20171226085806.jpeg?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1226/08/D6IPBN0U00098IEO.html"},{"ctime":"2017-12-26 09:11","title":"手机的AI之路：从营销噱头到产业变革","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/63f2dd31cc4447ada19b748702b925b820171226090956.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1226/09/D6IQBDUR00098IEO.html"},{"ctime":"2017-12-26 08:41","title":"2018年自动驾驶汽车如何发展？看看国外都做了啥","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/3c5b253e66624513bf5aac2a8341484a20171226084056.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1226/08/D6IOKV2F00098IEO.html"},{"ctime":"2017-12-25 08:26","title":"谷歌AI新技能！它可以知道你是否喜欢一张图像","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/aeba3c73ed74401ea19b13badabce31120171225082331.jpeg?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1225/08/D6G5D44O00098IEO.html"},{"ctime":"2017-12-25 08:22","title":"2018年的智能语音助理有哪些不同？这里有三点预","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/6442bea02776485cacfde4f7adff19d320171225081844.jpeg?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1225/08/D6G55SEB00098IEO.html"},{"ctime":"2017-12-24 10:33","title":"2018年的人工智能将如何发展？看看专家怎么说","description":"网易VR","picUrl":"http://cms-bucket.nosdn.127.net/673bc67ddeea45078a8bfaa7a7c4077f20171224103309.png?imageView&thumbnail=200y140","url":"http://tech.163.com/17/1224/10/D6DQ8VC100098IEO.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-12-27 08:10
         * title : 2018年AI如何才能更好发展？还需要迈过这五道坎
         * description : 网易VR
         * picUrl : http://cms-bucket.nosdn.127.net/d2a5a871fc684a469a4677274835128920171227081031.png?imageView&thumbnail=200y140
         * url : http://tech.163.com/17/1227/08/D6L9A1JF00097VK4.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
