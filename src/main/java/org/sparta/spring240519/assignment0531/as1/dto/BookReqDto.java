package org.sparta.spring240519.assignment0531.as1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookReqDto {

    private String title;
    private String author;
    private Boolean available;

}
