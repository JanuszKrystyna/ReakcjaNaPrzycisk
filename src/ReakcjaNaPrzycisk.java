import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ReakcjaNaPrzycisk {

    public static void main(String[] args) {
        JFrame ramka = new JFrame("Kreator Powitań");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Deklaracja komponentów
        JTextField poleImie = new JTextField(15);
        JButton przyciskPowitania = new JButton("Wyślij Powitanie");
        JButton przyciskPozegnania = new JButton("Wyślij Pożegnanie");
        JLabel etykietaWynik = new JLabel("Czekam na imię...");
        JLabel twojeImie = new JLabel("Twoje imię:");

        // Konfiguracja panelu
        JPanel panel = new JPanel();
        panel.add(twojeImie);
        panel.add(poleImie);
        panel.add(przyciskPowitania);
        panel.add(przyciskPozegnania);
        panel.add(etykietaWynik);

        twojeImie.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                poleImie.setText("Basia");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        // DEFINIOWANIE SŁUCHACZA ZDARZEŃ
        ActionListener sluchacz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //pobieram wpisany w polu poleImie tekst
                String imie = poleImie.getText();
                //Tworzę powitanie
                String wyswietlanyTekst = "";
                if(e.getActionCommand().equals("Wyślij Powitanie")) {
                    wyswietlanyTekst = "Witaj " + imie;
                }else{
                    wyswietlanyTekst = "Żegnaj " + imie;
                }
                //Ustawiam w polu etykietaWynik przygotowane powitanie
                etykietaWynik.setText(wyswietlanyTekst);
            }
        };

        przyciskPowitania.addActionListener(sluchacz);
        przyciskPozegnania.addActionListener(sluchacz);

/*
        przyciskPowitania.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pobieram wpisany w polu poleImie tekst
                String imie = poleImie.getText();
                //Tworzę powitanie
                String wyswietlanyTekst = "Witaj " + imie;
                //Ustawiam w polu etykietaWynik przygotowane powitanie
                etykietaWynik.setText(wyswietlanyTekst);
            }
        });

        przyciskPozegnania.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pobieram wpisany w polu poleImie tekst
                String imie = poleImie.getText();
                //Tworzę powitanie
                String wyswietlanyTekst = "Witaj " + imie;
                //Ustawiam w polu etykietaWynik przygotowane powitanie
                etykietaWynik.setText(wyswietlanyTekst);
            }
        });
*/


        ramka.add(panel);
        ramka.pack();
        ramka.setLocationRelativeTo(null);
        ramka.setVisible(true);
    }
}