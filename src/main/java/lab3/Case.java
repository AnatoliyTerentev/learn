package lab3;

public class Case {
    private final String formCase;
    private String modelCase;

    public Case(String formCase, String modelCase) {
        this.formCase = formCase;
        this.modelCase = modelCase;

    }

    public String getFormCase() {
        return formCase;
    }

    public String getModelCase() {
        return modelCase;
    }

    public void setModelCase(String modelCase) {
        this.modelCase = modelCase;
    }

    @Override
    public String toString(){
        return "Case:" + modelCase + ", FF:"+ formCase;

    }

}
