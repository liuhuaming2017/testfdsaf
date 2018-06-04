package com.service.testssss.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-04T08:05:57.408Z")

@RestSchema(schemaId = "testssss")
@RequestMapping(path = "/testssss", produces = MediaType.APPLICATION_JSON)
public class TestssssImpl {

    @Autowired
    private TestssssDelegate userTestssssDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestssssDelegate.helloworld(name);
    }

}
