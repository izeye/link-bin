package com.izeye.linkbin.core.repository;

import com.izeye.linkbin.core.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by izeye on 15. 12. 6..
 */
@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
}
