package com.example.springdemo;

import com.example.enumdemo.EnumDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.enumdemo.*;

import java.util.List;

@Controller
public class JspController {
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
}
