package tw.edu.ntut.csie.app01_105590028;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
    public String getSuggestion(int score){
        String grade="等第 : ";
        if(score>100){
            grade+="X";
        }
        else if(score<=100&&score>=90){
            grade+="A";
        }
        else if(score<=89&&score>=80){
            grade+="B";
        }
        else if(score<=79&&score>=70){
            grade+="C";
        }
        else if(score<=69&&score>=60){
            grade+="D";
        }
        else if(score<=59&&score>=0){
            grade+="F";
        }
        else if(score<0){
            grade+="X";
        }
        return grade;
    }

}
