package hello;

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}







public class helo {
/*
    public static String[] Vehicles={"ambulance","helcopter","lifeboat"};
    public static String[][] drivers=
            {
                    {"fres","Sue","pets"},
                    {"Sue","Richard","Bob","fred"},
                    {"Pete","Mary","Bob"}
            };
*/
static String count(ArrayList mylist){
    int a = 0,b = 0,c = 0;
    for(int i = 0; i < mylist.size(); i++){
        Object element=mylist.get(i);
        if(element instanceof   Student)
        a++;
        if(element instanceof Rockstar)
        b++;
        if(element instanceof   Hacker)
        c++;
    }
    String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
    return ret;
}
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element.toString().equals("###"))//Hints: use instanceof operator
                break;
            if(element instanceof Integer)//Hints: use instanceof operator
                break;
        }
        return it;

    }

    public static void main(String[] args) {

        /*
        Map<String , Set<String>> Personnal =new HashMap<String , Set<String>>();

        for(int i=0;i<Vehicles.length;i++) {
            String VehicLe = Vehicles[i];
            String[] driverlist = drivers[i];

            Set<String> driverset = new LinkedHashSet<String>();

            for (String driver : driverlist) {
                driverset.add(driver);
            }

            Personnal.put(VehicLe, driverset);

        }

        //Display Data in Personnal

        Set<String> driversList =Personnal.get("helcopter");

        for (String driver:driversList) {
            System.out.println(driver);
        }

        //Iterato throgh whole thing

        for(String vehicle:Personnal.keySet())
        {
            System.out.print(vehicle);
            System.out.print(": ");

            Set<String> drivelList =Personnal.get(vehicle);

            for (String driver:drivelList)
            {
                System.out.print(driver);
                System.out.print(" ");

            }
            System.out.println();

        }

*/
/*
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));

        }
        */
/*
    ArrayList mylist = new ArrayList();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
      for(int i = 0;i<n;i++){
        mylist.add(sc.nextInt());
    }

      mylist.add("###");
      for(int i=0;i<m;i++){
        mylist.add(sc.next());
    }

    Iterator it=func(mylist);
      while(it.hasNext()){
        Object element = it.next();
        System.out.println((String)element);
    }


*/

        
    }
}

