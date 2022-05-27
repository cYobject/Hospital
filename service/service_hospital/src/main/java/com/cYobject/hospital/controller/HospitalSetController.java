package com.cYobject.hospital.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cYobject.hospital.model.entity.HospitalSet;
import com.cYobject.hospital.service.IHospitalSetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 医院设置表 前端控制器
 * </p>
 *
 * @author author
 * @since 2022-05-23
 */
@RestController
@RequestMapping("/hospital/admin/hospitalSet")
@RequiredArgsConstructor
@Tag(name = "HospitalSetController", description = "医院管理")
public class HospitalSetController {

    /**
     * 服务对象
     */
    private final IHospitalSetService hospitalSetService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param hospitalSet 查询实体
     * @return 所有数据
     */
    @GetMapping("page")
    @Operation(summary = "分页查询")
    public Object selectAll(Page<HospitalSet> page, HospitalSet hospitalSet) {
//        return success(this.hospitalSetService.page(page, new QueryWrapper<>(hospitalSet)));
        return this.hospitalSetService.page(page, new QueryWrapper<>(hospitalSet));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.hospitalSetService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param hospitalSet 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody HospitalSet hospitalSet) {
//        return success(this.hospitalSetService.save(hospitalSet));
//    }

    /**
     * 修改数据
     *
     * @param hospitalSet 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody HospitalSet hospitalSet) {
//        return success(this.hospitalSetService.updateById(hospitalSet));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.hospitalSetService.removeByIds(idList));
//    }
}
