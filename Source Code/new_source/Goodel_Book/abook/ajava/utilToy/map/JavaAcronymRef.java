package abook.ajava.utilToy.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

/**
 * @version 0.1
 * @author Bambang Hariyanto Keterangan: Diimplementasikan sebagai Singleton
 */
public class JavaAcronymRef {
	// Treemap
	private static TreeMap fContainer = new TreeMap();

	private static JavaAcronymRef fObj = new JavaAcronymRef();

	/** Creates a new instance of CountryDomainNameReferenceGB */
	private JavaAcronymRef() {
		fContainer.put("ACL", "Access Control List");
		fContainer.put("API", "Application Provider Interface");
		fContainer.put("ASP", "Active Server Pages");
		fContainer.put("CIM", "Computer Integrated Manufacturing");
		fContainer.put("CORBA", "Common Object Request Broker Architecture");
		fContainer.put("DNA", "Distributed internet Applications Architecture");
		fContainer.put("DNS", "Domain Name System");
		fContainer.put("EJB", "Enterprise Java Bean");
		fContainer.put("HTML", "Hypertext Markup Language");
		fContainer.put("IDE", "Integrated Development Environment");
		fContainer.put("IDL", "Interface Definition Language");
		fContainer.put("IIOP", "Internet Inter-ORB Protocol");
		fContainer.put("J2EE", "Java 2 Enterprise Edition");
		fContainer.put("JDBC", "Java Database Connectivity");
		fContainer.put("JDK", "Java Development Kit");
		fContainer.put("JMS", "Java Messaging Service");
		fContainer.put("JNDI", "Java Naming and Directory Service");
		fContainer.put("JTA", "Java Transaction API");
		fContainer.put("JTS", "Java Transaction Service");
		fContainer.put("LDAP", "Light Weight Directory Access Protocol");
		fContainer.put("NDS", "Novell directory Service");
		fContainer.put("RAD", "Rapid Application Development");
		fContainer.put("ODBC", "Open Database Connectivity");
		fContainer.put("OMG", "Object Management Group");
		fContainer.put("ORB", "Object Request Broker");
		fContainer.put("OTS", "Object Transaction Service");
		fContainer.put("RMI", "Remote Method Invocation");
		fContainer.put("XML", "Extensible Markup Language");

		fContainer.put("API", "Application Programming Interface");
		fContainer.put("CA", "Certification Authority");
		fContainer.put("CLR", "Common Language Runtime");
		fContainer.put("COM/DCOM", "Component Object Model/Distributed COM");
		fContainer.put("CORBA", "Common Object Request Broker Architecture");
		fContainer.put("DBMS", "Database Management system");
		fContainer.put("DNA", "Distributed interNet Applications Architecture");
		fContainer.put("DNS", "Domain Name System");
		fContainer.put("DO", "Distributed Objects");
		fContainer.put("EJB", "Enterprise JavaBeans");
		fContainer.put("ERP", "Enterprise Resource Planning");
		fContainer.put("GIOP", "General Inter-Orb Protocol");
		fContainer.put("HTTP", "Hyper Text Transfer Protocol");
		fContainer.put("IDL", "Interface Definition Language");
		fContainer.put("IIOP", "Internet Inter-Orb Protocol");
		fContainer.put("J2EE", "Java 2 Enterprise Edition");
		fContainer.put("J2SE", "Java 2 Standard Edition");
		fContainer.put("JMS", "Java Messaging Service");
		fContainer.put("JNDI", "Java Naming and Directory Interface");
		fContainer.put("JSP", "Java Server Pages");
		fContainer.put("JTA", "Java Transaction API");
		fContainer.put("JTS", "Java Transaction Service");
		fContainer.put("JVM", "Java Virtual Machine");
		fContainer.put("MIME", "Multipurpose Internet Mail Extensions");
		fContainer.put("OMG", "Object Management Group");
		fContainer.put("ORB", "Object Request Broker");
		fContainer.put("OTS", "Object Transaction Service");
		fContainer.put("PKI", "Public Key Infrastructure");
		fContainer.put("PUL", "Personuppgiftslagen");
		fContainer.put("QoS", "Quality of Service");
		fContainer.put("RMI", "Remote Method Invocation");
		fContainer.put("RMI-IIOP",
				"Remote Method Invocation-Internet Inter-Orb Protocol");
		fContainer.put("SSL", "Secure Socket Layer");
		fContainer.put("SMTP", "Simple Mail Transfer Protocol");
		fContainer.put("SOAP", "Simple Object Access Protocol");
		fContainer.put("SQL", "Structured Query Language");
		fContainer.put("TLS", "Transport Layer Security");
		fContainer.put("TP-monitor", "Transaction Processing monitor");
		fContainer.put("UML", "Unified Modelling Language");
	}

	public String getAcronym(String code) {
		return (String) fContainer.get(code);
	}

	public void setAcronym(String key, String value) {
		fContainer.put(key, value);
	}

	public static JavaAcronymRef getInstance() {
		return fObj;
	}

	static void demo01() {
		// Memperoleh set dari HashMap
		// Cara lebih baik
		Iterator i = fContainer.entrySet().iterator();

		// Merupakan singkatan dari
		// Set set = fContainer.entrySet();
		// Iterator i = set.iterator();

		// Menampilkan elemen-elemen
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}

	static void demo02() {
		JavaAcronymRef o = JavaAcronymRef.getInstance();
		System.out.println("SMTP = " + o.getAcronym("SMTP"));
	}

	static void demo() {
		demo01();
		demo02();
	}

	public static void main(String[] args) {
		demo();
	}

}
