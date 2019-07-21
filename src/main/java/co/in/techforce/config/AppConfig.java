package co.in.techforce.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { WebSecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { MvcConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}