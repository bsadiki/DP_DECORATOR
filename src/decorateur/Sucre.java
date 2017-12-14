package decorateur;


import dec.Boisson;

/**
 * Created by X-MART on 01-May-17.
 */
public class Sucre extends DecorateurBoisson {
    public Sucre(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" sucré";
    }
}
