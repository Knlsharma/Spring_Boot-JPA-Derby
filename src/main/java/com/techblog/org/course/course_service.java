/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author knl
 */
 @Service 
public class course_service {
     
     
     @Autowired
     private CorseRepository courserepo;
  
       public List<corse> getAll()
      {
   // return topics;
          List<corse> topics =new ArrayList<>();
        courserepo.findAll().forEach(topics:: add);
          return topics;
 
           }
       
       public Optional<corse> getACourse(String id)
{
       
    //  return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
     return  courserepo.findById(id);
}

   public  void addCourse(corse newtopic1) {
      //  topics.add(newtopic1); 
      
      courserepo.save(newtopic1);
    }

   public void updateCourse(String id, corse newtopic1) {
    courserepo.save(newtopic1);
    }

  

 
      public void deleteACourse(String id) {
   //  topics.removeIf(t ->t.getId().equals(id));
    
      courserepo.deleteById(id);
 
    }
 }