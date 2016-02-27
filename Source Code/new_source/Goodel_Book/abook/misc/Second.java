package abook.misc;

public class Second {
	  public Second() {
	    valid = false;
	  }

	  /**
	   * Second
	   *
	   * @param seconds long
	   */
	  public Second(long seconds) {
	    this.seconds = seconds;
	    computeFields();
	    valid = true;
	  }


	  public static void main(String[] args) {
	    demo01();
	    // demo02();
	  }


	  /**
	   * demo01
	   */
	  public static void demo01() {
	    System.out.println("Demo 01");
	    System.out.println(new Second(0));
	    System.out.println(new Second(10));
	    System.out.println(new Second(100));
	    System.out.println(new Second(1000));
	    System.out.println(new Second(10000));
	    System.out.println(new Second(100000));
	    System.out.println(new Second(1000000));
	    System.out.println(new Second(10000000));
	    System.out.println(new Second(100000000));
	    System.out.println(new Second(1000000000));
	    System.out.println(new Second(10000000000L));
	    System.out.println(new Second(100000000000L));
	    System.out.println(new Second(1000000000000L));
	    System.out.println(new Second(10000000000000L));
	    System.out.println(new Second(100000000000000L));
	    System.out.println(new Second(1000000000000000L));
	    System.out.println(new Second(10000000000000000L));
	    System.out.println(new Second(100000000000000000L));
	    System.out.println(new Second(1000000000000000000L));
	  }

	  public static void demo02() {
	    System.out.println("Demo 02");
	    Second second = new Second();
	    try {
	      second.inputHourMinuteSecond(0, 0, 0);
	      System.out.println(second);

	      second.inputHourMinuteSecond(0, 0, 10);
	      System.out.println(second);

	      second.inputHourMinuteSecond(0, 1, 40);
	      System.out.println(second);

	      second.inputHourMinuteSecond(0, 16, 40);
	      System.out.println(second);

	      second.inputHourMinuteSecond(2, 46, 40);
	      System.out.println(second);
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	    System.out.println("Akhir Demo 02");
	  }

	  public void setSeconds(long seconds) {
	    this.seconds = seconds;
	    computeFields();
	    valid = true;
	  }

	  public long getSeconds() {
	    return seconds;
	  }

	  public long getHour() {
	    return hour;
	  }

	  public long getMinute() {
	    return minute;
	  }

	  public long getSecond() {
	    return second;
	  }

	  public boolean isValid() {
	    return valid;
	  }

	  /**
	   * toString
	   */
	  public String toString() {
	    String str = "";
	    if (valid) {
	        str = seconds+" detik = " + day + " hari " +hour+" jam "+minute+" menit "+second+" detik";
	    }
	    return str;
	  }

	  private long seconds = 0;
	  private long day;
	  private long hour;
	  private long minute;
	  private long second;
	  private boolean valid;

	  /**
	   * computeFields
	   */
	  private void computeFields() {
	    long t = seconds;
	    day = t / (3600 * 24);
	    t -= day * (3600 * 24);
	    hour = t / 3600;
	    t -= hour * 3600;
	    minute = t / 60;
	    t -= minute * 60;
	    second = t;
	  }

	  /**
	   * inputHourMinuteSecond
	   *
	   * @param hour long
	   * @param minute long
	   * @param second long
	   */
	  public void inputHourMinuteSecond(long hour, long minute, long second) throws IllegalArgumentException{
	    valid = false;
	    this.hour = hour;
	    if (minute < 0 || minute >59)
	      throw new IllegalArgumentException();
	    else this.minute = minute;

	    if (second < 0 || minute >59)
	      throw new IllegalArgumentException();
	    else this.second = second;

	    seconds = hour*3600 + minute*60 + second;
	    valid = true;

	  }

	public long getDay() {
		return day;
	}
	}
