package com.martin.mongorelationships.author;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "author") //for embedding the author document
public class Profile {

    private String profile_name ;

    public Profile() {
    }

    public Profile(String profile_name) {
        this.profile_name = profile_name;
    }
}
