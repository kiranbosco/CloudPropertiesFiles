package com.properties.CloudPropertiesFiles;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {
  
  @RequestMapping(value="/hello",method=RequestMethod.GET)
  public String wishToAll(){
  return "Good to All"}
  
// Comment
}
