package com.sai.LinkedInDesign.search;

import com.sai.LinkedInDesign.org.Company;
import com.sai.LinkedInDesign.org.JobPosting;
import com.sai.LinkedInDesign.user.Member;
import com.sai.LinkedInDesign.user.Person;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Data
public class SearchIndex implements Search {

    private Map<String, List<Member>> member_names;
    private Map<String, Company> company_names;
    private Map<String, JobPosting> jobs;

    @Override
    public List<Member> search_member(String name) {
          return member_names.get(name);
    }

    @Override
    public Company search_company(String name) {
          return company_names.get(name);
    }

    @Override
    public JobPosting search_job(String title) {
         return jobs.get(title);
    }

    public void addMember(Person person) {
        Member member = (Member) person;
        if (member_names.containsKey(person.getName())) {
            member_names.get(member.getName()).add(member);
        } else {
            member_names.put(member.getName(), Arrays.asList(member));
        }
    }

    public void addCompany(Company company) {
    }

    public void addJobPosting(JobPosting jobPosting) {
    }

}




