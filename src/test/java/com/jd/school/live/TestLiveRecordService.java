package com.jd.school.live;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.sharding.entity.LiveCourse;
import com.jd.sharding.service.LiveCourseService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TestLiveRecordService {
    private static final Log logger = LogFactory.getLog(TestLiveRecordService.class);

    @Autowired
    private LiveCourseService liveCourseService;



    @Test
    public  void test_sayHello() throws Exception {

    	System.out.println("======test_sayHello========");
    }


    @Test
    public  void insertLiveCourse() throws Exception {


        List<LiveCourse> courseList = new ArrayList<LiveCourse>();

        courseList.add(this.createLiveCourse("高效学习1","张三1","2017-04-13 10:00:00","2017-04-13 11:00:00"));
        courseList.add(this.createLiveCourse("高效学习2","张三2","2017-04-13 11:00:00","2017-04-13 12:00:00"));
        courseList.add(this.createLiveCourse("高效学习3","张三3","2017-04-13 14:00:00","2017-04-13 15:00:00"));

        courseList.add(this.createLiveCourse("高效学习4","张三4","2017-04-14 16:00:00","2017-04-13 17:00:00"));
        courseList.add(this.createLiveCourse("高效学习5","张三5","2017-04-15 17:00:00","2017-04-13 18:00:00"));

        courseList.add(this.createLiveCourse("高效学习6","张三6","2017-04-13 16:00:00","2017-04-13 17:00:00"));
        courseList.add(this.createLiveCourse("高效学习7","张三7","2017-04-12 18:00:00","2017-04-12 19:00:00"));
        courseList.add(this.createLiveCourse("高效学习8","张三7","2017-04-12 14:00:00","2017-04-12 15:00:00"));



        try{
            for(LiveCourse lc:courseList){
                int count = liveCourseService.insertLiveCourse(lc);
                System.out.println("==========保存成功============"+count);
            }

        }catch(Exception e){
            System.out.println("==========xxxxxxxxxx============");
            e.printStackTrace();
        }


    }


    private LiveCourse createLiveCourse(String courseName,String teacherName,String startTime,String endTime){
        LiveCourse liveCourse = new LiveCourse();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        liveCourse.setCourseName(courseName);
        try {
            liveCourse.setStartTime(df.parse(startTime));
            liveCourse.setEndTime(df.parse(endTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        liveCourse.setStudyUrl("http://www.baidu.com");
        liveCourse.setTeachUrl("http://www.google.com");
        liveCourse.setTeacherName(teacherName);
        liveCourse.setCourseDesc("如何高效的学习，时间的管理");
        liveCourse.setSource("123");
        liveCourse.setCreateUser("1234");


        return liveCourse;
    }





}
