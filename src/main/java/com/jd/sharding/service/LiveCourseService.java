package com.jd.sharding.service;


import java.util.List;
import java.util.Map;

import com.jd.sharding.entity.LiveCourse;


public interface LiveCourseService {

    public int insertLiveCourse(LiveCourse liveCourse);

    public List<LiveCourse> getLiveCourseList();

    public LiveCourse getRecentlyLiveCourse();


    public boolean isExistsLiveCourse(Map<String,String> map);

    /**
     * 取得某一天对应的直播课程
     * @return
     */
    public List<LiveCourse> getLiveCourseListForSomeDay(Map<String,String> map);

    /**
     * 根据id获取直播课程
     * @param id
     * @return
     */
    public LiveCourse getLiveCourseById(long id);


    /**
     * 删除直播课程
     * @param id
     * @return
     */
    public int deleteLiveCourseById(long id);

    /**
     * 更新直播课程
     * @param liveCourse
     * @return
     */
    public int updateLiveCourseById(LiveCourse liveCourse);

    /**
     * 根据条件获得直播课程
     * @return
     */
    public List<LiveCourse> getLiveCourseListByCondition(Map<String,String> map);

    /**
     * 判断课程名称是否已经存在
     * @param liveCourse
     * @return
     */
    public int isCourseNameExist(LiveCourse liveCourse);
}
