package decorateur;

import dec.Boisson;

/**
 * Created by X-MART on 01-May-17.
 */
public class Lait extends DecorateurBoisson {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }

}
