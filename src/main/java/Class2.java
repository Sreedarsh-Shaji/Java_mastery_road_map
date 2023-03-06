public class Class2 {
    public static void main(String[] args) {
        SomeClass<Integer> obj1 = new SomeClass();
        obj1.setCandidateA(200);
        obj1.getTypeOfCandidateA();

        SomeClass<SomeDummyClass> obj2 = new SomeClass();
        obj2.setCandidateA(new SomeDummyClass());
        obj2.getTypeOfCandidateA();

        //This wont work as interface
        SomeClass<SomeDummyInterface> obj3 = new SomeClass();

        SomeClass obj4 = new SomeClass();
        obj4.setCandidateA(new NullPointerException("There"));
        obj4.getTypeOfCandidateA();

    }

}

class SomeClass<A>{
    private A candidateA;


    public void getTypeOfCandidateA() {
        System.out.println(this.candidateA.getClass().getSimpleName());
    }

    public void setCandidateA(A candidateA) {
        this.candidateA = candidateA;
    }
}

class SomeDummyClass{}
interface SomeDummyInterface{}
