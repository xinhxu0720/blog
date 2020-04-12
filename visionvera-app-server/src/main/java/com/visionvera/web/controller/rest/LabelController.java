package com.visionvera.web.controller.rest;

import com.visionvera.bean.base.BaseReturn;
import com.visionvera.bean.base.ReturnData;
import com.visionvera.service.LabelService;
import com.visionvera.vo.LabelVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/rest/label")
public class LabelController extends BaseReturn {

    @Resource
    LabelService labelService;


    /**
     * 获取标签
     * @param labelId
     * @return
     */
    @RequestMapping(value = "/getLabelList", method = RequestMethod.GET)
    public ReturnData getLabelList(@RequestParam(value = "labelId",required = false)Integer labelId){
        LabelVO labelVO = new LabelVO();
        System.out.println(labelId);
        if (labelId != null){
            labelVO.setId(labelId);
        }
        return labelService.getLabelList(labelVO);
    }

    @RequestMapping(value = "/addLabel", method = RequestMethod.POST)
    public ReturnData addLabel(@RequestBody LabelVO labelVO){
        return labelService.addLabel(labelVO);
    }

    @RequestMapping(value = "/updateLabel", method = RequestMethod.POST)
    public ReturnData updateLabel(@RequestBody LabelVO labelVO){
        return labelService.updateLabel(labelVO);
    }
}
