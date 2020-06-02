package top.piao888;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import java.util.EnumSet;

/**
 * Hibernate 注解
 * 类级别注解：
 * 1. @Entity    @Table    @Embeddable
 *
 * 属性级别注解：
 * 1. @Id          @SequenceGenerator      @GeneratedValue     @Column
 * 2. @Embedded   @EmbeddedId              @Lob                @Version
 * 3. @Basic       @Transient
 *
 *  属性级注解 可以写在get方法上，也可以属性上
 */
public class App {

    public static void main( String[] args ) {
//        5.X
        Configuration config=new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory=config.buildSessionFactory();
//        Session session= sessionFactory.openSession();
//        Transaction transaction=session.beginTransaction();

//            SchemaExport export = new SchemaExport(config);
//            export.create(true,true);
        ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().configure().build();
        MetadataImplementor metadataImplementor = (MetadataImplementor) new MetadataSources(serviceRegistry).buildMetadata();
        SchemaExport export = new SchemaExport(serviceRegistry,	metadataImplementor);
        export.create(true,true);

    }
}
