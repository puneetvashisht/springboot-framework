package com.codingapi.springboot.framework.handler;

import com.codingapi.springboot.framework.event.DemoChangeEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoChangeLogHandler extends BaseHandler<DemoChangeEvent>{

    @Override
    public void handler0(DemoChangeEvent event) {
      log.info("print before name :{},current name :{}", event.getBeforeName(),event.getCurrentName());  
    }
    
}
