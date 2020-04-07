package com.visionvera.dao.xinhxu;

import com.visionvera.vo.Track;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrackDao {

    Track find(String ip);

    void add(Track track);

    void update(@Param("track") Track track);

    List<Track> getUserEmailAndIp(@Param("email") String email);
}
