/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author knl
 */

@Entity
public class topic {
    
  @Id  
  private  String id;
  private  String name;
//  private  String description;
  
  
  public topic()
  {
      
  }
  public topic (String id, String name )
          
  {
      this.id=id;
      this.name=name;
    //  this.description=description;
      
      
  }
  
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
    
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
  
   /* 
    public String getDescription() {
        return description;
    }
    */

    /**
     * @param description the description to set
     */
  /*  public void setDescription(String description) {
        
     
        this.description = description;
    }
    */
}
