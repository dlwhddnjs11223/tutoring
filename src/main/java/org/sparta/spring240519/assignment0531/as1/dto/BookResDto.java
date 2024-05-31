package org.sparta.spring240519.assignment0531.as1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class BookResDto {

    private Integer id;
    private String title;
    private String author;
    private Boolean available;



    public BookResDto(BookDto bookdto) {
        this.id = bookdto.getId();
        this.title = bookdto.getTitle();
        this.author = bookdto.getAuthor();
        this.available = bookdto.isAvailable();
    }


}
