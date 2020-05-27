package net.GtwoA.resume.Filter;

import net.GtwoA.resume.Controller.SearchController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "*/")
public class ApplicationFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationFilter.class);

    public void init(FilterConfig config) throws ServletException {

    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        LOGGER.debug("Before url processing: ()", request.getRequestURI());
        chain.doFilter(request, resp);
        LOGGER.debug("After processing: {}", request.getRequestURI());

    }

    public void destroy() {
    }


}
