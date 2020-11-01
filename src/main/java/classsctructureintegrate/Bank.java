package classsctructureintegrate;

public class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("111111-000000-111111", "Kis Kálmán", 1000000);
        BankAccount ba2 = new BankAccount("111111-000000-222222", "Nagy Nándor", 1000000);

        //Kis Kálmán befizet a számlájára 200.000 Ft-ot
        ba1.deposit(200000);
        //Kis Kálmán új egyenlegének lekérdezése
        ba1.getInfo();


        //Kis Kálmán kivesz a számlájáról 300.000 Ft-ot
        ba1.withdraw(300000);
        //Kis Kálmán új egyenlegének lekérdezése
        ba1.getInfo();


        //Kis Kálmán átutal Nagy Nándornak 400.000 Ft-ot
        ba1.transfer(ba2, 400000);
        //Kis Kálmán új egyenlegének lekérdezése
        ba1.getInfo();
        //Nagy Nándor új egyenlegének lekérdezése
        ba2.getInfo();

    }
}
