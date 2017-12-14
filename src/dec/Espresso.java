package dec;

/**
 * Created by X-MART on 01-May-17.
 */
public class Espresso extends Boisson{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cout() {
        return 7;
    }
}
