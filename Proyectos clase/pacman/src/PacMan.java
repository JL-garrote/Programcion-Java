import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PacMan extends JPanel implements ActionListener {
    private int pacmanX = 100;
    private int pacmanY = 100;
    private int pacmanSize = 20;
    private Timer timer;

    public PacMan() {
        timer = new Timer(100, this);
        timer.start();

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                movePacMan(e.getKeyCode());
            }
        });
    }

    private void movePacMan(int key) {
        switch (key) {
            case KeyEvent.VK_UP:
                pacmanY -= 10;
                break;
            case KeyEvent.VK_DOWN:
                pacmanY += 10;
                break;
            case KeyEvent.VK_LEFT:
                pacmanX -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                pacmanX += 10;
                break;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillArc(pacmanX, pacmanY, pacmanSize, pacmanSize, 45, 270); // Dibuja Pac-Man
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac-Man");
        PacMan pacManGame = new PacMan();
        frame.add(pacManGame);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
