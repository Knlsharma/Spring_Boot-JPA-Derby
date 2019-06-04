/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.topics;

import com.techblog.org.course.corse;
import com.techblog.org.course.course_service;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author knl
 */
@RestController
public class controller_topic {
    
@Autowired  
private  topic_service topicService ;  
    
 @RequestMapping("/topics")
public List<topic> getAllTopic()
{
    return topicService.getAll();
    
}

 @RequestMapping("/topics/{id}")
public topic getATopic(@PathVariable String id)
{
  return topicService.getATopic(id);
    
}

@RequestMapping(method=RequestMethod.POST , value = "/topics")
public void addTopic(@RequestBody topic newtopic1)
{
    topicService.addTopic(newtopic1);
}

@RequestMapping(method=RequestMethod.PUT , value = "/topics/{id}")
public void updateTopic(@RequestBody topic newtopic1,@PathVariable String id)
{
    topicService.updateTopic(id , newtopic1);
}

 @RequestMapping(method=RequestMethod.DELETE , value = "/topics/{id}")
public void deleteATopic(@PathVariable String id)
{
          topicService.deleteATopic(id);
    
}



}