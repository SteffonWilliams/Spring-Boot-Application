package steffon.io.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
   private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Descripition" ),
                new Topic("java", "Core Java", "Core Java Descripition" ),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );


   public List<Topic> getAllTopics(){
       return topics;
   }

   public Topic getTopic(String id){
      return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
   }
}
