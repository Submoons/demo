package com.simple.web;

import com.simple.entity.Area;
import com.simple.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by simple on 2018/5/28.
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    /**
     * 区域列表信息
     * @return
     */
    @GetMapping(value = "/listarea")
    private Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> areaList = areaService.getAreaList();
        modelMap.put("areaList", areaList);
        return modelMap;
    }

    /**
     * 通过id获取区域信息
     * @param areaId
     * @return
     */
    @GetMapping(value = "/getareabyid")
    private Map<String, Object> getAreaById(Integer areaId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Area area = areaService.queryAreaById(areaId);
        modelMap.put("area", area);
        return modelMap;
    }

    /**
     * 添加区域信息
     * @param area
     * @return
     */
    @PostMapping(value = "/addarea")
    private Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", areaService.addArea(area));
        return modelMap;
    }

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    @PostMapping(value = "/modifyarea")
    private Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", areaService.modifyArea(area));
        return modelMap;
    }

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    @GetMapping(value = "/removearea")
    private Map<String, Object> removearea(Integer areaId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", areaService.deleteArea(areaId));
        return modelMap;
    }

}
