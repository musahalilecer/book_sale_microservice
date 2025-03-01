package com.musahalilecer.bookservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {
    private Long id;
    private String title;
    private String page;
    private String language;
    private Long price;

    private Integer authorId;
    private Set<Integer> genreIds;

    private Set<String> authorName;
    private Set<String> genres;

}
