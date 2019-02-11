package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XMLPersonDAO;

public class SpringIn5StepsXMLContextApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml"); // defining an XML Application Context via this method.

		logger.info("Beans Loaded -> {} ", (Object) applicationContext.getBeanDefinitionNames());

		XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);

		logger.info("{} {}", personDao, personDao.getXMLJdbcConnection());

		applicationContext.close();

	}

}
