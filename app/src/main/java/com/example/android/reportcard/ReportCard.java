package com.example.android.reportcard;

/**
 * Created by adama on 03.07.2017.
 */

public class ReportCard {
    private String name;
    private String surname;
    private String group;
    private String mathGrade;
    private String chemistryGrade;
    private String artGrade;

    public ReportCard(String name, String surname, String group) {
        this.name=name;
        this.surname=surname;
        this.group=group;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group=group;
    }

    public String getMathGrade(){
        return mathGrade;
    }

    public void setMathGrade(String grade){
        mathGrade=grade;
    }

    public String getChemistryGrade(){
        return chemistryGrade;
    }

    public void setChemistryGrade(String grade){
        chemistryGrade=grade;
    }

    public String getArtGrade(){
        return artGrade;
    }

    public void setArtGrade(String grade){
        artGrade=grade;
    }

    @Override
        public String toString(){
        return "Student: "+
                getName()+" " + getSurname()+ "," +
                "from the group: " + getGroup()+ "," +
                "Math grade: " + getMathGrade() + "," +
                "Chemistry grade: " + getChemistryGrade() + "," +
                "Art grade: " + getArtGrade();

    }
}
