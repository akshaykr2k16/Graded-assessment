class SuperDepartment
{
  String departmentName ()
  {
    return "Super Department";
  }

  String getTodaysWork ()
  {
    return "No Work as of now";
  }

  String getWorkDeadline ()
  {
    return "Nil";
  }

  String isTodayAHoliday ()
  {
    return "Today is not a holiday";
  }
}

class Admindepartment extends SuperDepartment
{
  String departmentName ()
  {
    return "Admin Department";
  }

  String getTodaysWork ()
  {
    return "Complete your documents Submission";
  }

  String getWorkDeadline ()
  {
    return "Complete by EOD";
  }
}

class Hrdepartment extends SuperDepartment
{
  String departmentName ()
  {
    return "Hr Department";
  }

  String getTodaysWork ()
  {
    return "Fill today's timesheet and mark your attendance";
  }

  String getWorkDeadline ()
  {
    return "Complete by EOD";
  }

  String doActivity ()
  {
    return "team Lunch";
  }
}

class Techdepartment extends SuperDepartment
{
  String departmentName ()
  {
    return "Tech Department";
  }

  String getTodaysWork ()
  {
    return "Complete coding of module 1";
  }

  String getWorkDeadline ()
  {
    return "Complete by EOD";
  }

  String getTechStackInformation ()
  {
    return "core Java";
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Admindepartment a = new Admindepartment ();
      System.out.println ("Welcome to " + a.departmentName ());
      System.out.println (a.getTodaysWork ());
      System.out.println (a.getWorkDeadline ());
      System.out.println (a.isTodayAHoliday ());
      System.out.println ();
    Hrdepartment h = new Hrdepartment ();
      System.out.println ("Welcome to " + h.departmentName ());
      System.out.println (h.doActivity ());
      System.out.println (h.getTodaysWork ());
      System.out.println (h.getWorkDeadline ());
      System.out.println (h.isTodayAHoliday ());
      System.out.println ();
    Techdepartment t = new Techdepartment ();
      System.out.println ("Welcome to " + t.departmentName ());
      System.out.println (t.getTodaysWork ());
      System.out.println (t.getWorkDeadline ());
      System.out.println (t.getTechStackInformation ());
      System.out.println (t.isTodayAHoliday ());
      System.out.println ();
  }
}