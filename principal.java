public class principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "ALICE",null);
    
        Pessoa p2 = new Pessoa(2, "BOB",null);
    
        Pessoa p3 = new Pessoa(3, "DAN",null);

        Pessoa p4 = new Pessoa(4, "EVE",null);

        Pessoa p5 = new Pessoa(5, "CHARLIE",null);

        //AMigos da alice: BOB, DAN, EVE
        Pessoa[] amigosAlice = {p2,p3};

        //Amigos da ALice
        p1.setAmigos(amigosAlice);

        //AMIGOS DO BOB: EVE, CHARLIE
        Pessoa[] amigosBob = {p4,p5};
        //Amigos do Bob
        p2.setAmigos(amigosBob);

        //Deve retornar charlie
        p1.recomendarAmigos(2, p2);
    }
}

