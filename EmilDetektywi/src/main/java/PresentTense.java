public class PresentTense {


    String rootVerb;

    //take a regular verb, like hablar, return all six forms of present tense
    // hablo, hablas, habla, hablamos, hablais, hablan
    // rulle is simple, pass in infinitive, remove the "ar" at the end, attach the endings


    public String getRootVerb() {
        return rootVerb;
    }

    public void setRootVerb(String rootVerb) {
        this.rootVerb = rootVerb;
    }

    public String presentRegularAr(String regularVerbInfinitiveA){
        this.rootVerb=regularVerbInfinitiveA.substring(0,regularVerbInfinitiveA.length()-2);
        String firstPerson = rootVerb+"o";
        System.out.println(firstPerson);
        return firstPerson;
    }

//    public PresentTense(String infinitiveVerb) {
//        this.rootVerb = infinitiveVerb.substring(0,infinitiveVerb.length()-2);
//    }
    public PresentTense(){};
}
