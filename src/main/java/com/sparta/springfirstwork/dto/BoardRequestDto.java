package com.sparta.springfirstwork.dto;

import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String subject;
    private String username;
    private String contents;
    private String password;
}
