package org.sparta.spring240519.assignment0531.as1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookDto {

    private Integer id;
    private String title;
    private String author;
    private boolean available;



    public BookDto(Integer bookid, BookReqDto bookReqDto) {
        this.id = bookid;
        this.title = bookReqDto.getTitle();
                this.author = bookReqDto.getAuthor();
                this.available = bookReqDto.getAvailable();
    }

    public void update(BookReqDto bookReqDto) {
        this.title = bookReqDto.getTitle();
        this.author = bookReqDto.getAuthor();
        this.available = bookReqDto.getAvailable();
    }
}
