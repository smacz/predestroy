package com.smacz.predestroy;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Dto {
    @NotBlank(message = "IP must not be blank")
    private String ip;

    @Min(1)
    @Max(65535)
    private int port;

    public Dto(@NotBlank(message = "IP must not be blank") String ip, @Min(1) @Max(65535) int port) {
        this.ip = ip;
        this.port = port;
    }
}
