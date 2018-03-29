package cn.dlbdata.dangjian.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.dlb.bim.web.ResultUtil;
import cn.dlbdata.ad.model2.PUser;
import cn.dlbdata.ad.model2.PUserExample;
import cn.dlbdata.ad.service.PUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/puser")

public class PUserController{

    @Autowired
    private PUserService pUserService;


    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> save(PUser pUser){
        ResultUtil result = new ResultUtil();
        int callbackId = pUserService.insert(pUser);
        result.setData(callbackId);
        result.setSuccess(true);
        return result.getResult();
    }

    @RequestMapping(value="/getList",method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getList(Integer pageNum, Integer pageSize){
        ResultUtil result = new ResultUtil();
        List<PUser> pUserList = pUserService.selectByExample(new PUserExample());
        result.setSuccess(true);
        result.setData(pUserList);
        return result.getResult();
    }

    @RequestMapping(value="/list",method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> list(Integer pageNum, Integer pageSize){
        ResultUtil result = new ResultUtil();
        PageHelper.startPage(pageNum, pageSize,true);
        List<PUser> pUserList = pUserService.selectByExample(new PUserExample());
        PageInfo<PUser> p=new PageInfo<PUser>(pUserList);
        result.setSuccess(true);
        result.setData(p);
        return result.getResult();
    }

    @RequestMapping(value="/deleteById",method=RequestMethod.DELETE)
    @ResponseBody
    public Map<String, Object> deleteById(Integer userid){
        ResultUtil result = new ResultUtil();
        PUserExample example = new PUserExample();
        if(pUserService.deleteByPrimaryKey(userid)>0){
            result.setSuccess(true);
            result.setMsg("删除成功");
        }else{
            result.setMsg("删除失败");
            result.setSuccess(false);
        }
        return result.getResult();
    }


    @RequestMapping(value="/updateById",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateById(PUser pUser){
        ResultUtil result = new ResultUtil();
        if(pUserService.updateByPrimaryKey(pUser)>0){
            result.setSuccess(true);
            result.setMsg("修改成功");
        }else{
            result.setSuccess(false);
            result.setMsg("修改失败");
        }
        return result.getResult();
    }

    @RequestMapping(value="/queryById",method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> queryById(Integer userid){
        ResultUtil result = new ResultUtil();
        PUser pUser = pUserService.selectByPrimaryKey(userid);
        result.setSuccess(true);
        result.setData(pUser);
        return result.getResult();
    }
}