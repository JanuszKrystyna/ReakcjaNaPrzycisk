import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReakcjaNaPrzycisk {

    public static void main(String[] args) {
        JFrame ramka = new JFrame("Kreator Powitań");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Deklaracja komponentów
        JTextField poleImie = new JTextField(15);
        JButton przyciskPowitania = new JButton("Wyślij Powitanie");
        JLabel etykietaWynik = new JLabel("Czekam na imię...");
        JLabel twojeImie = new JLabel("Twoje imię:");

        // Konfiguracja panelu
        JPanel panel = new JPanel();
        panel.add(twojeImie);
        panel.add(poleImie);
        panel.add(przyciskPowitania);
        panel.add(etykietaWynik);

        // DEFINIOWANIE SŁUCHACZA ZDARZEŃ
        przyciskPowitania.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ta metoda zostanie wywołana po kliknięciu przycisku.

                // Pobranie tekstu z pola (Getter)
                String imie = poleImie.getText();

                // Ustawienie nowego tekstu w etykiecie (Setter)
                etykietaWynik.setText("Witaj, " + imie + "!");

                // Opcjonalnie: wyczyszczenie pola po wysłaniu
                poleImie.setText("");
            }
        });

        ramka.add(panel);
        ramka.pack();
        ramka.setLocationRelativeTo(null);
        ramka.setVisible(true);
    }
}