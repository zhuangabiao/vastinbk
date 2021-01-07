package com.vast.base.controller;


import com.vast.base.core.controller.BaseController;
import com.vast.base.core.result.BaseResult;
import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import com.vast.base.units.SystemFinal;
import com.vast.base.units.VerifyUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/vast")
public class LoginController extends BaseController {

    @Autowired
    private IBaseUserService userService;

    @RequestMapping("/login2Page")
    public String login2Page() {
        return "login";
    }

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

    @ResponseBody
    @PostMapping("/login")
    public BaseResult login(HttpServletRequest request, String username, String pwd, String verifyCode) {
        try {
            if(StringUtils.isNoneBlank(username) && StringUtils.isNoneBlank(pwd) && StringUtils.isNoneBlank(verifyCode)) {
                return new BaseResult(HttpServletResponse.SC_NO_CONTENT,"登录信息不完整",null);
            }

            Object code = request.getSession().getAttribute(SystemFinal.KEY_VERIFY_CODE);
            if(code.toString().equals(verifyCode)){
                BaseResult result = userService.login(username,pwd);
                BaseUsers user = (BaseUsers) result.getData();
                request.getSession().setAttribute(SystemFinal.KEY_SESSION,user.getUsername());
                return result;
            }
        }catch (Exception e) {
            logger.error(">>>>>>>>>>>>>>登录异常");
        }
        return new BaseResult(MyResponse.SC_MULTIPLE_CHOICES);
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
