package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CommentDTO {
    //authorId
    private Integer author;
    private String authorImage;
    private String authorFirstName;
    private Integer createdAt;
    //id for comment
    private Integer pk;
    private String text;

}