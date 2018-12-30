/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.kubernetes;
import java.util.List;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ConfigMap {

    private String name;
    private List<Items> items;
    private boolean optional;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

    public void setOptional(boolean optional) {
         this.optional = optional;
     }
     public boolean getOptional() {
         return optional;
     }

}