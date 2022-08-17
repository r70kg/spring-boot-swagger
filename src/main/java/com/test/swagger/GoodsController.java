package com.test.swagger;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // 通过该注解，第一是将GoodsController注册为控制器，可以响应Http请求；第二是可以将控制器中的方法返回值序列化为json格式。
public class GoodsController {
    @Autowired // 自动装配goodsService
    private GoodsService goodsService;
    /**
     * 查询商品信息
     * 1、@GetMapping表示可以使用get方法请求该api
     * 2、"/goods/{id}"表示请求路径为/goods/{id}的形式，其中{id}为占位符
     * 3、@PathVariable("id")表示将占位符{id}的值传递给id
     * 4、也就是说/goods/123请求的话，会将123传递给参数id
     */

    @ApiOperation(value="测试", notes="描述信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "ok",response = GoodsDo.class)
    })
    @GetMapping("/goods/{id}")
    public GoodsDo getOne(@PathVariable("id") long id) {
        System.out.println("测试");
        return goodsService.getGoodsById(id);
    }
}
