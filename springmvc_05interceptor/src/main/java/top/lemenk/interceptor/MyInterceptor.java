package top.lemenk.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.interceptor
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/24 14:20
 * @Description: 自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 预处理，在controller方法执行前执行。
     *      return true：放行，执行下一个拦截器，如果没有下一个拦截器则执行controller方法
     *      return false：不放行。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor执行了...预处理");
        //请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        return true;
    }

    /**
     * 后处理方法：controller方法执行后，success.jsp执行之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor执行了...后处理");
    }

    /**
     * 最终处理：在success.jsp页面执行后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor执行了...后处理");
    }
}
