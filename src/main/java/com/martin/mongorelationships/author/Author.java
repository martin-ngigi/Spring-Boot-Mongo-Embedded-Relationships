package com.martin.mongorelationships.author;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "author")
public class Author {

    //Used to generate Long id type
    public static final String  SEQUENCE_NAME="post_sequence";

    @Id
    private Long id;
    private String name;
    private Post[] posts;

    public Author() {
    }

    public Author(Long id, String name, Post[] posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
    }
}
