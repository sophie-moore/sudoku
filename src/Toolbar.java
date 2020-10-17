import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private TextPanel textPanel;
	
	public Toolbar() {
		helloButton = new JButton("hello");
		helloButton.addActionListener(this);
		add(helloButton);
		
		goodbyeButton = new JButton("bye");
		goodbyeButton.addActionListener(this);
		add(goodbyeButton);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		
	}

	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if( clicked == helloButton) {
			textPanel.appendText("hello\n");
		} else if(clicked == goodbyeButton) {
			textPanel.appendText("good bye\n");
		}
		
	}

}
