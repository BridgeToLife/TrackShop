package com.ilya.web.shop.repository;

import com.ilya.web.shop.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {
}
