import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    String bilangan = "";  
    double jumlah, bil1, bil2;
    int pilih;

    JTextField txt_hasil;

    public Kalkulator() {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Inisialisasi JTextField
        txt_hasil = new JTextField();
        txt_hasil.setEditable(false);  
        txt_hasil.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(txt_hasil, BorderLayout.NORTH);  
        
        // Membuat panel untuk tombol-tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));  

        // Membuat tombol-tombol angka dan operasi
        JButton btn_0 = new JButton("0");
        JButton btn_1 = new JButton("1");
        JButton btn_2 = new JButton("2");
        JButton btn_3 = new JButton("3");
        JButton btn_4 = new JButton("4");
        JButton btn_5 = new JButton("5");
        JButton btn_6 = new JButton("6");
        JButton btn_7 = new JButton("7");
        JButton btn_8 = new JButton("8");
        JButton btn_9 = new JButton("9");
        JButton btn_tambah = new JButton("+");
        JButton btn_kurang = new JButton("-");
        JButton btn_kali = new JButton("*");
        JButton btn_bagi = new JButton("/");
        JButton btn_hasil = new JButton("=");
        JButton btn_clear = new JButton("C");

        // Menambahkan tombol-tombol ke panel
        panel.add(btn_7); panel.add(btn_8); panel.add(btn_9); panel.add(btn_bagi);
        panel.add(btn_4); panel.add(btn_5); panel.add(btn_6); panel.add(btn_kali);
        panel.add(btn_1); panel.add(btn_2); panel.add(btn_3); panel.add(btn_kurang);
        panel.add(btn_clear); panel.add(btn_0); panel.add(btn_hasil); panel.add(btn_tambah);

        // Menambahkan panel tombol ke frame
        frame.add(panel, BorderLayout.CENTER);

        // Menambahkan action listener untuk setiap tombol
        btn_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "0";
                txt_hasil.setText(bilangan);
            }
        });

        btn_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "1";
                txt_hasil.setText(bilangan);
            }
        });

        btn_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "2";
                txt_hasil.setText(bilangan);
            }
        });

        btn_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "3";
                txt_hasil.setText(bilangan);
            }
        });

        btn_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "4";
                txt_hasil.setText(bilangan);
            }
        });

        btn_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "5";
                txt_hasil.setText(bilangan);
            }
        });

        btn_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "6";
                txt_hasil.setText(bilangan);
            }
        });

        btn_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "7";
                txt_hasil.setText(bilangan);
            }
        });

        btn_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "8";
                txt_hasil.setText(bilangan);
            }
        });

        btn_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan += "9";
                txt_hasil.setText(bilangan);
            }
        });

        btn_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                txt_hasil.setText(bilangan);
            }
        });

        btn_tambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bil1 = Double.parseDouble(bilangan);
                pilih = 1;  // Tanda operasi tambah
                bilangan = "";
                txt_hasil.setText("+");
            }
        });

        btn_kurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bil1 = Double.parseDouble(bilangan);
                pilih = 2;  // Tanda operasi kurang
                bilangan = "";
                txt_hasil.setText("-");
            }
        });

        btn_kali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bil1 = Double.parseDouble(bilangan);
                pilih = 3;  // Tanda operasi kali
                bilangan = "";
                txt_hasil.setText("*");
            }
        });

        btn_bagi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bil1 = Double.parseDouble(bilangan);
                pilih = 4;  // Tanda operasi bagi
                bilangan = "";
                txt_hasil.setText("/");
            }
        });

        btn_hasil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bil2 = Double.parseDouble(bilangan);
                switch (pilih) {
                    case 1:
                        jumlah = bil1 + bil2;
                        break;
                    case 2:
                        jumlah = bil1 - bil2;
                        break;
                    case 3:
                        jumlah = bil1 * bil2;
                        break;
                    case 4:
                        jumlah = bil1 / bil2;
                        break;
                }
                bilangan = Double.toString(jumlah);
                txt_hasil.setText(bilangan);
            }
        });

        // Set frame visible
        frame.setVisible(true);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        new Kalkulator();
    }
}
