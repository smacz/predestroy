package com.smacz.predestroy;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
@RequiredArgsConstructor
public class PreServDestroy implements ApplicationListener<ApplicationReadyEvent>  {

    private final DependService dependService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
        Dto dto = new Dto("1.2.3.4", 801);
        dependService.stop(dto);
        System.out.println("Destroy done");
    }
}
