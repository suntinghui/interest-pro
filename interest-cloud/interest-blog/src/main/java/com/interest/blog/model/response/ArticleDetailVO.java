package com.interest.blog.model.response;

import lombok.Data;

@Data
public class ArticleDetailVO {

    private int id;

    private String title;

    private String content;

    private int clickRate;

    private int commentCount;

    private String createTime;

    private int userId;

    private String userName;

    private String userHeadImg;

}
