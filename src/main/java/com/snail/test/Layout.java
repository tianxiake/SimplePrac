package com.snail.test;

import java.util.List;

public class Layout {

    /**
     * author : zh
     * layouts : [{"title":"通用首页布局","name":"common_index.json","preview":null,"pageType":"index","layoutType":0,"layoutGroup":0,"params":[]},{"title":"title_txt","name":"title_txt.json","preview":"preview/title_txt.png","pageType":"index","layoutType":1,"layoutGroup":1,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"title_img","name":"title_img.json","preview":"preview/title_img.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"导航栏","name":"menu.json","preview":"preview/menu.png","pageType":"index","layoutType":1,"layoutGroup":1,"params":[{"type":"position","name":"nav","title":"导航","value":"","required":false}]},{"title":"bottom1","name":"bottom1.json","preview":"preview/bottom1.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos2","type":"position","value":null}]},{"title":"bottom2","name":"bottom2.json","preview":"preview/bottom2.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos2","type":"position","value":null}]},{"title":"component01","name":"component01.json","preview":"preview/component01.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"component01_1","name":"component01_1.json","preview":"preview/component01_1.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null}]},{"title":"component04_1","name":"component04_1.json","preview":"preview/component04_1.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"component06","name":"component06.json","preview":"preview/component16.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"component09","name":"component09.json","preview":"preview/component09.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null}]},{"title":"component18","name":"component18.json","preview":"preview/component18.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"component19","name":"component19.json","preview":"preview/component19.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null}]},{"title":"component20","name":"component20.json","preview":"preview/component20.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"component21","name":"component21.json","preview":"preview/component21.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"category_pos","title":"category_pos","type":"position","value":null}]},{"title":"component23","name":"component23.json","preview":"preview/component23.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"component25","name":"component25.json","preview":"preview/component25.jpg","pageType":"index","layoutType":1,"layoutGroup":2,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null}]},{"title":"jingpin","name":"jingpin.json","preview":"preview/jingpin.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null},{"name":"pos7","title":"pos7","type":"position","value":null},{"name":"pos8","title":"pos8","type":"position","value":null},{"name":"pos9","title":"pos9","type":"position","value":null},{"name":"pos10","title":"pos10","type":"position","value":null},{"name":"pos11","title":"pos11","type":"position","value":null},{"name":"pos12","title":"pos12","type":"position","value":null}]},{"title":"liveRecommend","name":"liveRecommend.json","preview":"preview/liveRecommend.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"recommend","name":"recommend.json","preview":"preview/recommend.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"top","name":"top.json","preview":"preview/top.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"background","title":"background","type":"position","value":""},{"name":"marquee","title":"marquee","type":"position","value":null},{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"textClock","title":"textClock","type":"position","value":null},{"name":"logo","title":"logo","type":"position","value":null}]},{"title":"livecollection","name":"livecollection.json","preview":"preview/livecollection.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"channel_component1","name":"channel_component1.json","preview":"preview/channel_component1.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"channel_component2","name":"channel_component2.json","preview":"preview/channel_component2.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"movie_index","name":"movie_index.json","preview":"preview/movie_index.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null}]},{"title":"news_index","name":"news_index.json","preview":"preview/news_index.png","pageType":"index","layoutType":1,"layoutGroup":2,"params":[{"name":"recommendPos","title":"recommendPos","type":"position","value":null},{"name":"traillerPos","title":"traillerPos","type":"position","value":null}]},{"title":"sport_index","name":"sport_index.json","preview":"preview/sport_index.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"五导航模板","name":"five_navigation.json","preview":"preview/five_navigation.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"1号推荐位","type":"position","value":null},{"name":"p2","title":"2号推荐位","type":"position","value":null},{"name":"p3","title":"3号推荐位","type":"position","value":null},{"name":"p4","title":"4号推荐位","type":"position","value":null},{"name":"p5","title":"5号推荐位","type":"position","value":null}]},{"title":"四导航模板","name":"four_navigation.json","preview":"preview/four_navigation.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"1号推荐位","type":"position","value":null},{"name":"p2","title":"2号推荐位","type":"position","value":null},{"name":"p3","title":"3号推荐位","type":"position","value":null},{"name":"p4","title":"4号推荐位","type":"position","value":null}]},{"title":"左一大右四小模板","name":"layout1.json","preview":"preview/layout1.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"左大图推荐位","type":"position","value":null},{"name":"p2","title":"右小图一号推荐位","type":"position","value":null},{"name":"p3","title":"右小图二号推荐位","type":"position","value":null},{"name":"p4","title":"右小图三号推荐位","type":"position","value":null},{"name":"p5","title":"右小图四号推荐位","type":"position","value":null}]},{"title":"recommand_1","name":"recommand_1.json","preview":"preview/recommand_1.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"recommand_history_collection","name":"recommand_history_collection.json","preview":"preview/recommand_history_collection.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"lastPlay","title":"lastPlay","type":"position","value":null},{"name":"history_collection","title":"history_collection","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null},{"name":"p4","title":"p4","type":"position","value":null}]},{"title":"六导航模板","name":"six_navigation.json","preview":"preview/six_navigation.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"1号推荐位","type":"position","value":null},{"name":"p2","title":"2号推荐位","type":"position","value":null},{"name":"p3","title":"3号推荐位","type":"position","value":null},{"name":"p4","title":"4号推荐位","type":"position","value":null},{"name":"p5","title":"5号推荐位","type":"position","value":null},{"name":"p6","title":"6号推荐位","type":"position","value":null}]},{"title":"三导航模板","name":"three_navigation.json","preview":"preview/three_navigation.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"1号推荐位","type":"position","value":null},{"name":"p2","title":"2号推荐位","type":"position","value":null},{"name":"p3","title":"3号推荐位","type":"position","value":null}]},{"title":"dianshiju","name":"dianshiju.json","preview":"preview/dianshiju.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"falls002","name":"falls002.json","preview":"preview/falls002.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null}]},{"title":"falls003","name":"falls003.json","preview":"preview/falls003.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"shaoer2","name":"shaoer2.json","preview":"preview/shaoer2.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null}]},{"title":"six_pic","name":"six_pic.json","preview":"preview/six_pic.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"zongyi_zixun","name":"zongyi_zixun.json","preview":"preview/zongyi_zixun.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null}]},{"title":"history_list","name":"history_list.json","preview":"preview/history_list.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"vod_collection_list","name":"vod_collection_list.json","preview":"preview/vod_collection_list.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null}]},{"title":"search_enter","name":"search_enter.json","preview":"preview/search_enter.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null}]},{"title":"layout3","name":"layout3.json","preview":"preview/layout3.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null},{"name":"p4","title":"p4","type":"position","value":null},{"name":"p5","title":"p5","type":"position","value":null},{"name":"p6","title":"p6","type":"position","value":null}]},{"title":"layout2","name":"layout2.json","preview":"preview/layout2.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null},{"name":"p4","title":"p4","type":"position","value":null},{"name":"p5","title":"p5","type":"position","value":null}]},{"title":"layout4","name":"layout4.json","preview":"preview/layout4.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null},{"name":"p4","title":"p4","type":"position","value":null},{"name":"p5","title":"p5","type":"position","value":null}]},{"title":"category","name":"category.json","preview":"preview/category.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"nav","title":"nav","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null},{"name":"pos7","title":"pos7","type":"position","value":null}]},{"title":"top2","name":"top2.json","preview":"preview/top2.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"background","title":"background","type":"position","value":""},{"name":"marquee","title":"marquee","type":"position","value":null},{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"networkDisplay","title":"networkDisplay","type":"position","value":null},{"name":"textClock","title":"textClock","type":"position","value":null},{"name":"logo","title":"logo","type":"position","value":null}]},{"title":"component26","name":"component26.json","preview":"preview/component26.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos0","title":"pos0","type":"position","value":null},{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null},{"name":"pos7","title":"pos7","type":"position","value":null},{"name":"pos8","title":"pos8","type":"position","value":null},{"name":"pos9","title":"pos9","type":"position","value":null},{"name":"pos10","title":"pos10","type":"position","value":null}]},{"title":"component27","name":"component27.json","preview":"preview/component27.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null}]},{"title":"layout5","name":"layout5.json","preview":"preview/layout5.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null}]},{"title":"layout6","name":"layout6.json","preview":"preview/layout6.jpg","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null}]},{"title":"component28","name":"component28.json","preview":"preview/component28.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null}]},{"title":"component29","name":"component29.json","preview":"preview/component29.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"pos1","title":"pos1","type":"position","value":null},{"name":"pos2","title":"pos2","type":"position","value":null},{"name":"pos3","title":"pos3","type":"position","value":null},{"name":"pos4","title":"pos4","type":"position","value":null},{"name":"pos5","title":"pos5","type":"position","value":null},{"name":"pos6","title":"pos6","type":"position","value":null}]},{"title":"layout7","name":"layout7.json","preview":"preview/layout7.png","pageType":"index","layoutType":1,"layoutGroup":0,"params":[{"name":"p1","title":"p1","type":"position","value":null},{"name":"p2","title":"p2","type":"position","value":null},{"name":"p3","title":"p3","type":"position","value":null},{"name":"p4","title":"p4","type":"position","value":null}]}]
     */

