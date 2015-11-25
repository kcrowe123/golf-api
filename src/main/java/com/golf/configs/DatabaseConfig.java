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
  private static String dbDriver;

  /** Static constant for DB_PASSWORD. */
  @Value("${db.password}")
  private String dbPassword;
  
  /** Static constant for DB_URL. */
  @Value("${db.url}")
  private String dbUrl;
  
  /** Static constant for DB_USERNAME. */
  @Value("${db.username}")
  private String dbUsername;
  
  /** Static constant for HIBERNATE_DIALECT. */
  @Value("${hibernate.dialect}")
  private String hibernateDialect;
  
  /** Static constant for HIBERNATE_SHOW_SQL. */
  @Value("${hibernate.show_sql}")
  private String hibernateShowSql;
  
  /** Static constant for HIBERNATE_HBM2DDL_AUTO. */
  @Value("${hibernate.hbm2ddl.auto}")
  private String hibernateHbm2ddlAuto;
  
  /** Static constant for ENTITYMANAGER_PACKAGES_TO_SCAN. */
  @Value("${entitymanager.packagesToScan}")
  private String entityManagerPackagesToScan;
  
  /**
   * Data source.
   *
   * @return  <code>DataSource</code>
   */
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(dbDriver);
    dataSource.setUrl(dbUrl);
    dataSource.setUsername(dbUsername);
    dataSource.setPassword(dbPassword);
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
    sessionFactoryBean.setPackagesToScan(entityManagerPackagesToScan);
    Properties hibernateProperties = new Properties();
    hibernateProperties.put("hibernate.dialect", hibernateDialect);
    hibernateProperties.put("hibernate.show_sql", hibernateShowSql);
    hibernateProperties.put("hibernate.hbm2ddl.auto", hibernateShowSql);
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
