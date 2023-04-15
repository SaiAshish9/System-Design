package com.sai.LinkedInDesign.search;

import com.sai.LinkedInDesign.org.Company;
import com.sai.LinkedInDesign.org.JobPosting;
import com.sai.LinkedInDesign.user.Member;

import java.util.List;

public interface Search {

    List<Member> search_member(String name);
    Company search_company(String name);
    JobPosting search_job(String title);

}
