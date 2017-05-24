package com.jd.sharding.entity;


import java.util.Date;


public class LiveCourse{

    private String courseName;
    private Date startTime;
    private Date endTime;
    private String studyUrl;
    private String teachUrl;
    private String source;
    private String teacherName;
    private String courseDesc;


    private String timeRange;
    private String webCastId;  //直播id
    
	private Long id;
	private Date createTime;
	private Date updateTime;
	private String createUser;
	private String updateUser;
	private Integer yn;
	
	

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getYn() {
		return yn;
	}

	public void setYn(Integer yn) {
		this.yn = yn;
	}

	public String getWebCastId() {
        return webCastId;
    }

    public void setWebCastId(String webCastId) {
        this.webCastId = webCastId;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStudyUrl() {
        return studyUrl;
    }

    public void setStudyUrl(String studyUrl) {
        this.studyUrl = studyUrl;
    }

    public String getTeachUrl() {
        return teachUrl;
    }

    public void setTeachUrl(String teachUrl) {
        this.teachUrl = teachUrl;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    @Override
    public String toString() {
        return "LiveCourse{" +
                "courseName='" + courseName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", studyUrl='" + studyUrl + '\'' +
                ", teachUrl='" + teachUrl + '\'' +
                ", source='" + source + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", timeRange='" + timeRange + '\'' +
                '}';
    }
}
