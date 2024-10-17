package umu.tds.appchat;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contactos {

    private JFrame frmContactos;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Contactos window = new Contactos();
                    window.frmContactos.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Contactos() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmContactos = new JFrame();
        frmContactos.setTitle("Contactos");
        frmContactos.setBounds(100, 100, 450, 300);
        frmContactos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{200, 47, 188, 0};
        gridBagLayout.rowHeights = new int[]{263, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
        frmContactos.getContentPane().setLayout(gridBagLayout);
                
                        // Panel para la primera lista y su botón
                        JPanel panelLista1 = new JPanel();
                        panelLista1.setLayout(new BoxLayout(panelLista1, BoxLayout.Y_AXIS));
                        GridBagConstraints gbc_panelLista1 = new GridBagConstraints();
                        gbc_panelLista1.fill = GridBagConstraints.BOTH;
                        gbc_panelLista1.insets = new Insets(30, 15, 30, 10);
                        gbc_panelLista1.gridx = 0;
                        gbc_panelLista1.gridy = 0;
                        frmContactos.getContentPane().add(panelLista1, gbc_panelLista1);
                        
                                JScrollPane scrollPane1 = new JScrollPane();
                                panelLista1.add(scrollPane1);
                                
                                        JList<String> list1 = new JList<String>();
                                        scrollPane1.setViewportView(list1);
                                        list1.setModel(new AbstractListModel<String>() {
                                            String[] items = new String[] { "Contacto1", "Contacto2", "Contacto3" };
                                            public int getSize() {
                                                return items.length;
                                            }
                                            public String getElementAt(int index) {
                                                return items[index];
                                            }
                                        });
                                        
                                        JPanel panel = new JPanel();
                                        panelLista1.add(panel);
                                        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
                                        
                                        JButton button1 = new JButton("Añadir Contacto");
                                        panel.add(button1);
                
                        // Panel para los botones de control (en el centro)
                        JPanel panelBotones = new JPanel();
                        GridBagConstraints gbc_panelBotones = new GridBagConstraints();
                        gbc_panelBotones.insets = new Insets(0, 0, 0, 5);
                        gbc_panelBotones.gridx = 1;
                        gbc_panelBotones.gridy = 0;
                        frmContactos.getContentPane().add(panelBotones, gbc_panelBotones);
                        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
                        
                                JButton btnNewButton = new JButton(">>");
                                btnNewButton.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent arg0) {
                                	}
                                });
                                panelBotones.add(btnNewButton);
                                
                                        JButton btnNewButton_1 = new JButton("<<");
                                        panelBotones.add(btnNewButton_1);
        
                // Panel para la segunda lista y su botón
                JPanel panelLista2 = new JPanel();
                panelLista2.setLayout(new BoxLayout(panelLista2, BoxLayout.Y_AXIS));
                GridBagConstraints gbc_panelLista2 = new GridBagConstraints();
                gbc_panelLista2.fill = GridBagConstraints.BOTH;
                gbc_panelLista2.insets = new Insets(30, 10, 30, 15);
                gbc_panelLista2.gridx = 2;
                gbc_panelLista2.gridy = 0;
                frmContactos.getContentPane().add(panelLista2, gbc_panelLista2);
                
                        JScrollPane scrollPane2 = new JScrollPane();
                        panelLista2.add(scrollPane2);
                        
                                JList<String> list2 = new JList<String>();
                                scrollPane2.setViewportView(list2);
                                list2.setModel(new AbstractListModel<String>() {
                                    String[] items = new String[] { "Contacto4", "Contacto5", "Contacto6" };
                                    public int getSize() {
                                        return items.length;
                                    }
                                    public String getElementAt(int index) {
                                        return items[index];
                                    }
                                });
                                
                                JPanel panel_1 = new JPanel();
                                panelLista2.add(panel_1);
                                panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
                                
                                JButton button2 = new JButton("Añadir Grupo");
                                panel_1.add(button2);
    }
}
