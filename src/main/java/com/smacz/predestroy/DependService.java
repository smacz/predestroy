package com.smacz.predestroy;

import org.springframework.validation.annotation.Validated;

@Validated
public interface DependService {

    public void stop(Dto dto);
}
