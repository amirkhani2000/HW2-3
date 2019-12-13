package Base;

import java.util.ArrayList;

public class Me {
    public double Average;
    public ArrayList<Term> terms = new ArrayList<>();
    public void showDetailes(){
        for(Term t:this.terms){
            System.out.println("==============="+t.Term);
            for(Lesson l:t.lessons){
                System.out.println(l.Name+" "+l.Score);
            }
        }
    }
    public void ComputeAverage(){
        float sum=0;
        int count=0;
        for(Term t:this.terms){
            for(Lesson l:t.lessons){
                count+=l.unit;
                sum+=l.Score*l.unit;
            }
        }
        this.Average =  sum/count;
    }
}
