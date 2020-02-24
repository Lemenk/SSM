package top.lemenk.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.exception
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/24 13:02
 * @Description: 异常处理器对象
 */
public class SystemExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param handler
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {

        //获取异常对象
        SystemException se = null;
        if (e instanceof SystemException){
            se = (SystemException)e;
        }else {
            se = new SystemException("系统正在维护，请稍后重试！");
        }
        //创建ModelAndView对象
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMsg",se.getMessage());
        mav.setViewName("error");
        return mav;
    }
}
