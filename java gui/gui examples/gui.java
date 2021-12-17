import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);//Pencere Görünürlüğü
        frame.setTitle("Example Gui");// Pencere Başlığı
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);// Pencere Boyutu
        frame.setIconImage(new ImageIcon("gui resources/example.png").getImage());//Pencere İkonu/Görseli
    }
}
