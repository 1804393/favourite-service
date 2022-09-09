package com.stackroute.favouriteservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.favouriteservice.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> 
{
	//List<News> findNewsByLocation(String location);
	//List<News> findByUserId(String userId);
	
	//Optional<News> findByUserIdAndTitle(String userId,String getTitle  );

//	List<News> getNews( );

}
