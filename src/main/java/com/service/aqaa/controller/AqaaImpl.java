package com.service.aqaa.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-08T08:18:36.103Z")

@RestSchema(schemaId = "aqaa")
@RequestMapping(path = "/aqaa", produces = MediaType.APPLICATION_JSON)
public class AqaaImpl {

    @Autowired
    private AqaaDelegate userAqaaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userAqaaDelegate.helloworld(name);
    }

}
