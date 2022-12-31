package com.martin.mongorelationships.author;

import com.martin.mongorelationships.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/author")
public class AuthorController {
    /**
     * Documentation link -> https://stackoverflow.com/questions/62371473/mongodb-spring-boot-definition-of-a-onetomany-manytoone-relationship
     */

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    private AuthorRepository authorRepository;

    //http://localhost:8080/api/v1/author/create-author
    @PostMapping("/create-author")
    public Author create(@RequestBody Author author){
        author.setId(sequenceGeneratorService.generateSequence(Author.SEQUENCE_NAME));
        return authorRepository.save(author);
    }

}
