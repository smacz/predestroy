package com.smacz.predestroy;

import org.springframework.stereotype.Service;

@Service
public class DependServiceImpl implements DependService {
    @Override
    public void stop(Dto dto) {
        System.out.println("Called stop with " + dto.toString());
    }
}
