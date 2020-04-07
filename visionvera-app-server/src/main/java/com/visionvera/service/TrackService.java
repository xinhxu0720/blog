package com.visionvera.service;


import com.visionvera.vo.Track;

import java.util.List;

public interface TrackService {

    Track findIp(String ip);

    void add(Track track);

    void update(Track track);

    List<Track> getUserEmailAndIp(String email);
}
