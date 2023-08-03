package me.woohyeji.springbootdeveloper.repository;

import me.woohyeji.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
