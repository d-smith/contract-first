package org.ds.demosvc2.controllers;

import org.ds.demosvc2.api.HelloApi;
import org.ds.demosvc2.models.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class DemoApiController implements HelloApi {

    @Override
    public ResponseEntity<Hello> hello() {
        return new ResponseEntity<>(new Hello().text("Hello World!"), HttpStatus.OK);
    }
}