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
public class MatchFields {

    private String key;
    private String operator;
    private List<String> values;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setOperator(String operator) {
         this.operator = operator;
     }
     public String getOperator() {
         return operator;
     }

    public void setValues(List<String> values) {
         this.values = values;
     }
     public List<String> getValues() {
         return values;
     }

}