package com.smacz.predestroy;

import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service
public class DependServiceImpl implements DependService {
    @Override
    public void stop(@Valid Dto dto) {
        System.out.println("Called stop with " + dto.toString());
    }
}
