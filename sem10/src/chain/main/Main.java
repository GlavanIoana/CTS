package chain.main;

import chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorTelefon=new NotificareTelefon();
        Notificator notificatorEmail=new NotificareEmail();
        Notificator notificatorManager=new NotificareManager();

//        notificatorTelefon.setSuccesor(notificatorEmail);
//        notificatorEmail.setSuccesor(notificatorManager);

        notificatorEmail.setSuccesor(notificatorTelefon);
        notificatorTelefon.setSuccesor(notificatorManager);

        Client client1 = new Client("Ana", "mailana@gmail.com", "0722");
        Client client2 = new Client("Maria", "mailmaria@gmail.com", null);
        Client client3 = new Client("Ion", null, "0729");
        Client client4 = new Client("Vlad", null, null);

//        notificatorTelefon.notificaClient(client1, "mesaj");
//        notificatorTelefon.notificaClient(client2, "mesaj");
//        notificatorTelefon.notificaClient(client3, "mesaj");
//        notificatorTelefon.notificaClient(client4, "mesaj");

        notificatorEmail.notificaClient(client1, "mesaj");
        notificatorEmail.notificaClient(client2, "mesaj");
        notificatorEmail.notificaClient(client3, "mesaj");
        notificatorEmail.notificaClient(client4, "mesaj");

    }
}
