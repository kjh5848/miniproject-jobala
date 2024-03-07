package com.example.jobala.guest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

public class GuestResponse {

    @AllArgsConstructor
    @Data
    public static class SearchDTO {
        private String career;
        private String compLocation;
        private String edu;
        private String salary;
        private String hopeJob;
        private String jobType;
    }

    @Data
    @AllArgsConstructor
    public static class JopOpenApplyDTO {
        private String jobopenTitle;
        private String resumeTitle;
        private String state;
        private String username;
    }
}
