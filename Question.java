package com.hadson.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question{
    public int id;
    public int question_id;
    public int credit;
    public String title;
    public String title_slug;
}