package Factory;

public class Drug1 implements Prescription{

    @Override
    public void prescribeMedicine() {
        System.out.println("You need Drug 1.");
    }
}
