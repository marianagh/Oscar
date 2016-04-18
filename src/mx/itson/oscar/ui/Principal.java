package mx.itson.oscar.ui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import com.toedter.calendar.JCalendar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SpinnerListModel;


@SuppressWarnings("serial")
public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	static JPanel panelContenedores = new JPanel();
	static JPanel panelReportes = new JPanel();

	JPanel panelInicio = new JPanel();
	private JTable table_2;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					panelContenedores.setVisible(false);
					panelReportes.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("EasyRep");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panelReportes.setBounds(12, 43, 852, 530);
		contentPane.add(panelReportes);
		panelReportes.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "A\u00F1adir Movimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 0, 842, 238);
		panelReportes.add(panel_1);
		
		JButton button_3 = new JButton("Guardar");
		button_3.setBounds(52, 191, 105, 23);
		panel_1.add(button_3);
		
		JLabel label_3 = new JLabel("Contenedor");
		label_3.setBounds(21, 29, 77, 14);
		panel_1.add(label_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"ASDBGD135365X", "AGSFSVA52515A", "DPQNLK63854A"}));
		spinner.setBounds(132, 26, 174, 20);
		panel_1.add(spinner);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(531, 42, 257, 185);
		panel_1.add(calendar_1);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.setBounds(181, 191, 104, 23);
		panel_1.add(button_4);
		
		JLabel label_4 = new JLabel("Tipo de Movimiento");
		label_4.setBounds(23, 64, 150, 14);
		panel_1.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(132, 61, 174, 20);
		panel_1.add(comboBox);
		
		JLabel label_5 = new JLabel("Fecha del Movimiento");
		label_5.setBounds(531, 17, 150, 14);
		panel_1.add(label_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Movimientos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(0, 238, 841, 281);
		panelReportes.add(panel_2);
		
		table_2 = new JTable();
		table_2.setBounds(10, 72, 811, 159);
		panel_2.add(table_2);
		
		JButton button_5 = new JButton("Borrar");
		button_5.setBounds(569, 24, 89, 23);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("Editar");
		button_6.setBounds(682, 24, 89, 23);
		panel_2.add(button_6);
		
		JLabel label_6 = new JLabel("Buscar");
		label_6.setBounds(20, 28, 56, 14);
		panel_2.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 25, 214, 20);
		panel_2.add(textField_2);
		
		JButton button_7 = new JButton("Guardar Reporte");
		button_7.setBounds(569, 244, 113, 23);
		panel_2.add(button_7);
		
		panelInicio.setBounds(33, 72, 831, 478);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(507, 11, 278, 211);
		panelInicio.add(calendar);
		
		table = new JTable();
		table.setBorder(new TitledBorder(null, "Historial de Reportes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Exportado"
			}
		));
		table.setBounds(10, 11, 463, 456);
		panelInicio.add(table);
		
		JButton btnNuevoReporte = new JButton("Nuevo Reporte");
		btnNuevoReporte.setBounds(507, 251, 105, 23);
		panelInicio.add(btnNuevoReporte);
		
		JButton btnExportar = new JButton("Exportar ");
		btnExportar.setBounds(507, 295, 105, 23);
		panelInicio.add(btnExportar);
		
		JButton btnNewButton = new JButton("Contenedores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelContenedores.setVisible(true);
				panelInicio.setVisible(false);
			}
		});
		btnNewButton.setBounds(639, 251, 105, 23);
		panelInicio.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(12, 11, 852, 21);
		contentPane.add(menuBar);

		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmInicio = new JMenuItem("Inicio");
		mntmInicio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				panelContenedores.setVisible(false);	
				panelInicio.setVisible(true);
				panelReportes.setVisible(false);
				
			}
	});
		mnNewMenu.add(mntmInicio);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
		
		JMenu mnContenedores = new JMenu("Contenedores");
		menuBar.add(mnContenedores);
		
		JMenuItem mntmAgregarContenedor = new JMenuItem("Agregar nuevo");
		mntmAgregarContenedor.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					panelContenedores.setVisible(true);	
					panelInicio.setVisible(false);
					panelReportes.setVisible(false);
					
				}
		});
		mnContenedores.add(mntmAgregarContenedor);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmNuevoReporte = new JMenuItem("Nuevo Reporte");
		mntmNuevoReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				panelContenedores.setVisible(false);	
				panelInicio.setVisible(false);
				panelReportes.setVisible(true);
				
			}
		} );
		mnReportes.add(mntmNuevoReporte);
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mnReportes.add(mntmExportar);
		
		
		panelContenedores.setBounds(10, 53, 831, 496);
		contentPane.add(panelContenedores);
		panelContenedores.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 126, 811, 342);
		panelContenedores.add(table_1);
		
		JButton button = new JButton("Borrar");
		button.setBounds(574, 92, 89, 23);
		panelContenedores.add(button);
		
		JButton button_1 = new JButton("Editar");
		button_1.setBounds(687, 92, 89, 23);
		panelContenedores.add(button_1);
		
		JLabel label = new JLabel("Buscar");
		label.setBounds(25, 96, 56, 14);
		panelContenedores.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(68, 93, 214, 20);
		panelContenedores.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 31, 214, 20);
		panelContenedores.add(textField_1);
		
		JLabel label_1 = new JLabel("N\u00FAmero de Serie");
		label_1.setBounds(37, 34, 105, 14);
		panelContenedores.add(label_1);
		
		JButton button_2 = new JButton("Guardar");
		button_2.setBounds(388, 30, 89, 23);
		panelContenedores.add(button_2);
		
		JLabel label_2 = new JLabel("Contenedores");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(10, -12, 195, 48);
		panelContenedores.add(label_2);
	}
	
}
