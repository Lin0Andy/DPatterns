package Factory;

public class Drug2 implements Prescription{

    @Override
    public void prescribeMedicine() {
        System.out.println("You need Drug 2.");
    }
}
