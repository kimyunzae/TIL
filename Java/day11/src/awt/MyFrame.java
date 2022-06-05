package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame {
	Frame f; 
	Button b;
	
	public MyFrame() {
		f = new Frame("My Frame");
		b = new Button("Click");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	//버튼 클릭 후 여기서 처리
				b.setLabel("Clicked");
				
			}
		});
		
	}
	
	public void setView() {
		f.add(b, "North");
		f.setSize(300, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {	//anonymous class
				System.exit(0);
			}
			
		
		});
		
		
	}
}
