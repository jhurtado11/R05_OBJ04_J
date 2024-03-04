public final class MutableClass {
  private Date date;
 
  public MutableClass(Date d) {
    this.date = d;
  }
 
  public void setDate(Date d) {
    this.date = d;
  }
 
  public Date getDate() {
    return date;
  }
}