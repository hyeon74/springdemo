package com.example.springdemo;

import com.example.enumdemo.EnumDto;
import com.google.gson.JsonObject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.enumdemo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Controller
public class JspController {

    private final AutoTest autotest;

    @Autowired
    public JspController(AutoTest autotest){
        this.autotest = autotest;
    }

    @GetMapping("/index")
    public String index(Model model){
        //System.out.println("index 유입");
        //model.addAttribute("test","test");
        EnumUtil enumUtils = new EnumUtil();

        List<EnumDto> boardTypeList = enumUtils.getEnumList(BoardEnumType.BoardType.class);
        List<EnumDto> divTypeList = enumUtils.getEnumList(BoardEnumType.DivType.class);
        List<EnumDto> useYnList = enumUtils.getEnumList(BoardEnumType.UseYn.class);

        //model.addAttribute("jsonBoardList", new Gson().toJson(boardTypeList)); //제이슨으로 넘겨줘서 사용하기도 하고
        model.addAttribute("boardTypeList", boardTypeList ); // 그냥 코드를 사용하기도 하구
        model.addAttribute("divTypeList", divTypeList );
        model.addAttribute("useYnList", useYnList );


        return "index";
    }

    @RestController
    @RequestMapping("/api")
    public class ApiController {
        @GetMapping("/test")
        public String getTest(){
            return "테스트입니다.";
        }
    }


    @RequestMapping("/test2")
    public String test2(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String username = request.getParameter("username");
        System.out.println("username:" + username);

        request.setAttribute("test", "test" );

        return "test";
    }

    @RequestMapping("/test3")
    public void test3(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String username = request.getParameter("username");
        System.out.println("username:" + username);

        //request.setAttribute("test", "test" );
        response.getWriter().write("ok");

        //return "test";
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test4(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String username = request.getParameter("username");
        String id = request.getParameter("id");
        System.out.println("username:" + username);
        System.out.println("id:" + id);

        JsonObject json = new JsonObject();
        json.addProperty("username", username);
        json.addProperty("id", id);
        //json.add("json", json);

        autotest.TestPrint();

        return json.toString();
        //return "test";

        //request.setAttribute("test", "test" );
        //response.getWriter().write("ok");

        //return "test";
    }

    @GetMapping("/test5")
    @ResponseBody
    public String test5(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String username = request.getParameter("username");
        String id = request.getParameter("id");
        System.out.println("username:" + username);
        System.out.println("id:" + id);

        JsonObject json = new JsonObject();
        json.addProperty("username", username);
        json.addProperty("id", id);
        //json.add("json", json);

        autotest.TestPrint();

        return json.toString();
        //return "test";

        //request.setAttribute("test", "test" );
        //response.getWriter().write("ok");

        //return "test";
    }

    @GetMapping("/test6")
    @ResponseBody
    public HashMap test6(HttpServletRequest request, HttpServletResponse response)throws IOException {

        HashMap<String, String> retMap = new HashMap<>();
        retMap.put("test1","테스트1");
        retMap.put("test2","테스트2");
        retMap.put("test3","테스트3");

        return retMap;

    }

    @GetMapping("/test7")
    @ResponseBody
    public TestVo test7(HttpServletRequest request, HttpServletResponse response)throws IOException {

        TestVo vo = new TestVo();
        vo.setId("아이디");
        vo.setName("네임");

        return vo;

    }

    @Data
    class TestVo{
        private String id;
        private String name;

    }

}
