/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.topics;

import com.techblog.org.course.corse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techblog.org.course.CorseRepository;

/**
 *
 * @author knl
 */
 @Service 
public class topic_service {
     
     
     @Autowired
     private TopicRepository topicrepo;
  
       public List<topic> getAll()
      {
   // return topics;
          List<topic> topics =new ArrayList<>();
        topicrepo.findAll().forEach(topics:: add);
          return topics;
          
          
          
           }
       
       public topic getATopic(String id)
{
       
    //  return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
     return  topicrepo.findById(id);
}

   public  void addTopic(topic newtopic1) {
      //  topics.add(newtopic1); 
      
      topicrepo.save(newtopic1);
    }

    void updateTopic(String id, topic newtopic1) {
    topicrepo.save(newtopic1);
    }

      public void deleteATopic(String id) {
   //  topics.removeIf(t ->t.getId().equals(id));
    
      topicrepo.deleteById(id);
 
    }
 }