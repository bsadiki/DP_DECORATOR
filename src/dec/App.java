package dec;

import decorateur.Chocolat;
import decorateur.Lait;
import decorateur.Sucre;

/**
 * Created by X-MART on 01-May-17.
 */
public class App {
    public static void main(String[] args) {
        Boisson b=new Espresso();
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("-------");
        b=new Lait(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("-------");
        b=new Chocolat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("-------");
        b=new Chocolat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("-------");
        b=new Sucre(b);
        b=new Deca();
        b=new Chocolat(b);
    }
}
