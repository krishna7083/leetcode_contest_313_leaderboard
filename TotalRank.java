package com.hadson.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TotalRank{
    public int contest_id;
    public String username;
    public Object username_color;
    public UserBadge user_badge;
    public String user_slug;
    public String country_code;
    public String country_name;
    public int rank;
    public int score;
    public int finish_time;
    public int global_ranking;
    public String data_region;
}
