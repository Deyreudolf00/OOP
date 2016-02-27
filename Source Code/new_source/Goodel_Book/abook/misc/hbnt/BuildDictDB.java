package abook.misc.hbnt;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.jgreenpearl.zzz._hibernate._build.BuildTables;

public class BuildDictDB {
  public static void main(String[] args) {
    // prepare();
    // populate();
    // listing();
    // stop();
  }

  private static void prepare() {
    BuildTables.config("trade2.cfg.postgresql_create.xml");
    ss = BuildTables.currentSession();
  }

  private static void stop() {
    if (tx != null) {
      tx.commit();
    }
    if (ss != null) {
      ss.close();
      ss = null;
    }
  }

  private static void populate() {
    Transaction tx = ss.beginTransaction();
    populateAcronym();
    tx.commit();
  }

  private static void populateAcronym() {

    ss.save(new Acronym("ACL", "Access Control List"));
    ss.save(new Acronym("API", "Application Provider Interface"));
    ss.save(new Acronym("ASP", "Active Server Pages"));
    ss.save(new Acronym("CIM", "Computer Integrated Manufacturing"));
    ss.save(new Acronym("CORBA", "Common Object Request Broker Architecture"));
    ss.save(new Acronym("DNA", "Distributed internet Applications Architecture"));
    ss.save(new Acronym("DNS", "Domain Name System"));
    ss.save(new Acronym("EJB", "Enterprise Java Bean"));
    ss.save(new Acronym("HTML", "Hypertext Markup Language"));
    ss.save(new Acronym("IDE", "Integrated Development Environment"));
    ss.save(new Acronym("IDL", "Interface Definition Language"));
    ss.save(new Acronym("IIOP", "Internet Inter-ORB Protocol"));
    ss.save(new Acronym("J2EE", "Java 2 Enterprise Edition"));
    ss.save(new Acronym("JDBC", "Java Database Connectivity"));
    ss.save(new Acronym("JDK", "Java Development Kit"));
    ss.save(new Acronym("JMS", "Java Messaging Service"));
    ss.save(new Acronym("JNDI", "Java Naming and Directory Service"));
    ss.save(new Acronym("JTA", "Java Transaction API"));
    ss.save(new Acronym("JTS", "Java Transaction Service"));
    ss.save(new Acronym("LDAP", "Light Weight Directory Access Protocol"));
    ss.save(new Acronym("NDS", "Novell directory Service"));
    ss.save(new Acronym("RAD", "Rapid Application Development"));
    ss.save(new Acronym("ODBC", "Open Database Connectivity"));
    ss.save(new Acronym("OMG", "Object Management Group"));
    ss.save(new Acronym("ORB", "Object Request Broker"));
    ss.save(new Acronym("OTS", "Object Transaction Service"));
    ss.save(new Acronym("RMI", "Remote Method Invocation"));
    ss.save(new Acronym("XML", "Extensible Markup Language"));

    ss.save(new Acronym("API", "Application Programming Interface"));
    ss.save(new Acronym("CA", "Certification Authority"));
    ss.save(new Acronym("CLR", "Common Language Runtime"));
    ss.save(new Acronym("COM/DCOM", "Component Object Model/Distributed COM"));
    ss.save(new Acronym("CORBA", "Common Object Request Broker Architecture"));
    ss.save(new Acronym("DBMS", "Database Management system"));
    ss.save(new Acronym("DNA", "Distributed interNet Applications Architecture"));
    ss.save(new Acronym("DNS", "Domain Name System"));
    ss.save(new Acronym("DO", "Distributed Objects"));
    ss.save(new Acronym("EJB", "Enterprise JavaBeans"));
    ss.save(new Acronym("ERP", "Enterprise Resource Planning"));
    ss.save(new Acronym("GIOP", "General Inter-Orb Protocol"));
    ss.save(new Acronym("HTTP", "Hyper Text Transfer Protocol"));
    ss.save(new Acronym("IDL", "Interface Definition Language"));
    ss.save(new Acronym("IIOP", "Internet Inter-Orb Protocol"));
    ss.save(new Acronym("J2EE", "Java 2 Enterprise Edition"));
    ss.save(new Acronym("J2SE", "Java 2 Standard Edition"));
    ss.save(new Acronym("JMS", "Java Messaging Service"));
    ss.save(new Acronym("JNDI", "Java Naming and Directory Interface"));
    ss.save(new Acronym("JSP", "Java Server Pages"));
    ss.save(new Acronym("JTA", "Java Transaction API"));
    ss.save(new Acronym("JTS", "Java Transaction Service"));
    ss.save(new Acronym("JVM", "Java Virtual Machine"));
    ss.save(new Acronym("MIME", "Multipurpose Internet Mail Extensions"));
    ss.save(new Acronym("OMG", "Object Management Group"));
    ss.save(new Acronym("ORB", "Object Request Broker"));
    ss.save(new Acronym("OTS", "Object Transaction Service"));
    ss.save(new Acronym("PKI", "Public Key Infrastructure"));
    ss.save(new Acronym("PUL", "Personuppgiftslagen"));
    ss.save(new Acronym("QoS", "Quality of Service"));
    ss.save(new Acronym("RMI", "Remote Method Invocation"));
    ss.save(new Acronym("RMI-IIOP",
                        "Remote Method Invocation-Internet Inter-Orb Protocol"));
    ss.save(new Acronym("SSL", "Secure Socket Layer"));
    ss.save(new Acronym("SMTP", "Simple Mail Transfer Protocol"));
    ss.save(new Acronym("SOAP", "Simple Object Access Protocol"));
    ss.save(new Acronym("SQL", "Structured Query Language"));
    ss.save(new Acronym("TLS", "Transport Layer Security"));
    ss.save(new Acronym("TP-monitor", "Transaction Processing monitor"));
    ss.save(new Acronym("UML", "Unified Modelling Language"));
  }

  private static void listing() {

  }

  private static void listObject() {
  }

  private static Session ss = null;
  private static Transaction tx = null;

}
