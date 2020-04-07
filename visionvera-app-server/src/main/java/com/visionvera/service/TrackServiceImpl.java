package com.visionvera.service;

import com.visionvera.dao.xinhxu.TrackDao;
import com.visionvera.vo.Track;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional()
public class TrackServiceImpl implements TrackService{

    @Resource
    TrackDao trackDao;


    @Override
    public Track findIp(String ip) {
        return trackDao.find(ip);
    }

    @Override
    public void add(Track track) {
        trackDao.add(track);
    }

    @Override
    public void update(Track track) {
        trackDao.update(track);
    }

    @Override
    public List<Track> getUserEmailAndIp(String email) {
        return trackDao.getUserEmailAndIp(email);
    }
}
