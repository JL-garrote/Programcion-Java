import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PesoGordo extends JFrame {
    private JTextField pesoField;
    private JButton verificarButton;

    public PesoGordo() {
        setTitle("Verificador de Peso");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        pesoField = new JTextField(10);
        verificarButton = new JButton("Verificar Peso");

        add(new JLabel("Ingresa tu peso:"));
        add(pesoField);
        add(verificarButton);

        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarPeso();
            }
        });
    }

    private void verificarPeso() {
        try {
            int peso = Integer.parseInt(pesoField.getText());
            if (peso > 100) {
                mostrarImagen();
            } else {
                JOptionPane.showMessageDialog(this, "Tu peso está bien.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido.");
        }
    }

    private void mostrarImagen() {
        JFrame imagenFrame = new JFrame("¡Gordos No!");
        imagenFrame.setSize(300, 300);
        imagenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        imagenFrame.setLayout(new BorderLayout());

        // Cargar la imagen
        ImageIcon icon = new ImageIcon("ruta/a/tu/imagen.gif"); // Cambia esta ruta
        JLabel imagenLabel = new JLabel(icon);
        imagenFrame.add(imagenLabel, BorderLayout.CENTER);

        imagenFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PesoGordo frame = new PesoGordo();
            frame.setVisible(true);
        });
    }
}
