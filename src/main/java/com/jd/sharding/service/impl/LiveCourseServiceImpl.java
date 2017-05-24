package com.jd.sharding.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.sharding.entity.LiveCourse;
import com.jd.sharding.mapper.LiveCourseMapper;
import com.jd.sharding.service.LiveCourseService;


@Service("liveCourseService")
public class LiveCourseServiceImpl implements LiveCourseService {

    @Autowired
    private LiveCourseMapper liveCourseDao;

    public int insertLiveCourse(LiveCourse liveCourse) {
        return liveCourseDao.insertLiveCourse(liveCourse);
    }

    public List<LiveCourse> getLiveCourseList() {
        return liveCourseDao.getLiveCourseList();
    }

    public LiveCourse getRecentlyLiveCourse() {
        return liveCourseDao.getRecentlyLiveCourse();
    }

  
    /**
     * 取得某一天对应的直播课程
     * @return
     */
    public List<LiveCourse> getLiveCourseListForSomeDay(Map<String,String> map){
        return liveCourseDao.getLiveCourseListForSomeDay(map);
    }

   

    public int deleteLiveCourseById(long id) {
        return liveCourseDao.deleteLiveCourseById(id);
    }

    public int updateLiveCourseById(LiveCourse liveCourse) {
        return liveCourseDao.updateLiveCourseById(liveCourse);
    }

    public List<LiveCourse> getLiveCourseListByCondition(Map<String, String> map) {


        List<LiveCourse> liveCourseList =  liveCourseDao.getLiveCourseListByCondition(map);

        if(liveCourseList==null)return new ArrayList<LiveCourse>();


        return liveCourseList;
    }

    public int isCourseNameExist(LiveCourse liveCourse) {
        return liveCourseDao.isCourseNameExist(liveCourse);
    }

	public boolean isExistsLiveCourse(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}

	public LiveCourse getLiveCourseById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
