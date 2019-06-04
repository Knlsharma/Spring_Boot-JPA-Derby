/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.org.topics;

import com.techblog.org.course.corse;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author knl
 */
public interface TopicRepository extends CrudRepository<corse , String>
{
     // same methods implementation
}
