package com.smacz.predestroy;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

@Validated
public interface DependService {
    void stop(@Valid Dto dto);
}
