package steffon.io.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Descripition" ),
                new Topic("java", "Core Java", "Core Java Descripition" ),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
