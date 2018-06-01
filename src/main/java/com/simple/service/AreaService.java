package com.simple.service;

import com.simple.entity.Area;

import java.util.List;

/**
 * Created by simple on 2018/5/28.
 */
public interface AreaService {
    /**
     * 获取区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 通过区域id获取区域信息
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 增加区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
