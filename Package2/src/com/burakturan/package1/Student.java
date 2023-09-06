package com.burakturan.package1;

import com.burakturan.package2.ICandidateStudent;

public class Student implements ICandidateStudent
{

    @Override
    public void Study()
    {
        System.out.println("I'm studying...");
    }
}
