package praktikum3PBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManajemenLayout {

    JFrame frem = new JFrame();
    JLabel label = new JLabel("");
    JLabel nama = new JLabel("Nama  ");
    JTextField isinama = new JTextField();

    //Jenis Kelamin
    JLabel jenisKelamin = new JLabel("Jenis Kelamin  ");
    JRadioButton kelamin1 = new JRadioButton("Laki - Laki");
    JRadioButton kelamin2 = new JRadioButton("Perempuan");
    ButtonGroup klikDirimu = new ButtonGroup();
    JTextField hasilKelmain = new JTextField("Pilih Jenis Kelamin Anda");

    //Agama
    JLabel agama = new JLabel("Agama  ");
    String[] pilihanAgama = {"Islam", "kristen", "Hindu", "Budha"};
    JComboBox pilihAgamamu = new JComboBox(pilihanAgama);
    JTextField hasilAgama = new JTextField("Pilih Agama Anda");

    //Matkul
    JLabel matkul = new JLabel("Mata Kuliah");
    JCheckBox algo = new JCheckBox("Algoritma");
    JCheckBox basdat = new JCheckBox("Basis Data");
    JCheckBox kalkulus = new JCheckBox("Kalkulus");
    JTextField hasilMatkul = new JTextField("Pilih Matkul Anda");


    // mouse listener
    JTextField luaskubus = new JTextField("Aku");
    JTextField luasbalok = new JTextField("Kamu");
    JTextField luaskerucut = new JTextField("Dia");
    JTextField hasil = new JTextField("ARAHKAN MOUSE KESINI");
    JTextField output = new JTextField();

    public ManajemenLayout() {

        frem.setTitle("Data Mahasiswa");

        frem.setSize(800, 700); //Menentukan Ukuran Window
        frem.setResizable(false);//Window Tidak Dapat Diperbesar
        frem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah saat window di close proses run pun ikut selesai
        frem.setVisible(true); //perintah menggunakan Window
        frem.setLayout(null); //layout null


        frem.add(label);
        label.setBounds(330, 30, 300, 10);
        frem.add(nama);
        nama.setBounds(130, 70, 300, 30); //megnatur letak "Nama "
        frem.add(isinama);
        isinama.setBounds(300, 70, 300, 30);
        isinama.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        frem.add(jenisKelamin);
        jenisKelamin.setBounds(130, 70, 300, 100); //megnatur letak "jenis kelamin "
        frem.add(kelamin1);
        kelamin1.setBounds(300, 105, 100, 30);
        frem.add(kelamin2);
        kelamin2.setBounds(400, 105, 200, 30);

        //efek button group
        klikDirimu.add(kelamin1);
        klikDirimu.add(kelamin2);
        //printah perubahan text field saat di klik salah satu
        kelamin1.addItemListener((ItemEvent event) -> {
            if (event.getSource() == kelamin1) {
                //perintah text berubah menjadi text yang di klik
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilKelmain.setText("Laki - Laki");
                }
            }
        });

        kelamin2.addItemListener((ItemEvent event) -> {
            if (event.getSource() == kelamin2) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilKelmain.setText("Perempuan");
                }
            }
        });
        frem.add(hasilKelmain);
        //mengatur letak text field
        hasilKelmain.setBounds(300,140,300,30);
        hasilKelmain.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        hasilKelmain.setEditable(false); //agar text field tdk bisa di edit

        //tampilan Agama
        frem.add(agama);
        agama.setBounds(130, 190, 300, 30);
        frem.add(pilihAgamamu);
        pilihAgamamu.setBounds(300, 190, 100, 30);
        //perintah memilih salah satu item
        pilihAgamamu.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                if (pilihAgamamu.getSelectedIndex() == 0) {
                    hasilAgama.setText("Islam");
                } else if (pilihAgamamu.getSelectedIndex() == 1) {
                    hasilAgama.setText("Kristen");
                } else if (pilihAgamamu.getSelectedIndex() == 2) {
                    hasilAgama.setText("Hindu");
                } else if (pilihAgamamu.getSelectedIndex() == 3) {
                    hasilAgama.setText("Budha");
                }
            }
        });
        frem.add(hasilAgama);
        hasilAgama.setBounds(300,230,300,30);
        hasilAgama.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        hasilAgama.setEditable(false);

        //Tampilan Matkul
        frem.add(matkul);
        matkul.setBounds(130, 290, 150, 20);
        frem.add(algo);
        algo.setBounds(300, 290, 100, 20);
        algo.addItemListener((ItemEvent event) -> {
            if(event.getSource() == algo){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilMatkul.setText("Algoritma");
                    }}

        });
        frem.add(basdat);
        basdat.setBounds(400, 290, 100, 20);
        basdat.addItemListener((ItemEvent event) -> {
            if(event.getSource() == basdat){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilMatkul.setText("Basis Data");
                    }}

        });
        frem.add(kalkulus);
        kalkulus.setBounds(500, 290, 100, 20);
        kalkulus.addItemListener((ItemEvent event) -> {
            if(event.getSource() == kalkulus){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilMatkul.setText("Kalkulus");

                    }
            }
        });
        frem.add(hasilMatkul);
        hasilMatkul.setBounds(300, 320, 300, 30);
        hasilMatkul.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        hasilMatkul.setEditable(false);

        //mostlistener
        frem.add(luaskubus);
        luaskubus.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        luaskubus.setBackground(Color.BLUE);
        luaskubus.setBounds(130, 390,100,40);
        luaskubus.setEditable(false);
        luaskubus.setHorizontalAlignment(JTextField.CENTER); // susnannya menyamping dan berada di tengan
        //perintah mostlistener
        luaskubus.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                output.setText(luaskubus.getText());}
        });

        frem.add(luasbalok);
        luasbalok.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        luasbalok.setBackground(Color.BLUE);
        luasbalok.setBounds(320, 390,100,40);
        luasbalok.setEditable(false);
        luasbalok.setHorizontalAlignment(JTextField.CENTER);
        luasbalok.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                output.setText(luasbalok.getText());}
        });

        frem.add(luaskerucut);
        luaskerucut.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        luaskerucut.setBackground(Color.BLUE);
        luaskerucut.setBounds(500, 390,100,40);
        luaskerucut.setEditable(false);
        luaskerucut.setHorizontalAlignment(JTextField.CENTER);
        luaskerucut.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                output.setText(luaskerucut.getText());}
        });

        frem.add(output);
        output.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        output.setBounds(260, 480, 218,80);
        output.setEditable(false);
        output.setHorizontalAlignment(JTextField.CENTER);
    }
}
