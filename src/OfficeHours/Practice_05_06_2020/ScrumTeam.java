package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
    /*create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp
    Attribute:
      ArrayList<Tester>
      ArrayList<Developer>

    Actions:
      hireTester(Tester tester); given tester must be added in arraylist of tester
      fireTester(ID); // whichever testers ID match with the argument, tester will be removed from the arraylist of tester
     */


    ArrayList<Tester>testersTeam = new ArrayList<>();
    ArrayList<Developer>developersTeam = new ArrayList<>();


    public void hireATester(Tester tester){
        testersTeam.add(tester); // yeni hire yapilan tester testerTeame ekleniyor
    }

    public void fireATester(long ID){ // her calisanin ID num unique old icin ID sorduk
        testersTeam.removeIf(p->p.employeeID == ID);
    }

    public void hireADeveloper(Developer developer){
        developersTeam.add(developer);
    }

    public void fireADeveloper(long ID){
        developersTeam.removeIf(p->p.employeeID == ID);
    }

    public String toString(){
        return "Scrum teams are "+testersTeam+"\n and "+developersTeam;
    }



}
