package com.golf.configs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseConfig.
 *
 * @author Keith  DatabaseConfig class.
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

  /** Static constant for DB_DRIVER. */
  @Value("${db.driver}")
  private String DB_DRIVER;

  /** Static constant for DB_PASSWORD. */
  @Value("${db.password}")
  private String DB_PASSWORD;
  
  /** Static constant for DB_URL. */
  @Value("${db.url}")
  private String DB_URL;
  
  /** Static constant for DB_USERNAME. */
  @Value("${db.username}")
  private String DB_USERNAME;
  
  /** Static constant for HIBERNATE_DIALECT. */
  @Value("${hibernate.dialect}")
  private String HIBERNATE_DIALECT;
  
  /** Static constant for HIBERNATE_SHOW_SQL. */
  @Value("${hibernate.show_sql}")
  private String HIBERNATE_SHOW_SQL;
  
  /** Static constant for HIBERNATE_HBM2DDL_AUTO. */
  @Value("${hibernate.hbm2ddl.auto}")
  private String HIBERNATE_HBM2DDL_AUTO;
  
  /** Static constant for ENTITYMANAGER_PACKAGES_TO_SCAN. */
  @Value("${entitymanager.packagesToScan}")
  private String ENTITYMANAGER_PACKAGES_TO_SCAN;
  
  /**
   * Data source.
   *
   * @return  <code>DataSource</code>
   */
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(DB_DRIVER);
    dataSource.setUrl(DB_URL);
    dataSource.setUsername(DB_USERNAME);
    dataSource.setPassword(DB_PASSWORD);
    return dataSource;
  }
  
  /**
   * Session factory.
   *
   * @return  <code>LocalSessionFactoryBean</code>
   */
  @Bean
  public LocalSessionFactoryBean sessionFactory() {
    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();

    sessionFactoryBean.setDataSource(dataSource());
    sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
    Properties hibernateProperties = new Properties();
    hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
    hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
    hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
    sessionFactoryBean.setHibernateProperties(hibernateProperties);
    
    return sessionFactoryBean;
  }
  
  /**
   * Transaction manager.
   *
   * @return  <code>HibernateTransactionManager</code>
   */
  @Bean
  public HibernateTransactionManager transactionManager() {
    HibernateTransactionManager transactionManager = 
        new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactory().getObject());
    return transactionManager;
  }

} // class DatabaseConfig
