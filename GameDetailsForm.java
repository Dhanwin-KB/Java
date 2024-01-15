import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class GameDetailsForm extends JFrame 
{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTitle;
    private JTextField txtGenre;
    private JTextField txtReleaseYear;
    private JTextField txtPlatform;

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                try {
                    GameDetailsForm frame = new GameDetailsForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GameDetailsForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 395);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Title");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBounds(24, 38, 59, 25);
        contentPane.add(lblTitle);

        JLabel lblGenre = new JLabel("Genre");
        lblGenre.setForeground(Color.WHITE);
        lblGenre.setBounds(24, 73, 45, 13);
        contentPane.add(lblGenre);

        JLabel lblReleaseYear = new JLabel("Release Year");
        lblReleaseYear.setForeground(Color.WHITE);
        lblReleaseYear.setBounds(24, 106, 90, 13);
        contentPane.add(lblReleaseYear);

        JLabel lblPlatform = new JLabel("Platform");
        lblPlatform.setForeground(Color.WHITE);
        lblPlatform.setBounds(24, 139, 59, 13);
        contentPane.add(lblPlatform);

        txtTitle = new JTextField();
        txtTitle.setBounds(140, 41, 96, 19);
        contentPane.add(txtTitle);
        txtTitle.setColumns(10);

        txtGenre = new JTextField();
        txtGenre.setBounds(140, 70, 96, 19);
        contentPane.add(txtGenre);
        txtGenre.setColumns(10);

        txtReleaseYear = new JTextField();
        txtReleaseYear.setBounds(140, 103, 96, 19);
        contentPane.add(txtReleaseYear);
        txtReleaseYear.setColumns(10);

        txtPlatform = new JTextField();
        txtPlatform.setBounds(140, 136, 96, 19);
        contentPane.add(txtPlatform);
        txtPlatform.setColumns(10);

        JButton addGameButton = new JButton("Add Game");
        addGameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games_library", "root", "");
                    String query = "insert into games_details values(?,?,?,?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, txtTitle.getText());
                    ps.setString(2, txtGenre.getText());
                    ps.setInt(3, Integer.parseInt(txtReleaseYear.getText()));
                    ps.setString(4, txtPlatform.getText());

                    int i = ps.executeUpdate();
                    JOptionPane.showMessageDialog(addGameButton, i + " Record has been added successfully");
                    ps.close();
                    con.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        addGameButton.setBounds(97, 180, 120, 21);
        contentPane.add(addGameButton);

        JButton resetBtn = new JButton("Reset");
        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtTitle.setText("");
                txtGenre.setText("");
                txtReleaseYear.setText("");
                txtPlatform.setText("");
            }
        });
        resetBtn.setBounds(240, 180, 85, 21);
        contentPane.add(resetBtn);

        JLabel lblNewLabel_6 = new JLabel("Game Details");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setBounds(168, 10, 109, 13);
        contentPane.add(lblNewLabel_6);
    }
}
