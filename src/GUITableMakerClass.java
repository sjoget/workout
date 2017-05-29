import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUITableMakerClass extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//public class SimpleTableDemo extends JPanel {
private JComboBox combobox;

    public GUITableMakerClass() {
    	
        super(new GridLayout(1,0));

        String[] columnNames = {"Antal sekunder intervall",
                "Antal sekunder vila",
                "Antal reps",
                "Total tid"};
                
        Object[][] data = {
	    {new Integer(1), new Integer(2),
	    	new Integer(3), new Integer(4)}
        };

        //        Object[][] data = {
//	    {new Integer(1), new Integer(2),
//	    	new Integer(3), new Integer(4)}
//        };

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }

    public static void createAndShowGUI() {
        JFrame tableFrame = new JFrame("Tabell");
        tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUITableMakerClass newContentPane = new GUITableMakerClass();
        newContentPane.setOpaque(true); 
        tableFrame.setContentPane(newContentPane);

        tableFrame.pack();
        tableFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
