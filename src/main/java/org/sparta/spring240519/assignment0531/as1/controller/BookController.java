package org.sparta.spring240519.assignment0531.as1.controller;

import org.sparta.spring240519.assignment0531.as1.dto.BookDto;
import org.sparta.spring240519.assignment0531.as1.dto.BookReqDto;
import org.sparta.spring240519.assignment0531.as1.dto.BookResDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private final Map<Integer, BookDto> bookList = new HashMap<>();

    Integer bookId = 0;

    @GetMapping("")
    public List<BookResDto> getBooks() {

        return bookList.values().stream().map(BookResDto::new).toList();

    }

    @GetMapping("/{bookId}")
    public BookResDto getBook(@PathVariable Integer bookId) {

        return new BookResDto(findBookById(bookId));
    }

    @PostMapping("")
    public BookResDto addBook(@RequestBody BookReqDto bookReqDto) {
        BookDto bookDto = new BookDto(bookId, bookReqDto);
        bookList.put(bookDto.getId(), bookDto);
        this.bookId += 1;
        return new BookResDto(bookDto);
    }

    @PutMapping("/{bookId}")
    public BookResDto updateBook(@PathVariable Integer bookId, @RequestBody BookReqDto bookReqDto) {
        BookDto bookDto = findBookById(bookId);
        bookDto.update(bookReqDto);
        return new BookResDto(bookDto);
    }

    @DeleteMapping("/{bookId}")
    public String Delete(@PathVariable Integer bookId) {
        findBookById(bookId);
        bookList.remove(bookId);
        return "삭제 완료";
    }

    public BookDto findBookById(Integer bookId) {
        if (bookList.containsKey(bookId)) {
            return bookList.get(bookId);
        }
        throw new IllegalArgumentException("없음");
    }

}
