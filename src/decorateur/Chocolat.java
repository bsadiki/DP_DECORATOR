package decorateur;

import dec.Boisson;

/**
 * Created by X-MART on 01-May-17.
 */
public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chocolat";
    }
}
