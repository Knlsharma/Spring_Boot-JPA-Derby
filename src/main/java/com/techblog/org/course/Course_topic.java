/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.course;

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
public class Course_topic {
    
@Autowired  
private  course_service topicService ;  
    
 @RequestMapping("/topics")
public List<corse> getAllTopic()
{
    return topicService.getAll();
    
}

 @RequestMapping("/topics/{id}")
public Optional<corse> getATopic(@PathVariable String id)
{
  return topicService.getACourse(id);
    
}

@RequestMapping(method=RequestMethod.POST , value = "/topics")
public void addTopic(@RequestBody corse newtopic1)
{
    topicService.addCourse(newtopic1);
}

@RequestMapping(method=RequestMethod.PUT , value = "/topics/{id}")
public void updateTopic(@RequestBody corse newtopic1,@PathVariable String id)
{
    topicService.updateCourse(id , newtopic1);
}

 @RequestMapping(method=RequestMethod.DELETE , value = "/topics/{id}")
public void deleteATopic(@PathVariable String id)
{
          topicService.deleteACourse(id);
    
}



}