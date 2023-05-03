package observer.clase;

public interface Subject {
    void adaugareObserver(Observer observer);
    void stergereObserver(Observer observer);
    void notificareABonati(String mesaj);
}
