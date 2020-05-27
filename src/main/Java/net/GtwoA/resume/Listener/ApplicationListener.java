package net.GtwoA.resume.Listener;

import net.GtwoA.resume.Filter.ApplicationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class ApplicationListener implements ServletContextListener  {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Application started!!!!!!!!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("Application destroyed");
    }
}
