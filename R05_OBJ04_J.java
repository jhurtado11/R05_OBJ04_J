public final class MutableClass { // Copy constructor
  private final Date date;
 
  public MutableClass(MutableClass mc)  {
    this.date = new Date(mc.date.getTime());
  }
 
  public MutableClass(Date d) {
    this.date = new Date(d.getTime());  // Make defensive copy
  }
 
  public Date getDate() {
    return (Date) date.clone(); // Copy and return
  }
}
