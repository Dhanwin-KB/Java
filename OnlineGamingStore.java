import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class OnlineGamingStore extends JFrame implements ActionListener 
{
	private JComboBox<String> gameList;
	private JButton purchaseButton;
	private JTextArea consoleTextArea;
	private JMenuBar menuBar;
	private JMenu fileMenu, helpMenu;
	private JMenuItem openItem, saveItem, exitItem, aboutItem;
	public OnlineGamingStore() 
	{
        	setTitle("Online Gaming Store");
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	gameList = new JComboBox<>(new String[]{"Assassin's Creed Valhalla", "FIFA 22", "Cyberpunk 2077", "Minecraft", "The Legend of Zelda: Breath of the Wild"});
        	purchaseButton = new JButton("Purchase Game");
        	purchaseButton.addActionListener(this);
        	consoleTextArea = new JTextArea();
        	consoleTextArea.setEditable(false);
        	JScrollPane consoleScrollPane = new JScrollPane(consoleTextArea);
        	menuBar = new JMenuBar();
        	fileMenu = new JMenu("File");
        	helpMenu = new JMenu("Help");
        	openItem = new JMenuItem("Open");
        	saveItem = new JMenuItem("Save as");
        	exitItem = new JMenuItem("Exit");
        	aboutItem = new JMenuItem("About");
        	fileMenu.add(openItem);
        	fileMenu.add(saveItem);
        	fileMenu.add(exitItem);
        	helpMenu.add(aboutItem);
        	menuBar.add(fileMenu);
        	menuBar.add(helpMenu);
        	JPanel topPanel = new JPanel();
        	topPanel.add(new JLabel("Select a game to purchase:"));
        	topPanel.add(gameList);
        	JPanel buttonPanel = new JPanel();
        	buttonPanel.add(purchaseButton);
        	JPanel mainPanel = new JPanel(new BorderLayout());
        	mainPanel.add(topPanel, BorderLayout.NORTH);
        	mainPanel.add(buttonPanel, BorderLayout.WEST);
        	mainPanel.add(consoleScrollPane, BorderLayout.CENTER);
        	setJMenuBar(menuBar);
        	add(mainPanel);
        	pack();
        	setLocationRelativeTo(null);
        	setVisible(true);
	}
    	public void actionPerformed(ActionEvent e) 
	{
        	if (e.getSource() == purchaseButton) 
		{
			String selectedGame = (String) gameList.getSelectedItem();
			if (selectedGame != null) 
			{
				consoleTextArea.append("Game Purchased: " + selectedGame + "\n");
				purchaseButton.setEnabled(false);
			} 
			else 
			{
				consoleTextArea.append("Please select a game before purchasing.\n");
			}
        	}
	}
	public static void main(String[] args) 
	{
		new OnlineGamingStore();
	}
}
