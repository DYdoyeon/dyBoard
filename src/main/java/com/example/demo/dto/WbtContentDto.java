package com.example.demo.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity(name="WBT_CONTENT")
@AllArgsConstructor
@NoArgsConstructor
public class WbtContentDto {

    @Id
    @GeneratedValue
    Long cn_no;
    String title;
    String content;
    String writer;
    String write_date;
}
