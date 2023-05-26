package Tutorial.Interface;

public class Child implements Mother,Father {

    @Override
    public void eyeColor() {
        // TODO Auto-generated method stub
        System.out.println("You got your eyes from your father");
        
    }

    @Override
    public void height() {
        // TODO Auto-generated method stub
        System.out.println("You are tall like your father");
        
    }

    @Override
    public void hairColor() {
        System.out.println("You are blond like your mother");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void curlyHair() {
        System.out.println("You got your curly hair from your mother");
        // TODO Auto-generated method stub
        
    }
    
}
