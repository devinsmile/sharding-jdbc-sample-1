package com.jd.sharding.mapper;


import java.util.List;
import java.util.Map;

import com.jd.sharding.entity.LiveCourse;

public interface LiveCourseMapper{


    public int insertLiveCourse(LiveCourse liveCourse);


    /**
     * 取得直播课程列表，内网，外网 直播列表
     * @return
     */
    public List<LiveCourse> getLiveCourseList();

    /**
     * 取得最近直播课程，首页直播倒计时
     * @return
     */
    public LiveCourse getRecentlyLiveCourse();


    /**
     * 根据日期判断是否存在直播课程
     * @param map
     * @return
     */
    public int isExistsLiveCourse(Map<String,String> map);


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


    public int isCourseNameExist(LiveCourse liveCourse);
}
