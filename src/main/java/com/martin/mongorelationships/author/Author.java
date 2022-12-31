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
    private Profile profile;

    public Author() {
    }

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author(Long id, String name, Post[] posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
    }

    public Author(Long id, String name, Post[] posts, Profile profile) {
        this.id = id;
        this.name = name;
        this.posts = posts;
        this.profile = profile;
    }
}
