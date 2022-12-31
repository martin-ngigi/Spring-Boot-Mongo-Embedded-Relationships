package com.martin.mongorelationships.author;

import com.martin.mongorelationships.service.SequenceGeneratorService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "author") //for embedding the author document
public class Post {

    //Used to generate Long id type
    public static final String  SEQUENCE_NAME="post_sequence";

    @Id
    private String post_name ;

    public Post() {
    }

    public Post( String post_name) {
        this.post_name = post_name;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }
}
