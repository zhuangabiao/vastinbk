package com.vast.base.controller;


import com.vast.base.core.controller.BaseController;
import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import com.vast.base.units.SystemFinal;
import com.vast.base.units.TokenUtil;
import com.vast.base.units.VerifyUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.*;

@Controller
@RequestMapping("/vast")
@Api(value = "登录相关", tags = "video")
public class LoginController extends BaseController {

    @Autowired
    private IBaseUserService userService;

    @RequestMapping("/login2Page")
    public String login2Page() {
        return "login";
    }

    @ApiOperation(value = "验证码获取", notes = "验证码获取")
    @RequestMapping("/verifyCode")
    @ResponseBody
    public void verifyCode(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            String verifyCode = VerifyUtil.outputVerifyImage(160,40,response.getOutputStream(),4);
            session.setAttribute(SystemFinal.KEY_VERIFY_CODE,verifyCode);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @ApiOperation(value = "登录", notes = "登录接口")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, String username, String pwd,
                        String verifyCode, ModelAndView model) {
        try {
            if(StringUtils.isBlank(username) || StringUtils.isBlank(pwd) || StringUtils.isBlank(verifyCode)) {
                model.addObject("data",new BaseResult(HttpServletResponse.SC_NO_CONTENT,"登录信息不完整",null));
                response.sendRedirect("/vast/login2Page");
            }

            Object code = request.getSession().getAttribute(SystemFinal.KEY_VERIFY_CODE);
            if(code.toString().equals(verifyCode.toUpperCase())){
                BaseResult result = userService.login(username,pwd);
                BaseUsers user = (BaseUsers) result.getData();
                Cookie cookie = new Cookie(SystemFinal.KEY_AUTHOR_TOKEN, TokenUtil.getToken(user));
                response.addCookie(cookie);
                request.getSession().setAttribute(SystemFinal.KEY_SESSION,user.getUsername());
                return "home";
            }
        }catch (Exception e) {
            logger.error(">>>>>>>>>>>>>>登录异常" + e.getMessage());
        }
        return "login";
    }

    @RequestMapping("/loginPage")
    public String loginPage() {

        return "login1";
    }

    @RequestMapping("/index")
    public String index() {

        return "index";
    }



    @RequestMapping("/validate")
    @ResponseBody
    public String validate() {
        return "sd9W";
    }
}