    private String author;
    private List<LayoutsBean> layouts;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<LayoutsBean> getLayouts() {
        return layouts;
    }

    public void setLayouts(List<LayoutsBean> layouts) {
        this.layouts = layouts;
    }

    public static class LayoutsBean {
        /**
         * title : 通用首页布局
         * name : common_index.json
         * preview : null
         * pageType : index
         * layoutType : 0
         * layoutGroup : 0
         * params : []
         */

        private String title;
        private String name;
        private Object preview;
        private String pageType;
        private int layoutType;
        private int layoutGroup;
        private List<Params> params;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getPreview() {
            return preview;
        }

        public void setPreview(Object preview) {
            this.preview = preview;
        }

        public String getPageType() {
            return pageType;
        }

        public void setPageType(String pageType) {
            this.pageType = pageType;
        }

        public int getLayoutType() {
            return layoutType;
        }

        public void setLayoutType(int layoutType) {
            this.layoutType = layoutType;
        }

        public int getLayoutGroup() {
            return layoutGroup;
        }

        public void setLayoutGroup(int layoutGroup) {
            this.layoutGroup = layoutGroup;
        }

        public List<Params> getParams() {
            return params;
        }

        public void setParams(List<Params> params) {
            this.params = params;
        }

        public static class Params {
            private String name;
            private String title;
            private String type;
            private String value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}
