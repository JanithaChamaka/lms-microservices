package com.lms.course.Services;

import com.lms.course.Model.Course;

import java.util.List;

public interface CourseService {

    public Course createCourse(Course course);

    public Course getCourseById(Long id);

    public Course updateCourse(Long id, Course courseDetails);

    public void deleteCourse(Long id);

    public List<Course> getAllCourses();
}
