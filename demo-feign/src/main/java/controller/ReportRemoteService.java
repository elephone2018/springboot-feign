package controller;


import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.stereotype.Component;



@Headers({"Content-Type: application/json","Accept: application/json"})
public interface ReportRemoteService {


    /**
     * test
     * @return
     */
    @RequestLine("POST /hello?userId={userId}")
    Integer test(@Param(value = "userId") Integer userId);
}
