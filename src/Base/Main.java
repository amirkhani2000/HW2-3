package Base;

public class Main {

    public static void main(String[] args) {
        Me me = new Me();

        Term term1 = new Term(1);
        term1.lessons.add(new Lesson("math1",14,3));
        term1.lessons.add(new Lesson("fizik1",15,3));
        term1.lessons.add(new Lesson("mabani",11,3));
        term1.lessons.add(new Lesson("tarikh",16,2));

        Term term2 = new Term(2);
        term2.lessons.add(new Lesson("math2",16,3));
        term2.lessons.add(new Lesson("fizik2",15,3));
        term2.lessons.add(new Lesson("mabani1",14,3));
        term2.lessons.add(new Lesson("zaban1",12,3));

        Term term3 = new Term(3);
        term3.lessons.add(new Lesson("Gossaste",13,3));
        term3.lessons.add(new Lesson("pisrafte",14,3));
        term3.lessons.add(new Lesson("sakhtemandade",17,3));
        term3.lessons.add(new Lesson("zaban2",19,3));

        me.terms.add(term1);
        me.terms.add(term2);
        me.terms.add(term3);


        me.showDetailes();


        me.ComputeAverage();
        System.out.println("================");
        System.out.println("myAverage:"+me.Average);
    }
}
