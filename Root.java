package com.hadson.model.response;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Root{
    public double time;
    public boolean is_past;
    public ArrayList<Submission> submissions;
    public ArrayList<Question> questions;
    public ArrayList<TotalRank> total_rank;
    public int user_num;
}
