package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestContoller {


    @Autowired
    private ReportRemoteService reportRemoteService;

    @RequestMapping("/hello")
    public String hello( Integer userId){


        Integer result = reportRemoteService.test(userId);

        System.out.println("接受到返回值"+result);

        return "接受到返回值";
    }
}
