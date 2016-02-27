package abook.misc.hbnt;

public class Acronym {
	  public Acronym() {
	  }

	  public Acronym(String abbrev, String description) {
	    this.abbrev = abbrev;
	    this.description = description;
	  }

	  private String description;

	  private String abbrev;

	  public static void main(String[] args) {
	    Acronym acronym = new Acronym();
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public void setAbbrev(String abbrev) {
	    this.abbrev = abbrev;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  public Long getId() {
	    return id;
	  }

	  public String getAbbrev() {
	    return abbrev;
	  }

	  public String getDescription() {
	    return description;
	  }

	  private Long id;
	}
