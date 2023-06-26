package com.sparta.springfirstwork.dto;

import com.sparta.springfirstwork.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class BoardResponseDto {
    private Long id;
    private String subject;
    private String username;
    private String contents;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.subject=board.getSubject();
        this.username=board.getUsername();
        this.contents=board.getContents();
        this.password=board.getPassword();
        this.createdAt=board.getCreatedAt();
        this.modifiedAt=board.getModifiedAt();
    }
}