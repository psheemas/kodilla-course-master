package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkToCheckTestSuite {
    @Test
    public void testUpdate() {
        //Given
        KodillaStudent backEndKodillaStudentCourseHomework = new BackEndKodillaStudentCourse();
        KodillaStudent frontEndKodillaStudentCourseHomework = new FrontEndKodillaStudentCourse();
        KodillaMentor firstMentor = new KodillaMentor("First Mentor");
        KodillaMentor secondMentor = new KodillaMentor("Second Mentor");

        backEndKodillaStudentCourseHomework.registerObserver(firstMentor);
        frontEndKodillaStudentCourseHomework.registerObserver(secondMentor);
        frontEndKodillaStudentCourseHomework.registerObserver(secondMentor);
        //When

        backEndKodillaStudentCourseHomework.addHomeworkToCheck("Homework to check from first student");
        backEndKodillaStudentCourseHomework.addHomeworkToCheck("Homework to check from second student");
        backEndKodillaStudentCourseHomework.addHomeworkToCheck("Old homework to check");

        frontEndKodillaStudentCourseHomework.addHomeworkToCheck("frontend from first student");
        frontEndKodillaStudentCourseHomework.addHomeworkToCheck("frontend from second student");

        //Then

        assertEquals(3, firstMentor.getUpdateCount());
        assertEquals(4, secondMentor.getUpdateCount());

    }
}
