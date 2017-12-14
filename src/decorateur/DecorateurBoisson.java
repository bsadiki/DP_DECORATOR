package decorateur;

import dec.Boisson;

/**
 * Created by X-MART on 01-May-17.
 */
public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
