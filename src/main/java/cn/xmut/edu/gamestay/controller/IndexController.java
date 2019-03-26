package cn.xmut.edu.gamestay.controller;

import cn.xmut.edu.gamestay.dao.*;
import cn.xmut.edu.gamestay.pojo.vo.ResultVO;
import cn.xmut.edu.gamestay.pojo.vo.SuccessVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "主模块")
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private BlockItemMapper blockItemMapper;
    @Autowired
    private BlockStickersMapper blockStickersMapper;
    @Autowired
    private CharactersItemMapper charactersItemMapper;
    @Autowired
    private GameMapper gameMapper;
    @Autowired
    private NewsContentMapper newsContentMapper;
    @Autowired
    private NewsItemMapper newsItemMapper;
    @Autowired
    private StickersContentMapper stickersContentMapper;

    @ApiOperation(value = "账户", httpMethod = "Get")
    @GetMapping("/getAccount")
    public ResultVO getAccount() {
        return new SuccessVO<>(accountMapper.selectAll(), "");
    }

    @ApiOperation(value = "贴吧", httpMethod = "Get")
    @GetMapping("/getBlockStickersMapper")
    public ResultVO getBlockStickersMapper() {
        return new SuccessVO<>(blockStickersMapper.selectAll(), "");
    }

    @GetMapping("/getBlockItem")
    public ResultVO getBlockItem() {
        return new SuccessVO<>(blockItemMapper.selectAll(), "");
    }

    @GetMapping("/getCharactersItemMapper")
    public ResultVO getCharactersItemMapper() {
        return new SuccessVO<>(charactersItemMapper.selectAll(), "");
    }

    @GetMapping("/getGameMapper")
    public ResultVO getGameMapper() {
        return new SuccessVO<>(gameMapper.selectAll(), "");
    }

    @GetMapping("/getNewsItemMapper")
    public ResultVO getNewsItemMapper() {
        return new SuccessVO<>(newsItemMapper.selectAll(), "");
    }

    @GetMapping("/getNewsContentMapper")
    public ResultVO getNewsContentMapper() {
        return new SuccessVO<>(newsContentMapper.selectAll(), "");
    }

    @GetMapping("/getStickersContentMapper")
    public ResultVO getStickersContentMapper() {
        return new SuccessVO<>(stickersContentMapper.selectAll(), "");
    }
}
